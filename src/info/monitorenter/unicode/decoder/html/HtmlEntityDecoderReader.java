/*
 * HtmlEntityDecoderReader.java, <purpose>
 *
 * Copyright 2007 (C) Achim Westermann, 
 * created on 12.05.2007 16:57:04.
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 * 
 * The contents of this collection are subject to the Mozilla Public License Version 
 * 1.1 (the "License"); you may not use this file except in compliance with 
 * the License. You may obtain a copy of the License at 
 * http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 * 
 * The Original Code is the cpDetector code in [sub] packages info.monitorenter and 
 * cpdetector. 
 * 
 * The Initial Developer of the Original Code is
 * Achim Westermann <achim.westermann@gmx.de>.
 * 
 * Portions created by the Initial Developer are Copyright (C) 2006 
 * the Initial Developer. All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 * 
 * ***** END LICENSE BLOCK *****
 *
 * If you modify or optimize the code in a useful way please let me know.
 * Achim.Westermann@gmx.de
 *
 */
package info.monitorenter.unicode.decoder.html;

import java.io.IOException;
import java.io.Reader;

import antlr.CharScanner;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStreamException;

/**
 * Decorates the given <code>{@link Reader}</code> with the support for html
 * entity decoding.
 * <p>
 * This is a stream based approach that will not cause memory problems when
 * handling a huge amount of data.
 * <p>
 * 
 * HTML entities are described in <a
 * href="http://www.w3.org/TR/html401/sgml/entities.html">
 * http://www.w3.org/TR/html401/sgml/entities.html</a>
 * <p>
 * 
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public class HtmlEntityDecoderReader
    extends Reader {

  /** The decorated reader. */
  private Reader m_decorated;

  /**
   * Stores the remaining characters from the last token obtained from the lexer
   * if <code>{@link #read(char[], int, int)}</code> did no have space for all
   * characters.
   * <p>
   */
  private char[] m_lastTokenRemainder;

  /** The lexer identifying the HTML Entity tokens to replace. */
  private HtmlEntityDecoder m_parser;

  /**
   * Creates an instance that decorates the given reader.
   * <p>
   * 
   * @param decorate
   *          the reader to enrich by the feature of HTML Entity decoding.
   */
  public HtmlEntityDecoderReader(final Reader decorate) {
    this.m_decorated = decorate;
    CharScanner lexer = new HtmlEntityLexer(decorate);
    this.m_parser = new HtmlEntityDecoder(lexer);
  }

  /**
   * @see java.io.Reader#close()
   */
  public void close() throws IOException {
    this.m_decorated.close();
    this.m_parser.getInputState().reset();
  }

  /**
   * @see java.io.Reader#read(char[], int, int)
   */
  public int read(final char[] cbuf, final int off, final int len) throws IOException {
    int result = 0;
    int targetIndex = off;
    // first return the remainders of the previous token:
    if (this.m_lastTokenRemainder != null) {
      for (; result < len && result < this.m_lastTokenRemainder.length; result++, targetIndex++) {
        cbuf[targetIndex] = this.m_lastTokenRemainder[result];
      }
    }
    try {
      Token token = this.m_parser.decodeNext();
      char[] text;
      // consume more than one token if needed:
      while (result < len && token.getType() != Token.EOF_TYPE) {
        if (token.getType() == Token.EOF_TYPE) {
          this.m_lastTokenRemainder = new char[0];
        } else {
          text = token.getText().toCharArray();
          int tokenIndex = 0;
          for (; tokenIndex < text.length && result < len; tokenIndex++, result++, targetIndex++) {
            cbuf[targetIndex] = text[tokenIndex];
          }
          // fill remaining text for next operation in case token was
          // longer than text needed:
          if (result == len && text.length > tokenIndex) {
            char[] tail = new char[text.length - tokenIndex];
            for (int i = 0; i < tail.length; i++, tokenIndex++) {
              tail[i] = text[tokenIndex];
            }
          }
        }
        // only look for further tokens if more should be read:
        if (result < len) {
          token = this.m_parser.decodeNext();
        }
      }
      return result;
    } catch (RecognitionException rce) {
      // this should never happen as the underlying lexer grammar accepts
      // any character.
      IOException ioex = new IOException("Unexpected parser problem.");
      ioex.initCause(rce);
      throw ioex;
    } catch (TokenStreamException tse) {
      // this should never happen as the underlying lexer grammar accepts
      // any character.
      IOException ioex = new IOException("Unexpected lexer problem.");
      ioex.initCause(tse);
      throw ioex;

    }
  }
}
