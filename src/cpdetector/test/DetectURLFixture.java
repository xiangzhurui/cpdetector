package cpdetector.test;
import fit.*;
import cpdetector.io.*;
import java.net.URL;
import java.io.File;

public class DetectURLFixture extends ColumnFixture{
  public String url;
  
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
    this.url = this.url.toLowerCase();
    // Check, wether local file:
    File f = new File(this.url);
    URL document;
    if(f.exists()){
      document = f.toURL();
    }
    else{
      document = new URL(this.url);
    }
    return this.detector.detectCodepage(document).name().toLowerCase();
  }
}