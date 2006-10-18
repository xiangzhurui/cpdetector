/*
 *  CodePageDetectorProxyTest.java of project jchart2d, <purpose>
 *  Copyright 2006 (C) Achim Westermann, created on 18.10.2006 06:09:51.
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA*
 *  If you modify or optimize the code in a useful way please let me know.
 *  Achim.Westermann@gmx.de
 *
 */
package cpdetector.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

import junit.framework.TestCase;
import cpdetector.util.FileUtil;

/**
 * Test case for <code>{@link cpdetector.io.CodepageDetectorProxy}</code>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public class CodePageDetectorProxyTest extends TestCase {

    /** The detector to use. */
    private CodepageDetectorProxy m_detector;

    /**
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.m_detector = CodepageDetectorProxy.getInstance();
        this.m_detector.add(new ParsingDetector(true));
        this.m_detector.add(JChardetFacade.getInstance());
        this.m_detector.add(ASCIIDetector.getInstance());
    }

    /**
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
        this.m_detector = null;
    }

    public void testDetectCodePageUrl() throws IOException {
        assertNotNull(this.m_detector);
        File f = new File("testdocuments/xml.ascc.net/test/wf/big5/text_xml/zh-big5-0.xml");
        assertTrue("Test file " + f.getAbsolutePath() + " does not exist. ", f.exists());
        URL url = f.toURL();
        Charset result = this.m_detector.detectCodepage(url);
        System.out.println("Result: " + result);
        assertEquals(Charset.forName("Big5"), result);
        // file has to be closed afterwards!
        byte[] barr = FileUtil.readRAM(f);
        boolean deleted = f.delete();
        assertTrue("Cannot delete " + f.getAbsolutePath() + " (has a lock?)", deleted);
        f.createNewFile();
        OutputStream out = new FileOutputStream(f);
        out.write(barr);
        out.close();
        assertTrue("File " + f.getAbsolutePath()
                + " seems to be locked (open InputStream) after detection.", f.canWrite());

    }

}
