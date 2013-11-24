/*
 *  IClassFileFilter.java  cpdetector
 *  Copyright (C) 2004 Achim Westermann, created on 03.06.2004 
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

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.mozilla.intl.chardet.Big5Statistics;
import org.mozilla.intl.chardet.EUCJPStatistics;
import org.mozilla.intl.chardet.EUCKRStatistics;
import org.mozilla.intl.chardet.EUCTWStatistics;
import org.mozilla.intl.chardet.GB2312Statistics;
import org.mozilla.intl.chardet.nsBIG5Verifier;
import org.mozilla.intl.chardet.nsCP1252Verifier;
import org.mozilla.intl.chardet.nsDetector;
import org.mozilla.intl.chardet.nsEUCJPVerifier;
import org.mozilla.intl.chardet.nsEUCKRVerifier;
import org.mozilla.intl.chardet.nsEUCStatistics;
import org.mozilla.intl.chardet.nsEUCTWVerifier;
import org.mozilla.intl.chardet.nsGB18030Verifier;
import org.mozilla.intl.chardet.nsGB2312Verifier;
import org.mozilla.intl.chardet.nsHZVerifier;
import org.mozilla.intl.chardet.nsICharsetDetectionObserver;
import org.mozilla.intl.chardet.nsISO2022CNVerifier;
import org.mozilla.intl.chardet.nsISO2022JPVerifier;
import org.mozilla.intl.chardet.nsISO2022KRVerifier;
import org.mozilla.intl.chardet.nsPSMDetector;
import org.mozilla.intl.chardet.nsSJISVerifier;
import org.mozilla.intl.chardet.nsUCS2BEVerifier;
import org.mozilla.intl.chardet.nsUCS2LEVerifier;
import org.mozilla.intl.chardet.nsUTF8Verifier;
import org.mozilla.intl.chardet.nsVerifier;

/**
 * A fac�ade for jchardet codepage detection. <a href="http://www.i18nfaq.com/"
 * target="_blank">JChardet </a> is the java port of Frank Yung-Fong Tang's
 * Mozilla charset detector.
 * <p>
 * This charset detector works on guessing the codepage. <i>"The algorithm looks
 * into the byte sequence and based on the values of each byte uses a
 * elimination logic to narrow down to the final charset. If there is a tie
 * between EUC charsets, it uses the second logic to narrow down. This logic
 * uses the frequency statistics of characters in a given language." </i>( <a
 * href="http://www.i18nfaq.com/chardet.html#8">source of description </a>).
 * <p>
 * It is a singleton for performance reasons (buffer allocation). Because it is
 * stateful (internal buffer) the method
 * {@link #detectCodepage(InputStream, int)}(delegated to by
 * {@link #detectCodepage(URL)}has to be synchronized.
 * <p>
 * 
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann </a>
 * 
 */
public final class JChardetFacade extends AbstractCodepageDetector implements nsICharsetDetectionObserver {

  /** Generated <code>serialVersionUID</code>. */
  private static final long serialVersionUID = -8974495197628119823L;

  /** Internal jchardet detector. */
  private nsDetector det;

  /** Singleton instance. */
  private static JChardetFacade instance = null;

  public static JChardetFacade getInstance() {
    if (instance == null) {
      synchronized (JChardetFacade.class) {
        instance = new JChardetFacade();
      }
    }
    return instance;
  }

  private int amountOfVerifiers = 0;

  private byte[] buf = new byte[4096];

  private Charset codpage = null;

  private boolean m_guessing = true;

  /**
   * Defcon.
   * <p>
   */
  private JChardetFacade() {
    super();
    det = new nsDetector(nsPSMDetector.ALL);
    det.Init(this);
    this.amountOfVerifiers = det.getProbableCharsets().length;
  }

