package cpdetector.test;
import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;

import java.io.File;
import java.net.URL;

import fit.ColumnFixture;

public class DetectURLFixture extends ColumnFixture{
  /**
   * I would never name a member like this, just
   * done for the fit-table heading.
   */
  public String URL;

  /*
   * Internal needed cpdetector:
   */
  CodepageDetectorProxy detector;

  public DetectURLFixture(){
    this.detector = CodepageDetectorProxy.getInstance();
    this.detector.add(new ParsingDetector(true));
    this.detector.add(JChardetFacade.getInstance());
    this.detector.add(ASCIIDetector.getInstance());
  }

  public String detectURL() throws Throwable{
    // ignore case:
    this.URL = this.URL.toLowerCase();
    // Check, wether local file:
    File f = new File(this.URL);
    System.out.println("Checking file: "+f.getAbsolutePath());
    URL document;
    if(f.exists()){
      document = f.toURL();
    }
    else{
      try{
        document = new URL(this.URL);
      }catch(java.net.MalformedURLException mue){
        throw new Exception("Could not reach the file or url: "+this.URL+". Terminating.",mue);
      }
    }
    System.out.println("Testing document: "+document.toExternalForm());
    return this.detector.detectCodepage(document).name().toLowerCase();
  }
}