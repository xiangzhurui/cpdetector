/*
 * ExcludeLimitedCharsetsDetector.java, a codepage detector that 
 * excludes limited charsets by triggering exceptions.
 *
 * Copyright 2012 (C) Achim Westermann, 
 * created on Nov 25, 2012 4:15:05 PM.
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
package info.monitorenter.cpdetector.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Map;

/**
 * A charset detector that excludes charsets with limited byte range by
 * triggering exceptions.
 * <p>
 * Using this will help to disqualify certain charsets.
 * <p>
 * Use this in case you have trouble with wrong detections (e.g. for plain text
 * formats vs. HTML). Keep in mind that the detection routines will never return
 * a valid charset as the implementation does not know which is the right one.
 * It just can find out, which ones are wrong and return them via
 * {@link #getExcludedCharsets()}. This implementation scans through the given
 * content for every charset available on the system. So it is a <b>performance
 * killer</b>.
 * <p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * 
 * 
 * @version $Revision$
 */
public class ExcludeLimitedCharsetsDetector extends AbstractCodepageDetector implements ICodepageDetector {

  /** Generated <code>serialVersionUID</code>. */
  private static final long serialVersionUID = 7831597070120531338L;

  /**
   * Defcon.
   * <p>
   */
  public ExcludeLimitedCharsetsDetector() {
    // nop
  }

  /**
   * @see info.monitorenter.cpdetector.io.ICodepageDetector#isExcludingCharsets()
   */
  public boolean isExcludingCharsets() {
    return true;
  }

  /**
   * @see info.monitorenter.cpdetector.io.ICodepageDetector#detectCodepage(java.io.InputStream,
   *      int)
   */
  public Charset detectCodepage(InputStream in, int length) throws IOException {

    Charset result = UnknownCharset.getInstance();
    LineNumberReader reader;
    CharsetDecoder csd;

    for (Map.Entry<String, Charset> entry : Charset.availableCharsets().entrySet()) {
      csd = entry.getValue().newDecoder();
      csd.onMalformedInput(CodingErrorAction.REPORT);
      csd.onUnmappableCharacter(CodingErrorAction.REPORT);
      reader = new LineNumberReader(new InputStreamReader(new BufferedInputStream(in), csd));
      String read = "";
      try {
        while (read != null) {
          read = reader.readLine();
        }
      } catch (Throwable f) {
        System.err.println("Failed " + entry.getValue());
//        f.printStackTrace();
        this.getExcludedCharsets().add(entry.getValue());
      }
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    for(Map.Entry<String, Charset> entry:Charset.availableCharsets().entrySet()) {
      System.out.println(entry.getKey());
    }
    
    
    
    File noel = new File("/home/achim/tmp/noel2.abc");
    InputStream in = new FileInputStream(noel);
    ICodepageDetector detector = new ExcludeLimitedCharsetsDetector();
    Charset result = detector.detectCodepage(in, Integer.MAX_VALUE);
    for (Charset cs : detector.getExcludedCharsets()) {
      System.out.println("excluded: " + cs);
    }
  }

}
