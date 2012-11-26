/*
 * UnicodeDetector,  <enter purpose here>.
 * Copyright (C) 2005  Achim Westermann, Achim.Westermann@gmx.de
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
 *  
 * If you modify or optimize the code in a useful way please let me know.
 * Achim.Westermann@gmx.de
 */
package info.monitorenter.cpdetector.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Set;

/**
 * <p>
 * This detector identifies byte order marks of the following codepages to give
 * a 100 % deterministic result in case of detection.
 * </p>
 * 
 * <p>
 * <table border="1">
 * <tr>
 * <td>00 00 FE FF</td>
 * <td>UCS-4, big-endian machine (1234 order)</td>
 * </tr>
 * <tr>
 * <td>FF FE 00 00</td>
 * <td>UCS-4,little-endian machine (4321 order)</td>
 * </tr>
 * <tr>
 * <td>00 00 FF FE</td>
 * <td>UCS-4, unusual octet order (2143)</td>
 * </tr>
 * <td>FE FF 00 00</td>
 * <td>UCS-4, unusual octet order (3412)</td>
 * </tr>
 * <tr>
 * <td>FE FF ## ##</td>
 * <td>UTF-16, big-endian</td>
 * </tr>
 * <tr>
 * <td>FF FE ## ##</td>
 * <td>UTF-16, little-endian</td>
 * </tr>
 * <tr>
 * <td>EF BB BF</td>
 * <td>UTF-8</td>
 * </tr>
 * <tr>
 * <td>00 00 FE FF</td>
 * <td>UTF-32BE</td>
 * </tr>
 * <tr>
 * <td>FF FE 00 00</td>
 * <td>UTF-32LE</td>
 * </tr>
 * </table>
 * </p>
 * <p>
 * Note that this detector is very fast as it only has to read a maximum of 8
 * bytes to provide a result. Nevertheless it is senseless to add it to the
 * configuration if the documents to detect will have a low rate of documents in
 * the codepages that will be detected. If added to the configuration of
 * {@link info.monitorenter.cpdetector.io.CodepageDetectorProxy}it should be at
 * front position to save computations of the following detection processses.
 * <p>
 * <p>
 * This implementation is based on: <br>
 * <a target="_blank" title= "http://unicode.org/faq/utf_bom.html#bom4"
 * href="http://unicode.org/faq/utf_bom.html#bom4"
 * >http://unicode.org/faq/utf_bom.html#bom4</a>.
 * </p>
 * 
 * This implementation does the same (not excatly: this one also covers utf-32)
 * as <code>{@link ByteOrderMarkDetector}</code> but with a different read
 * strategy (read 4 bytes at once) and elseif blocks. Would be great to have a
 * performance comparison. Maybe the read of 4 bytes in a row combined with the
 * switch could make that other implementation the winner.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann </a>
 * 
 * @version $Revision$
 */
public class UnicodeDetector extends AbstractCodepageDetector {
  private static ICodepageDetector instance;

  public static ICodepageDetector getInstance() {
    if (instance == null) {
      instance = new UnicodeDetector();
    }
    return instance;
  }

  /**
   * Singleton constructor
   */
  private UnicodeDetector() {
    super();
  }

  /**
   * It is assumed that the inputstream is at the start of the file or String
   * (in order to read the BOM).
   * 
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.io.InputStream,
   *      int)
   * 
   */
  public Charset detectCodepage(InputStream in, int length) throws IOException {
    Charset result = null;
    byte[] bom = new byte[4]; // Get the byte-order mark, if there is one
    in.read(bom, 0, 4);
    // Unicode formats => read BOM
    byte b = (byte) 0xEF;
    if (bom[0] == (byte) 0x00 && bom[1] == (byte) 0x00 && bom[2] == (byte) 0xFE && bom[2] == (byte) 0xFF) {
      // utf-32BE
      result = Charset.forName("UTF-32BE");
    } else if (bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE && bom[2] == (byte) 0x00 && bom[2] == (byte) 0x00) {
      // utf-32BE
      result = Charset.forName("UTF-32LE");
    } else if (bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF) {
      // utf-8
      result = Charset.forName("UTF-8");
    } else if (bom[0] == (byte) 0xff && bom[1] == (byte) 0xfe) {
      // ucs-2le, ucs-4le, anducs-16le
      result = Charset.forName("UTF-16LE");
    } else if (bom[0] == (byte) 0xfe && bom[1] == (byte) 0xff) {
      // utf-16 and ucs-2
      result = Charset.forName("UTF-16BE");
    } else if (bom[0] == (byte) 0 && bom[1] == (byte) 0 && bom[2] == (byte) 0xfe && bom[3] == (byte) 0xff) {
      // ucs-4
      return Charset.forName("UCS-4");
    } else {
      result = UnknownCharset.getInstance();
      Set<Charset> excludes = this.getExcludedCharsets();
      excludes.add(Charset.forName("UTF-32BE"));
      excludes.add(Charset.forName("UTF-32LE"));
      excludes.add(Charset.forName("UTF-8"));
      excludes.add(Charset.forName("UTF-16LE"));
      excludes.add(Charset.forName("UTF-16BE"));
      excludes.add(Charset.forName("UCS-4"));
    }
    return result;
  }

  /**
   * @see info.monitorenter.cpdetector.io.ICodepageDetector#detectCodepage(java.net.URL)
   */
  public Charset detectCodepage(final URL url) throws IOException {
    Charset result;
    BufferedInputStream in = new BufferedInputStream(url.openStream());
    result = this.detectCodepage(in, Integer.MAX_VALUE);
    in.close();
    return result;
  }

  /**
   * @see info.monitorenter.cpdetector.io.ICodepageDetector#isExcludingCharsets()
   */
  public boolean isExcludingCharsets() {
    return true;
  }

}
