/*
 * DecodeUtils.java, <purpose>
 *
 * Copyright 2007 (C) Achim Westermann, 
 * created on 12.05.2007 14:51:43.
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
package info.monitorenter.unicode.decoder;


import info.monitorenter.unicode.decoder.html.HtmlEntityDecoder;
import info.monitorenter.unicode.decoder.html.HtmlEntityLexer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import antlr.RecognitionException;
import antlr.TokenStreamException;

/**
 * Easy to use utility functions with scope on decoding to unicode.
 * <p>
 * 
 * Be careful with the methods that work on String data (vs. Streams): Large
 * documents will cause an <code>{@link OutOfMemoryError</code>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public final class DecodeUtil {
  /**
   * Utility class construtor.
   * <p>
   * 
   */
  private DecodeUtil() {
    // nop as stateless
  }

  /**
   * Decodes <tt>HTML Entities</tt>(e.g. &amp;nbsp;) in the given String into
   * the unicode representation.
   * <p>
   * 
   * This method should perform quick as an <a href="http://www.antlr.org"
   * target="_blank">ANTLR</a> generated parser is used.
   * <p>
   * 
   * HTML entities are described in <a
   * href="http://www.w3.org/TR/html401/sgml/entities.html">
   * http://www.w3.org/TR/html401/sgml/entities.html</a>
   * <p>
   * 
   * For enterprise support of arbitrary large files prefer the approach of
   * <code>{@link info.monitorenter.unicode.decoder.html.HtmlEntityDecoderReader}</code>.
   * <p>
   * 
   * @param html
   *          the html data to decode <tt>HTML Entities</tt> in.
   * 
   * @return a new String with the unicode representation of the HTML Entities
   *         in the input html.
   * 
   * @throws IOException
   *           if sth. goes wrong.
   * @throws TokenStreamException
   *           if invalid character data was found in the underlying stream.
   *           This is unlikely to happen as the lexer covers all characters,
   *           but if it should happen (ANTLR error?) this method cannot deal
   *           with the problem and does not catch the exception.
   * @throws RecognitionException
   *           if invalid format was found in the given html. This is unlikely
   *           to happen as the grammar accepts any tokens , but if it should
   *           happen (ANTLR error?) this method cannot deal with the problem
   *           and does not catch the exception.
   * 
   */
  public static String decodeHtmlEntities(final String html) throws RecognitionException,
      TokenStreamException, IOException {
    HtmlEntityLexer lexer = new HtmlEntityLexer(new ByteArrayInputStream(html.getBytes()));
    ByteArrayOutputStream bos = new ByteArrayOutputStream(html.length());
    OutputStreamWriter out = new OutputStreamWriter(bos);
    HtmlEntityDecoder decoder = new HtmlEntityDecoder(lexer);
    decoder.decode(out);
    out.flush();
    out.close();
    return bos.toString();
  }

  /**
   * Main hook used for short test.
   * <p>
   * 
   * @param args
   *          ignored.
   * 
   * @throws RecognitionException
   *           if sth. in the parser goes wrong.
   * 
   * @throws TokenStreamException
   *           if sth. in the lexer goes wrong.
   * 
   * @throws IOException
   *           if sth. in io goes wrong.
   */
  public static void main(final String[] args) throws RecognitionException, TokenStreamException,
      IOException {
    String decode = "Halllllo &nbsp;  K&ouml;rpert&auml;towierung.\n";
    decode = DecodeUtil.decodeHtmlEntities(decode);
    System.out.println(decode);
  }
}
