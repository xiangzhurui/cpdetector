/*
 * UnicodeDetector,  <enter purpose here>.
 * Copyright (C) 2005  Achim Westermann, Achim.Westermann@gmx.de
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  If you modify or optimize the code in a useful way please let me know.
 *  Achim.Westermann@gmx.de
 */
package cpdetector.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

import cpdetector.io.AbstractCodepageDetector;
import cpdetector.io.ICodepageDetector;
import cpdetector.io.UnknownCharset;

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
 * </table>
 * </p>
 * <p>
 * Note that this detector is very fast as it only has to read a maximum of 8
 * bytes to provide a result. Nevertheless it is senseless to add it to the
 * configuration if the documents to detect will have a low rate of documents in
 * the codepages that will be detected. If added to the configuration of
 * {@link cpdetector.io.CodepageDetectorProxy}it should be at front position to
 * save computations of the following detection processses.
 * <p>
 * <p>
 * This implementation is based on: <br>
 * <a target="_blank"
 * title="http://www.w3.org/TR/2004/REC-xml-20040204/#sec-guessing-no-ext-info"
 * href="http://www.w3.org/TR/2004/REC-xml-20040204/#sec-guessing-no-ext-info">W3C
 * XML Specification 1.0 3rd Edition, F.1 Detection Without External Encoding
 * Information </a>.
 * </p>
 *
 *
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann </a>
 *
 * @version $Revision$
 */
public class UnicodeDetector extends AbstractCodepageDetector{
  private static ICodepageDetector instance;
  /**
   * Singleton constructor
   */
  private UnicodeDetector() {
    super();
  }

  public static ICodepageDetector getInstance(){
    if(instance==null){
      instance = new UnicodeDetector();
    }
    return instance;
  }



  /* (non-Javadoc)
   * It is assumed that the inputstream is at the start of the file or String (in order to read the BOM).
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.io.InputStream, int)
   *
   */
  public Charset detectCodepage(InputStream in, int length) throws IOException {
  byte[] bom = new byte[4]; // Get the byte-order mark, if there is one
  in.read(bom, 0, 4);
  //Unicode formats => read BOM
  byte b = (byte)0xEF;
    if (bom[0] == (byte)0x00 && bom[1] == (byte)0x00 && bom[2] == (byte)0xFE && bom[2] == (byte)0xFF) //utf-32BE
      return Charset.forName("UTF-32BE");
    if (bom[0] == (byte)0xFF && bom[1] == (byte)0xFE && bom[2] == (byte)0x00 && bom[2] == (byte)0x00) //utf-32BE
      return Charset.forName("UTF-32LE");
    if (bom[0] == (byte)0xEF && bom[1] == (byte)0xBB && bom[2] == (byte)0xBF) //utf-8
      return Charset.forName("UTF-8");
    if (bom[0] == (byte)0xff && bom[1] == (byte)0xfe)  // ucs-2le, ucs-4le, and ucs-16le
      return Charset.forName("UTF-16LE");
    if (bom[0] == (byte)0xfe && bom[1] == (byte)0xff)  // utf-16 and ucs-2
      return Charset.forName("UTF-16BE");
    if (bom[0] == (byte)0 && bom[1] == (byte)0 && bom[2] == (byte)0xfe && bom[3] == (byte)0xff) // ucs-4
    return Charset.forName("UCS-4");
    return UnknownCharset.getInstance();
  }

  /* (non-Javadoc)
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.net.URL)
   */
  public Charset detectCodepage(URL url) throws IOException {
    return this.detectCodepage(new BufferedInputStream(url.openStream()), Integer.MAX_VALUE);
  }

}