  /**
   * @see cpdetector.io.ICodepageDetector#detectCodepage(java.io.InputStream)
   */
  public synchronized Charset detectCodepage(InputStream in, int length) throws IOException {
    this.Reset();
    int len;
    int read = 0;
    boolean done = false;
    boolean isAscii = true;
    Charset ret = null;
    do {
      len = in.read(buf, 0, Math.min(buf.length, length - read));
      if (len > 0) {
        read += len;
      }
      if (!done)
        done = det.DoIt(buf, len, false);
    } while (len > 0 && !done);
    det.DataEnd();
    if (this.codpage == null) {
      if (this.m_guessing) {
        ret = guess();
      } else {
        ret = UnknownCharset.getInstance();
      }
    } else {
      ret = this.codpage;
    }
    return ret;

  }

  /**
   * 
   */
  private Charset guess() {
    Charset ret = null;
    String[] possibilities = det.getProbableCharsets();
    /*
     * Detect US-ASCII by the fact, that no exclusion of any Charset was
     * possible.
     */
    if (possibilities.length == this.amountOfVerifiers) {
      ret = Charset.forName("US-ASCII");
    } else {
      // He should better return an Array of length zero!
      String check = possibilities[0];
      if (check.equalsIgnoreCase("nomatch")) {
        ret = UnknownCharset.getInstance();
      } else {
        for (int i = 0; ret == null && i < possibilities.length; i++) {
          try {
            ret = Charset.forName(possibilities[i]);
          } catch (UnsupportedCharsetException uce) {
            ret = UnsupportedCharset.forName(possibilities[i]);
          }
        }
      }
    }
    return ret;

  }

  /**
   * @see info.monitorenter.cpdetector.io.ICodepageDetector#isExcludingCharsets()
   */
  public boolean isExcludingCharsets() {
    return false;
  }

  /**
   * @return Returns the m_guessing.
   */
  public boolean isGuessing() {
    return m_guessing;
  }

  /**
   * 
   * @see org.mozilla.intl.chardet.nsICharsetDetectionObserver#Notify(java.lang.String)
   */
  public void Notify(final String charset) {
    /*
     * special case (found via sourcecode lookup):
     */
    if ("HZ-GB-2312".equals(charset)) {
      this.codpage = Charset.forName("EUC-CN");
    } else {
      this.codpage = Charset.forName(charset);
    }
  }

  public void Reset() {
    det.Reset();
    this.codpage = null;
  }

