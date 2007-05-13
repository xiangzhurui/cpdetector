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
package cpdetector.io.html;

import java.io.IOException;
import java.io.Reader;

import antlr.Token;
import antlr.TokenStreamException;

import cpdetector.html.parser.HtmlEntityDecoderTokenTypes;
import cpdetector.html.parser.HtmlEntityLexer;

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
  private HtmlEntityLexer m_lexer;

  /**
   * Creates an instance that decorates the given reader.
   * <p>
   * 
   * @param decorate
   *          the reader to enrich by the feature of HTML Entity decoding.
   */
  public HtmlEntityDecoderReader(final Reader decorate) {
    this.m_decorated = decorate;
    this.m_lexer = new HtmlEntityLexer(decorate);
  }

  /**
   * @see java.io.Reader#close()
   */
  public void close() throws IOException {
    this.m_decorated.close();
    this.m_lexer.resetText();
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
      Token token = this.m_lexer.nextToken();
      char[] text;
      // consume more than one token if needed:
      while (result < len && token.getType() != Token.EOF_TYPE) {
        if (token.getType() == Token.EOF_TYPE) {
          this.m_lastTokenRemainder = new char[0];
        } else {
          text = getDecodedEntity(token).toCharArray();
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
          token = this.m_lexer.nextToken();
        }
      }
      return result;
    } catch (TokenStreamException tse) {
      // this should never happen as the underlying lexer grammar accepts
      // any character.
      IOException ioex = new IOException("Unexpected lexer problem.");
      ioex.initCause(tse);
      throw ioex;
    }

  }

  /**
   * Returns the decoded unicode character for the text of the given token or
   * the token text itself for the special ANY_CHAR token which matches non HTML
   * Entity text.
   * <p>
   * 
   * @param token
   *          the token to decode.
   * 
   * @return the decoded unicode character for the text of the given token or
   *         the token text itself for the special ANY_CHAR token which matches
   *         non HTML Entity text.
   */
  private static String getDecodedEntity(final Token token) {
    String result = "";
    switch (token.getType()) {
      case HtmlEntityDecoderTokenTypes.NBSP:
        result += '\u00A0';
        break;
      case HtmlEntityDecoderTokenTypes.IEXCL:
        result += '\u00A1';
        break;
      case HtmlEntityDecoderTokenTypes.CENT:
        result += '\u00A2';
        break;
      case HtmlEntityDecoderTokenTypes.POUND:
        result += '\u00A3';
        break;
      case HtmlEntityDecoderTokenTypes.CURREN:
        result += '\u00A4';
        break;
      case HtmlEntityDecoderTokenTypes.YEN:
        result += '\u00A5';
        break;
      case HtmlEntityDecoderTokenTypes.BRVBAR:
        result += '\u00A6';
        break;
      case HtmlEntityDecoderTokenTypes.SECT:
        result += '\u00A7';
        break;
      case HtmlEntityDecoderTokenTypes.UML:
        result += '\u00A8';
        break;
      case HtmlEntityDecoderTokenTypes.COPY:
        result += '\u00A9';
        break;
      case HtmlEntityDecoderTokenTypes.ORDF:
        result += '\u00AA';
        break;
      case HtmlEntityDecoderTokenTypes.LAQUO:
        result += '\u00AB';
        break;
      case HtmlEntityDecoderTokenTypes.NOT:
        result += '\u00AC';
        break;
      case HtmlEntityDecoderTokenTypes.SHY:
        result += '\u00AD';
        break;
      case HtmlEntityDecoderTokenTypes.REG:
        result += '\u00AE';
        break;
      case HtmlEntityDecoderTokenTypes.MACR:
        result += '\u00AF';
        break;
      case HtmlEntityDecoderTokenTypes.DEG:
        result += '\u00B0';
        break;
      case HtmlEntityDecoderTokenTypes.PLUSMN:
        result += '\u00B1';
        break;
      case HtmlEntityDecoderTokenTypes.SUP2:
        result += '\u00B2';
        break;
      case HtmlEntityDecoderTokenTypes.SUP3:
        result += '\u00B3';
        break;
      case HtmlEntityDecoderTokenTypes.ACUTE:
        result += '\u00B4';
        break;
      case HtmlEntityDecoderTokenTypes.MICRO:
        result += '\u00B5';
        break;
      case HtmlEntityDecoderTokenTypes.PARA:
        result += '\u00B6';
        break;
      case HtmlEntityDecoderTokenTypes.MIDDOT:
        result += '\u00B7';
        break;
      case HtmlEntityDecoderTokenTypes.CEDIL:
        result += '\u00B8';
        break;
      case HtmlEntityDecoderTokenTypes.SUP1:
        result += '\u00B9';
        break;
      case HtmlEntityDecoderTokenTypes.ORDM:
        result += '\u00BA';
        break;
      case HtmlEntityDecoderTokenTypes.RAQUO:
        result += '\u00BB';
        break;
      case HtmlEntityDecoderTokenTypes.FRAC14:
        result += '\u00BC';
        break;
      case HtmlEntityDecoderTokenTypes.FRAC12:
        result += '\u00BD';
        break;
      case HtmlEntityDecoderTokenTypes.FRAC34:
        result += '\u00BE';
        break;
      case HtmlEntityDecoderTokenTypes.IQUEST:
        result += '\u00BF';
        break;
      case HtmlEntityDecoderTokenTypes.AGRAVE:
        result += '\u00C0';
        break;
      case HtmlEntityDecoderTokenTypes.AACUTE:
        result += '\u00C1';
        break;
      case HtmlEntityDecoderTokenTypes.ACIRC:
        result += '\u00C2';
        break;
      case HtmlEntityDecoderTokenTypes.ATILDE:
        result += '\u00C3';
        break;
      case HtmlEntityDecoderTokenTypes.AUML:
        result += '\u00C4';
        break;
      case HtmlEntityDecoderTokenTypes.ARING:
        result += '\u00C5';
        break;
      case HtmlEntityDecoderTokenTypes.AELIG:
        result += '\u00C6';
        break;
      case HtmlEntityDecoderTokenTypes.CCEDIL:
        result += '\u00C7';
        break;
      case HtmlEntityDecoderTokenTypes.EGRAVE:
        result += '\u00C8';
        break;
      case HtmlEntityDecoderTokenTypes.EACUTE:
        result += '\u00C9';
        break;
      case HtmlEntityDecoderTokenTypes.ECIRC:
        result += '\u00CA';
        break;
      case HtmlEntityDecoderTokenTypes.EUML:
        result += '\u00CB';
        break;
      case HtmlEntityDecoderTokenTypes.IGRAVE:
        result += '\u00CC';
        break;
      case HtmlEntityDecoderTokenTypes.IACUTE:
        result += '\u00CD';
        break;
      case HtmlEntityDecoderTokenTypes.ICIRC:
        result += '\u00CE';
        break;
      case HtmlEntityDecoderTokenTypes.IUML:
        result += '\u00CF';
        break;
      case HtmlEntityDecoderTokenTypes.ETH:
        result += '\u00D0';
        break;
      case HtmlEntityDecoderTokenTypes.NTILDE:
        result += '\u00D1';
        break;
      case HtmlEntityDecoderTokenTypes.OGRAVE:
        result += '\u00D2';
        break;
      case HtmlEntityDecoderTokenTypes.OACUTE:
        result += '\u00D3';
        break;
      case HtmlEntityDecoderTokenTypes.OCIRC:
        result += '\u00D4';
        break;
      case HtmlEntityDecoderTokenTypes.OTILDE:
        result += '\u00D5';
        break;
      case HtmlEntityDecoderTokenTypes.OUML:
        result += '\u00D6';
        break;
      case HtmlEntityDecoderTokenTypes.TIMES:
        result += '\u00D7';
        break;
      case HtmlEntityDecoderTokenTypes.OSLASH:
        result += '\u00D8';
        break;
      case HtmlEntityDecoderTokenTypes.UGRAVE:
        result += '\u00D9';
        break;
      case HtmlEntityDecoderTokenTypes.UACUTE:
        result += '\u00DA';
        break;
      case HtmlEntityDecoderTokenTypes.UCIRC:
        result += '\u00DB';
        break;
      case HtmlEntityDecoderTokenTypes.UUML:
        result += '\u00DC';
        break;
      case HtmlEntityDecoderTokenTypes.YACUTE:
        result += '\u00DD';
        break;
      case HtmlEntityDecoderTokenTypes.THORN:
        result += '\u00DE';
        break;
      case HtmlEntityDecoderTokenTypes.SZLIG:
        result += '\u00DF';
        break;
      case HtmlEntityDecoderTokenTypes.AGRAVE_LC:
        result += '\u00E0';
        break;
      case HtmlEntityDecoderTokenTypes.AACUTE_LC:
        result += '\u00E1';
        break;
      case HtmlEntityDecoderTokenTypes.ACIRC_LC:
        result += '\u00E2';
        break;
      case HtmlEntityDecoderTokenTypes.ATILDE_LC:
        result += '\u00E3';
        break;
      case HtmlEntityDecoderTokenTypes.AUML_LC:
        result += '\u00E4';
        break;
      case HtmlEntityDecoderTokenTypes.ARING_LC:
        result += '\u00E5';
        break;
      case HtmlEntityDecoderTokenTypes.AELIG_LC:
        result += '\u00E6';
        break;
      case HtmlEntityDecoderTokenTypes.CCEDIL_LC:
        result += '\u00E7';
        break;
      case HtmlEntityDecoderTokenTypes.EGRAVE_LC:
        result += '\u00E8';
        break;
      case HtmlEntityDecoderTokenTypes.EACUTE_LC:
        result += '\u00E9';
        break;
      case HtmlEntityDecoderTokenTypes.ECIRC_LC:
        result += '\u00EA';
        break;
      case HtmlEntityDecoderTokenTypes.EUML_LC:
        result += '\u00EB';
        break;
      case HtmlEntityDecoderTokenTypes.IGRAVE_LC:
        result += '\u00EC';
        break;
      case HtmlEntityDecoderTokenTypes.IACUTE_LC:
        result += '\u00ED';
        break;
      case HtmlEntityDecoderTokenTypes.ICIRC_LC:
        result += '\u00EE';
        break;
      case HtmlEntityDecoderTokenTypes.IUML_LC:
        result += '\u00EF';
        break;
      case HtmlEntityDecoderTokenTypes.ETH_LC:
        result += '\u00F0';
        break;
      case HtmlEntityDecoderTokenTypes.NTILDE_LC:
        result += '\u00F1';
        break;
      case HtmlEntityDecoderTokenTypes.OGRAVE_LC:
        result += '\u00F2';
        break;
      case HtmlEntityDecoderTokenTypes.OACUTE_LC:
        result += '\u00F3';
        break;
      case HtmlEntityDecoderTokenTypes.OCIRC_LC:
        result += '\u00F4';
        break;
      case HtmlEntityDecoderTokenTypes.OTILDE_LC:
        result += '\u00F5';
        break;
      case HtmlEntityDecoderTokenTypes.OUML_LC:
        result += '\u00F6';
        break;
      case HtmlEntityDecoderTokenTypes.DIVIDE:
        result += '\u00F7';
        break;
      case HtmlEntityDecoderTokenTypes.OSLASH_LC:
        result += '\u00F8';
        break;
      case HtmlEntityDecoderTokenTypes.UGRAVE_LC:
        result += '\u00F9';
        break;
      case HtmlEntityDecoderTokenTypes.UACUTE_LC:
        result += '\u00FA';
        break;
      case HtmlEntityDecoderTokenTypes.UCIRC_LC:
        result += '\u00FB';
        break;
      case HtmlEntityDecoderTokenTypes.UUML_LC:
        result += '\u00FC';
        break;
      case HtmlEntityDecoderTokenTypes.YACUTE_LC:
        result += '\u00FD';
        break;
      case HtmlEntityDecoderTokenTypes.THORN_LC:
        result += '\u00FE';
        break;
      case HtmlEntityDecoderTokenTypes.YUML_LC:
        result += '\u00FF';
        break;
      case HtmlEntityDecoderTokenTypes.ANY_CHAR:
      default:
        result = token.getText();
        break;
    }
    return result;
  }
}
