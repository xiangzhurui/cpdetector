package info.monitorenter.cpdetector.io;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ASCIIDetectorTest {

  /** Logging facade of this instance. **/
  final Logger log = LoggerFactory.getLogger(ASCIIDetectorTest.class);
  
  @Rule
  public ExternalResource res = new ExternalResource() {
    private File m_file;
    @Override
    protected void before() throws Throwable {
      URL url = this.getClass().getResource("/test/resources/testdocuments/www.unicode.org/robots.txt");
      log.info("Created test resource "+url.toString());
      this.m_file = new File(url.getFile());
    };

    @Override
    protected void after() {
      this.m_file = null;
    };
  
  };
  
  @Before
  public void setUp() throws Exception {
    log.info("setting up. ");
  }

  @After
  public void tearDown() throws Exception {
    log.info("tearing down. ");
  }

  @Test
  public void testDetectCodepageInputStreamInt() {
    ICodepageDetector toTest = ASCIIDetector.getInstance();
    fail("Not yet implemented");
  }

  @Test
  public void testIsExcludingCharsets() {
    fail("Not yet implemented");
  }

}