  /**
   * @see info.monitorenter.cpdetector.io.AbstractCodepageDetector#setCharsetCandidates(java.util.Set)
   */
  @Override
  public void setCharsetCandidates(Set<Charset> candidates) {
    super.setCharsetCandidates(candidates);

    /*
     * Dynamically fill the list of candidates and then spit them out as arrays
     * for the low-level configuration of jchardet:
     */
    List<nsVerifier> verifierList = new LinkedList<nsVerifier>();
    List<nsEUCStatistics> statisticsList = new LinkedList<nsEUCStatistics>();
    Charset cs;
    cs = Charset.forName("utf-8");
    if (candidates.contains(cs)) {
      verifierList.add(new nsUTF8Verifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("Shift_JIS");
    if (candidates.contains(cs)) {
      verifierList.add(new nsSJISVerifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("EUC-JP");
    if (candidates.contains(cs)) {
      verifierList.add(new nsEUCJPVerifier());
      statisticsList.add(new EUCJPStatistics());
    }
    cs = Charset.forName("ISO-2022-JP");
    if (candidates.contains(cs)) {
      verifierList.add(new nsISO2022JPVerifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("EUC-KR");
    if (candidates.contains(cs)) {
      verifierList.add(new nsEUCKRVerifier());
      statisticsList.add(new EUCKRStatistics());
    }
    cs = Charset.forName("ISO-2022-KR");
    if (candidates.contains(cs)) {
      verifierList.add(new nsISO2022KRVerifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("Big5");
    if (candidates.contains(cs)) {
      verifierList.add(new nsBIG5Verifier());
      statisticsList.add(new Big5Statistics());
    }
    cs = Charset.forName("x-EUC-TW");
    if (candidates.contains(cs)) {
      verifierList.add(new nsEUCTWVerifier());
      statisticsList.add(new EUCTWStatistics());
    }
    cs = Charset.forName("GB2312");
    if (candidates.contains(cs)) {
      verifierList.add(new nsGB2312Verifier());
      statisticsList.add(new GB2312Statistics());
    }
    cs = Charset.forName("GB2312");
    if (candidates.contains(cs)) {
      verifierList.add(new nsGB2312Verifier());
      statisticsList.add(new GB2312Statistics());
    }
    cs = Charset.forName("GB18030");
    if (candidates.contains(cs)) {
      verifierList.add(new nsGB18030Verifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("ISO-2022-CN");
    if (candidates.contains(cs)) {
      verifierList.add(new nsGB18030Verifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("EUC-CN");
    if (candidates.contains(cs)) {
      verifierList.add(new nsHZVerifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("ISO-8859-1");
    if (candidates.contains(cs)) {
      verifierList.add(new nsCP1252Verifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("UTF-16BE");
    if (candidates.contains(cs)) {
      verifierList.add(new nsUCS2BEVerifier());
      statisticsList.add(null);
    }
    cs = Charset.forName("UTF-16LE");
    if (candidates.contains(cs)) {
      verifierList.add(new nsUCS2LEVerifier());
      statisticsList.add(null);
    }
    /*
     * No more implemented in jchardet.
     */
    nsVerifier[] verifierArr = verifierList.toArray(new nsVerifier[verifierList.size()]);
    nsEUCStatistics[] statisticsArr = statisticsList.toArray(new nsEUCStatistics[statisticsList.size()]);
    /*
     * Oh no: No constructor chaining from nsDetector to nsPSMDetector. Dirty
     * hacking which will fail in case a security manager is configured.
     */
    Field mVerifier;
    try {
      mVerifier = nsPSMDetector.class.getDeclaredField("mVerifier");
      mVerifier.setAccessible(true);
      try {
        mVerifier.set(this.det, verifierArr);
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
    Field mStatisticsData;
    try {
      mStatisticsData = nsPSMDetector.class.getDeclaredField("mStatisticsData");
      mStatisticsData.setAccessible(true);
      try {
        mStatisticsData.set(this.det, statisticsArr);
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
    Field mItems;
    try {
      mStatisticsData = nsPSMDetector.class.getDeclaredField("mClassItems");
      mStatisticsData.setAccessible(true);
      try {
        mStatisticsData.set(this.det, Integer.valueOf(statisticsArr.length));
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }

  }

  /**
   * <p>
   * If it was impossible to narrow down possible results to one, an internal
   * set of possible character encodings exists. By setting guessing to true,
   * the call to {@link #detectCodepage(InputStream, int)} and
   * {@link #detectCodepage(URL)} will return an arbitrary possible Charset.
   * </p>
   * <p>
   * Currently the following precedence is implemented to choose the possible
   * Charset:
   * <ol>
   * <li>If US-ASCII is possible, it is chosen.
   * <li>If US-ASCII is not possible, the first supported one in the set of
   * possible charsets is returned. No information about the semantics of the
   * order in that list is available. If no possibility is supported, an
   * instance of {@link UnsupportedCharset} is returned.
   * </ol>
   * ASCII indeed is never detected as possible: No internal verifier exists for
   * ASCII, as all Charsets support ASCII. The possibility of ASCII is detected,
   * when no Charset has been excluded: The amount of possible Charsets is equal
   * to the amount of all detectable Charsets.
   * </p>
   * 
   * @param guessing
   *          The guessing to set.
   */
  public synchronized void setGuessing(final boolean guessing) {
    this.m_guessing = guessing;
  }
}