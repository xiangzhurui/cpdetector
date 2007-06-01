/*
 * DecodeUtilTest.java, <purpose>
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

package info.monitorenter.unicode.decoder;

import info.monitorenter.unicode.decoder.DecodeUtil;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import cpdetector.util.FileUtil;

/**
 * Test for <code>{@link HtmlUtils}</code>.
 * <p>
 * 
 * @author Achim Westermann
 * 
 * @version $Revision$
 * 
 */
public class DecodeUtilTest
    extends TestCase {

  /**
   * Creates a test case with the class name.
   * <p>
   */
  public DecodeUtilTest() {

    super();

  }

  /**
   * Creates a test case with the given name.
   * <p>
   * 
   * @param testName
   *          the name of the test case.
   * 
   */
  public DecodeUtilTest(final String testName) {

    super(testName);

  }

  /**
   * Tests <code>{@link HtmlUtils#decodeHtmlEntities(String)}</code> with
   * several files.
   * <p>
   * 
   * @throws IOException
   *           if sth goes wrong
   * 
   * @throws TokenStreamException
   *           if the grammar is wrong (the programmer was wrong).
   * 
   * @throws RecognitionException
   *           if data is corrupt.
   * 
   */
  public void testDecodeHtmlEntities() throws IOException, RecognitionException,
      TokenStreamException {

    InputStream in = this.getClass().getClassLoader().getResourceAsStream(
        "info/monitorenter/unicode/decoder/html/test1.txt");

    byte[] contentBytes = FileUtil.readRAM(in);
    String content = new String(contentBytes);
    content = DecodeUtil.decodeHtmlEntities(content);
    System.out.println(content);

    in = this.getClass().getClassLoader().getResourceAsStream(
        "info/monitorenter/unicode/decoder/html/ncr.txt");
    contentBytes = FileUtil.readRAM(in);
    content = new String(contentBytes);
    content = DecodeUtil.decodeHtmlEntities(content);
    System.out.println(content);

    in = this.getClass().getClassLoader().getResourceAsStream(
        "info/monitorenter/unicode/decoder/html/test2.html");
    int x = 0;
    while ((x = in.read()) > 0) {
      System.out.print((char) x);
    }
    in = this.getClass().getClassLoader().getResourceAsStream(
        "info/monitorenter/unicode/decoder/html/test2.html");
    contentBytes = FileUtil.readRAM(in);
    content = new String(contentBytes);
    content = DecodeUtil.decodeHtmlEntities(content);
    System.out.println(content);

  }

}
