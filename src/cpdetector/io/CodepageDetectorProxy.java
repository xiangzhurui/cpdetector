/*
 * Created on 03.06.2004
 *	
 */
package cpdetector.io;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>
 * A proxy that delegate the codepage detection to all it's delegates. 
 * The first one (added in code-order) that does not return a null {@link Charset} from 
 * it's delegate method {@link #detectCodepage(URL)} wins the race and 
 * determines the codpage of the document specified by the given URL.
 * </p>
 * <p>
 * If an underlying {@link ICodepageDetector} throws an {@link java.io.IOException}, the 
 * delegation search will be terminated by throwing this exception.
 * </p>
 * 
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 *
 */
public final  class CodepageDetectorProxy extends AbstractCodepageDetector{
	/**
	 * Singleton instance.
	 */
	private static CodepageDetectorProxy instance = null;
	
	/**
	 * The set of {@link ICodepageDetector} instances that this 
	 * proxy will delegate to. 
	 * These instances will be invoked in order to find the codepage until 
	 * the first instance returns a valid codepage. If an {@link IOException} 
	 * is thrown the search will terminate early (assuming that the 
	 * execption is related to a general problem with the given URL.
	 */
	private Set detectors = new TreeSet();
	/**
	 * Singleton constructor. For internal use only.
	 */
	private CodepageDetectorProxy() {
		super();
	}
	
	/**
	 * Singleton retrieval method.
	 * 
	 */
	public static CodepageDetectorProxy getInstance(){
		if(instance==null){
			instance = new CodepageDetectorProxy();
		}
		return instance;
	}

	/**
	 * <p>
	 * Adds the given instance to this proxie's detection capability. 
	 * Remember that the order of added ICodepageDetector instances is 
	 * important for the internal delegation (see class description).
	 * </p>
	 * 
	 */
	public boolean add(ICodepageDetector detector){
		return this.detectors.add(detector);
	}
	/**
	 * @param url Should link to a file containing textual document. No check for images or other resources is made.
	 * @throws IOException If a problem with the url - handling occurs. 
	 */
	public Charset detectCodepage(URL url) throws IOException {
		
		Charset ret = null;
		Iterator detectorIt = this.detectors.iterator();
		while(detectorIt.hasNext()){
			ret = ((ICodepageDetector)detectorIt.next()).detectCodepage(url);
			if(ret != null){
				break;
			}
		}
		return ret;
	}

	public String toString(){
		StringBuffer ret = new StringBuffer();
		Iterator it = this.detectors.iterator();
		int i=1;
		while(it.hasNext()){
			ret.append(i).append(") ").append(it.next().getClass().getName()).append('\n');
			i++;
		}
		return ret.toString();
	}


}
