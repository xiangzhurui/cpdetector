/*
 *  CodePageDetectorProxyTest.java of project jchart2d, <purpose>
 *  Copyright 2006 (C) Achim Westermann, created on 18.10.2006 06:09:51.
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
 * ***** END LICENSE BLOCK ***** * 
 */
package info.monitorenter.cpdetector.io;



import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.ICodepageDetector;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;
import info.monitorenter.cpdetector.util.FileUtil;

/**
 * Test case for
 * <code>{@link info.monitorenter.cpdetector.io.CodepageDetectorProxy}</code>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public class CodePageDetectorProxyTest {

  /** The detector to use. */
  private CodepageDetectorProxy m_detector;

  /**
   * @see junit.framework.TestCase#setUp()
   */
  @Before
  public void setUp() throws Exception {
    this.m_detector = CodepageDetectorProxy.getInstance();
    this.m_detector.add(new ParsingDetector(true));
    this.m_detector.add(JChardetFacade.getInstance());
    this.m_detector.add(ASCIIDetector.getInstance());
  }

  /**
   * @see junit.framework.TestCase#tearDown()
   */
  @After
  public void tearDown() throws Exception {
    this.m_detector = null;
  }

  /**
   * Tests
   * <code>{@link CodepageDetectorProxy#detectCodepage(InputStream, int)}</code>
   * .
   * <p>
   * 
   * @throws IOException
   *           if something goes wrong.
   */
  @Test
  public void testDetectCodePageInputStream() throws IOException {
    InputStream in = null;
    try {
      Assert.assertNotNull(this.m_detector);
      File f = new File("testdocuments/stress/illegalHtmlTag/1111.htm");
      Assert.assertTrue("Test file " + f.getAbsolutePath() + " does not exist. ", f.exists());
      in = new BufferedInputStream(new FileInputStream(f));
      // remember the first n bytes: mark-reset test and modification test.
      byte[] barr = new byte[50];
      in.mark(50);
      in.read(barr);
      in.reset();
      String originalStart = new String(barr);

      // mark a position (0) from outside to test mark-reset integrity:
      in.mark(100);
      Charset result = this.m_detector.detectCodepage(in, (int) f.length());
      System.out.println("Result: " + result);
      Assert.assertEquals(Charset.forName("utf-8"), result);

      // The input stream has to be at position 0 afterwards (internal mark -
      // reset logic):
      in.reset();
      in.read(barr);
      String afterStart = new String(barr);
      Assert.assertEquals("Modification or stream position error.", originalStart, afterStart);
    } finally {
      // if input stream is not closed other tests might fail
      // afterwards!
      if (in != null) {
        in.close();
      }
    }
  }

  /**
   * Tests <code>{@link CodepageDetectorProxy#detectCodepage(URL)}</code>.
   * <p>
   * 
   * @throws IOException
   *           if sth. goes wrong.
   */
  @Test
  public void testDetectCodePageUrl() throws IOException {
    Assert.assertNotNull(this.m_detector);
    File f = new File("testdocuments/xml.ascc.net/test/wf/big5/text_xml/zh-big5-0.xml");
    Assert.assertTrue("Test file " + f.getAbsolutePath() + " does not exist. ", f.exists());
    URL url = f.toURL();
    Charset result = this.m_detector.detectCodepage(url);
    System.out.println("Result: " + result);
    Assert.assertEquals(Charset.forName("Big5"), result);
    // file has to be closed afterwards!
    byte[] barr = FileUtil.readRAM(f);
    boolean deleted = f.delete();
    Assert.assertTrue("Cannot delete " + f.getAbsolutePath() + " (has a lock?)", deleted);
    f.createNewFile();
    OutputStream out = new FileOutputStream(f);
    out.write(barr);
    out.flush();
    out.close();
    Assert.assertTrue("File " + f.getAbsolutePath() + " seems to be locked (open InputStream) after detection.", f.canWrite());
  }

  /**
   * Tests {@link CodepageDetectorProxy#detectCodepage(InputStream, int)} by
   * setting a read limit lower than file size with a file whose code page
   * cannot be detected (which ensures that all {@link ICodepageDetector}
   * instances will run over the file).
   * <p>
   * 
   * @throws IllegalArgumentException
   *           if something goes wrong.
   * 
   * @throws IOException
   *           if something related to I/O goes wrong.
   */
  @Test
  public void testMark() throws IllegalArgumentException, IOException {
    Assert.assertNotNull(this.m_detector);
    File f = new File("testdocuments/voiddocument/Voiderror.htm");
    Assert.assertTrue("Test file " + f.getAbsolutePath() + " does not exist. ", f.exists());
    URL url = f.toURL();
    this.m_detector.detectCodepage(url.openStream(), 200);
  }
}
