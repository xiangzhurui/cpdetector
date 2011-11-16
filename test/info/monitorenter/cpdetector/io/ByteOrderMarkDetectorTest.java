/*
 * ByteOrderMarkDetector.java, Test for ByteOrderMarkDetector. Copyright (C) 2010 Achim Westermann, Achim.Westermann@gmx.de
 * 
 * ***** BEGIN LICENSE BLOCK ***** Version: MPL 1.1/GPL 2.0/LGPL 2.1
 * 
 * The contents of this collection are subject to the Mozilla Public License Version 1.1 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations under the License.
 * 
 * The Original Code is the cpDetector code in [sub] packages info.monitorenter and cpdetector.
 * 
 * The Initial Developer of the Original Code is Achim Westermann <achim.westermann@gmx.de>.
 * 
 * Portions created by the Initial Developer are Copyright (c) 2007 the Initial Developer. All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * Alternatively, the contents of this file may be used under the terms of either the GNU General Public License Version 2 or later (the
 * "GPL"), or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"), in which case the provisions of the GPL or the LGPL
 * are applicable instead of those above. If you wish to allow use of your version of this file only under the terms of either the GPL or
 * the LGPL, and not to allow others to use your version of this file under the terms of the MPL, indicate your decision by deleting the
 * provisions above and replace them with the notice and other provisions required by the GPL or the LGPL. If you do not delete the
 * provisions above, a recipient may use your version of this file under the terms of any one of the MPL, the GPL or the LGPL.
 * 
 * ***** END LICENSE BLOCK ***** *
 * 
 * If you modify or optimize the code in a useful way please let me know. Achim.Westermann@gmx.de
 */
package info.monitorenter.cpdetector.io;

import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.fail;
import info.monitorenter.cpdetector.io.ByteOrderMarkDetector;
import info.monitorenter.cpdetector.io.ICodepageDetector;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

import org.junit.Test;

/**
 * JUnit test for <code>{@link ByteOrderMarkDetector}</code>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann </a>
 * 
 * @version $Revision$
 */
public class ByteOrderMarkDetectorTest {

    /**
     * Defcon.
     * <p>
     */
    public ByteOrderMarkDetectorTest() {
        // nop
    }

    /**
     * Tests detection of <code>UCS-4BE</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void ucs4bigendian() throws IOException {
        final String charsetName = "UCS-4BE";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { 0x00, 0x00, (byte) 0xff, (byte) 0xff };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UCS-4LE</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void ucs4littleendian() throws IOException {
        final String charsetName = "UCS-4LE";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0xFF, (byte)0xFE, 0x00, 0x00 };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UCS-4 unusal octet order (2143 order)</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void ucs4_2143order() throws IOException {
        final String charsetName = "UCS-4";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0x00, (byte)0x00, (byte)0xFF, (byte)0xFE };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UCS-4 unusal octet order (3412 order)</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void ucs4_3412order() throws IOException {
        final String charsetName = "UCS-4";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0xFE, (byte)0xFF, (byte)0x0, (byte)0x0 };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UTF-16-BE</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void utf16bigendian() throws IOException {
        final String charsetName = "UTF-16BE";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0xFE, (byte)0xFF, (byte)0x0, (byte)0x01 };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UTF-16-LE</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void utf16littleendian() throws IOException {
        final String charsetName = "UTF-16LE";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0xFF, (byte)0xFE, (byte)0x0, (byte)0x01 };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
    
    /**
     * Tests detection of <code>UTF-8</code>.
     * <p>
     * 
     * @throws IOException
     *             if something bad happens (Charset not on this platform).
     */
    @Test
    public void utf8() throws IOException {
        final String charsetName = "UTF-8";
        try {
            Charset expected = Charset.forName(charsetName);
            byte[] barr = { (byte)0xEF, (byte)0xBB, (byte)0xBF, (byte)0x00 };
            ByteArrayInputStream in = new ByteArrayInputStream(barr);
            ICodepageDetector byteOrderMarkDetector = new ByteOrderMarkDetector();
            Charset result = byteOrderMarkDetector.detectCodepage(in, 4);
            assertEquals(expected, result);
        } catch (UnsupportedCharsetException ucse) {
            fail("This test cannot be run on this machine. Charset is missing: " + ucse.getMessage());
        }
    }
}
