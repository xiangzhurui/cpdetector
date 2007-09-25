/*
 * HtmlEntityDecoderReaderTest.java, <purpose>
 *
 * Copyright 2007 (C) Achim Westermann, 
 * created on 13.05.2007 11:08:17.
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
 * Portions created by the Initial Developer are Copyright (c) 2007 
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import junit.framework.TestCase;

/**
 * Tests for <code>{@link HtmlEntityDecoderReader}</code>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public class HtmlEntityDecoderReaderTest
    extends TestCase {

  /**
   * Creates a test case named by this class.
   * <p>
   */
  public HtmlEntityDecoderReaderTest() {
    super();
  }

  /**
   * Creates a test case with the given name.
   * <p>
   * 
   * @param arg0
   *          the name of the test case.
   */
  public HtmlEntityDecoderReaderTest(final String arg0) {
    super(arg0);
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with a test file and different char[] sizes.
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecode() throws IOException {

    // raw output:
    InputStream in = this.getClass().getResourceAsStream("test1.txt");
    assertNotNull("Input test file not found (rebuild project to copy it to bin location))", in);
    Reader reader = new InputStreamReader(in);
    int read = 1;
    char[] cbuf = new char[10];
    while (read > 0) {
      read = reader.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    System.out.println();
    reader.close();

    // char[2]
    in = this.getClass().getResourceAsStream("test1.txt");
    reader = new InputStreamReader(in);
    Reader test = new HtmlEntityDecoderReader(reader);
    cbuf = new char[2];
    read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    System.out.println();
    test.close();

    // char[100]
    in = this.getClass().getResourceAsStream("test1.txt");
    reader = new InputStreamReader(in);
    test = new HtmlEntityDecoderReader(reader);
    cbuf = new char[100];
    read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with a big test html file.
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecodeBigFile1() throws IOException {

    // char[100]
    InputStream in = this.getClass().getResourceAsStream("test2.html");
    Reader reader = new InputStreamReader(in);
    HtmlEntityDecoderReader test = new HtmlEntityDecoderReader(reader);
    char[] cbuf = new char[100];
    int read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with a big test html file (NCR, named entities of latin-1).
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecodeBigFile2() throws IOException {

    // char[100]
    InputStream in = this.getClass().getResourceAsStream("test3.html");
    Reader reader = new InputStreamReader(in);
    HtmlEntityDecoderReader test = new HtmlEntityDecoderReader(reader);
    char[] cbuf = new char[100];
    int read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with a big test html file (NCR, named entities with
   * mathematical, greek and symbolic characters).
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecodeBigFile3() throws IOException {

    // char[100]
    InputStream in = this.getClass().getResourceAsStream("test4.html");
    Reader reader = new InputStreamReader(in);
    HtmlEntityDecoderReader test = new HtmlEntityDecoderReader(reader);
    char[] cbuf = new char[100];
    int read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with a big test html file (NCR, named entities with special
   * characters).
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecodeBigFile4() throws IOException {

    // char[100]
    InputStream in = this.getClass().getResourceAsStream("test5.html");
    Reader reader = new InputStreamReader(in);
    HtmlEntityDecoderReader test = new HtmlEntityDecoderReader(reader);
    char[] cbuf = new char[100];
    int read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

  /**
   * Tests <code>{@link HtmlEntityDecoderReader#read(char[])}</code>
   * functionality with various different notations of NCRs as described in
   * http://www.w3.org/TR/html4/charset.html#h-5.3.1.
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  public void testDecodeNCR() throws IOException {

    // char[100]
    InputStream in = this.getClass().getResourceAsStream("ncr.txt");
    Reader reader = new InputStreamReader(in);
    HtmlEntityDecoderReader test = new HtmlEntityDecoderReader(reader);
    char[] cbuf = new char[100];
    int read = 1;
    while (read > 0) {
      read = test.read(cbuf);
      for (int i = 0; i < cbuf.length && i < read; i++) {
        System.out.print(cbuf[i]);
      }
    }
    test.close();
    System.out.println();
  }

}
