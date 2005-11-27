/*
 * ByteOrderMarkDetector.java,  <enter purpose here>.
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
public class ByteOrderMarkDetector extends AbstractCodepageDetector implements ICodepageDetector {

  /**
   * Generated <code>serialVersionUID</code>.
   */
  private static final long serialVersionUID = 3618977875919778866L;

  /*
   *
   * (non-Javadoc)
   *
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.io.InputStream,
   *      int)
   */
  public Charset detectCodepage(InputStream in, int length) throws IOException {
    // dumbest pragmatic code ever written (nearly a code generator would have
    // been faster). But it's proven fast.
    Charset result = null;
    int readByte = 0;
    readByte = in.read();
    switch (readByte) {
      case ('0'): {
        // 0x 0
        readByte = in.read();
        switch (readByte) {
          case ('0'): {
            // 0x 00
            readByte = in.read();
            switch (readByte) {
              case ('0'): {
                // 0x 00 0
                readByte = in.read();
                switch (readByte) {
                  case ('0'): {
                    // 0x 00 00
                    readByte = in.read();
                    switch (readByte) {
                      case ('F'): {
                        // 0x 00 00 F
                        readByte = in.read();
                        switch (readByte) {
                          case ('E'): {
                            // 0x 00 00 FE
                            // UCS-4, big-endian machine (1234 order)
                            result = Charset.forName("UCS-4 BE");
                            return result;

                          }
                          case ('F'): {
                            // 0x 00 00 FF
                            // UCS-4, unusual octet order (2143)
                            // TODO: look this up
                            // result = whatever;
                            return result;
                          }
                          default:
                            return result;
                        }

                      }
                      default:
                        return result;
                    }

                  }
                  default:
                    return result;
                }
              }
              default:
                return result;
            }
          }
          default:
            return result;

        }
      }
      case ('F'): {
        // 0x F
        readByte = in.read();
        switch (readByte) {
          case ('E'): {
            // 0x FE
            readByte = in.read();
            switch (readByte) {
              case ('F'): {
                // 0x FE F
                readByte = in.read();
                switch (readByte) {
                  case ('F'): {
                    // 0x FE FF
                    // from here on default to UTF-16, big-endian
                    readByte = in.read();
                    switch (readByte) {
                      case ('0'): {
                        // 0x FE FF 0
                        readByte = in.read();
                        switch (readByte) {
                          case ('0'): {
                            // 0x FE FF 00
                            readByte = in.read();
                            switch (readByte) {
                              case ('0'): {
                                // 0x FE FF 00 0
                                readByte = in.read();
                                switch (readByte) {
                                  case ('0'): {
                                    // 0x FE FF 00 00
                                    // UCS-4, unusual octet order (3412)
                                    // TODO: look this up
                                    // result = whatever;
                                    return result;
                                  }
                                  default: {
                                    result = Charset.forName("UTF-16 BE");
                                    return result;
                                  }
                                }
                              }
                              default: {
                                result = Charset.forName("UTF-16 BE");
                                return result;
                              }

                            }
                          }
                          default: {
                            result = Charset.forName("UTF-16 BE");
                            return result;
                          }

                        }
                      }
                      default: {
                        result = Charset.forName("UTF-16 BE");
                        return result;
                      }

                    }
                  }
                  default: {
                    result = Charset.forName("UTF-16 BE");
                    return result;
                  }
                }
              }
            }
          }

          case ('F'): {
            // 0x FF
            readByte = in.read();
            switch (readByte) {
              case ('F'): {
                // 0x FF F
                readByte = in.read();
                switch (readByte) {
                  case ('E'): {
                    // 0x FF FE
                    // from here on default to UTF-16, little-endian
                    readByte = in.read();
                    switch (readByte) {
                      case ('0'): {
                        // 0x FF FE 0
                        readByte = in.read();
                        switch (readByte) {
                          case ('0'): {
                            // 0x FF FE 00
                            readByte = in.read();
                            switch (readByte) {
                              case ('0'): {
                                // 0x FF FE 00 0
                                readByte = in.read();
                                switch (readByte) {
                                  case ('0'): {
                                    // 0x FF FE 00 00
                                    // UCS-4, little-endian machine (4321 order)
                                    // TODO: look this up
                                    // result = whatever;
                                    return result;
                                  }
                                  default: {
                                    result = Charset.forName("UTF-16 LE");
                                    return result;
                                  }
                                }
                              }
                              default: {
                                result = Charset.forName("UTF-16 LE");
                                return result;
                              }

                            }
                          }
                          default: {
                            result = Charset.forName("UTF-16 LE");
                            return result;
                          }

                        }
                      }
                      default: {
                        result = Charset.forName("UTF-16 LE");
                        return result;
                      }

                    }
                  }
                  default: {
                    result = Charset.forName("UTF-16 LE");
                    return result;
                  }
                }
              }
            }
          }
          default:
            return result;
        }
      }
      case ('E'): {
        // 0x E
        readByte = in.read();
        switch (readByte) {
          case ('F'): {
            // 0x EF
            readByte = in.read();
            switch (readByte) {
              case ('B'): {
                // 0x EF B
                readByte = in.read();
                switch (readByte) {
                  case ('B'): {
                    // 0x EF BB
                    readByte = in.read();
                    switch (readByte) {
                      case ('B'): {
                        // 0x EF BB B
                        readByte = in.read();
                        switch (readByte) {
                          case ('F'): {
                            result = Charset.forName("utf-8");
                            return result;
                          }
                          default: {
                            return result;
                          }
                        }
                      }
                      default: {
                        return result;
                      }
                    }
                  }
                  default: {
                    return result;
                  }
                }
              }
              default: {
                return result;
              }
            }
          }
          default: {
            return result;
          }
        }
      }
      default:
        return result;

    }
  }

  /**
   * <p>
   * Delegates to {@link #detectCodepage(InputStream, int)}with a buffered
   * input stream of size 10 (8 needed as maximum).
   * </p>
   *
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.net.URL)
   */
  public Charset detectCodepage(URL url) throws IOException {
    return this.detectCodepage(new BufferedInputStream(url.openStream(), 10), Integer.MAX_VALUE);
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }
}
