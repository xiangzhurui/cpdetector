/*
 * TestCodepageProcessor.java, <purpose>
 *
 * Copyright 2011 (C) Achim Westermann, 
 * created on Nov 27, 2011 2:55:09 PM.
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
package info.monitorenter.cpdetector;

import info.monitorenter.util.ExceptionUtil;
import junit.framework.Assert;

import org.junit.Test;

public class CodepageProcessorTest {

  /**
   * Tests if a document with undetected codepage will still be tried to be transformed.
   * <p>
   * 
   * @throws Exception
   *           if something goes wrong.
   */
  @Test
  public void testVoidError() throws Exception {

    String[] args = new String[] {"-m", "-r", "testdocuments/voiddocument/", "-o",
        "testoutput/", "-t", "utf-8" };
    /*
     * Capture System.out
     */
    boolean matchSkipMessage = false;
    String matchPhrase = "Skipping transformation of document /home/achim/workspace/cpdetector/testdocuments/voiddocument/Voiderror.htm because it's charset could not be detected.";
    ExceptionUtil.InputStreamTracer matchTracer = ExceptionUtil.findMatchInSystemOut(matchPhrase);
    // Now run the code that will system.out:
    CodepageProcessor.main(args);
    // System.out now is a different one, piping into matchTracer and former System.out:
    System.out.flush();
    System.err.flush();
    Thread.sleep(5000);
    matchSkipMessage = matchTracer.isMatched();
    Assert.assertTrue("Did not find \"" + matchPhrase + "\" in system out.", matchSkipMessage);

  }
  
  /**
   * Tests if a document with a codepage detected which is not known to the VM will cause a transformation error.
   * <p>
   * 
   * @throws Exception
   *           if something goes wrong.
   */
  @Test
  public void testIllegalCharsetError() throws Exception {

    String[] args = new String[] {"-m", "-r", "testdocuments/invalidcharsetdocument/", "-o",
        "testoutput/", "-t", "utf-8" };
    /*
     * Capture System.out
     */
    boolean matchSkipMessage = false;
    String matchPhrase = "valid";
    ExceptionUtil.InputStreamTracer matchTracer = ExceptionUtil.findMatchInSystemOut(matchPhrase);
    // Now run the code that will system.out:
    CodepageProcessor.main(args);
    // System.out now is a different one, piping into matchTracer and former System.out:
    System.out.flush();
    System.err.flush();
    Thread.sleep(5000);
    matchSkipMessage = matchTracer.isMatched();
    Assert.assertTrue("Did not find \"" + matchPhrase + "\" in system out.", matchSkipMessage);

  }
  
}
