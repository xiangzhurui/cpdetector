/*
 * 
 *  HTMLCodepageDetector.java, a facade to an ANTLR grammar based 
 *  parser / lexer that searches for the "charset" attribute of a 
 *  html page.
 *  Copyright (C) Achim Westermann, created on 20.07.2004, 10:35:46  
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *  
 *  If you modify or optimize the code in a useful way please let me know.
 *  Achim.Westermann@gmx.de
 *	
 */
package cpdetector.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import antlr.ANTLRException;
import cpdetector.io.parser.HTMLCharsetLexer;
import cpdetector.io.parser.HTMLCharsetParser;

/**
 * <p>
 * A Façade (<a href="http://c2.com/cgi/wiki?DesignPatternsBook" target="_blank">GOF-pattern</a>) 
 * that ports an <a href="http://www.antlr.org">ANTLR</a> - based parser / lexer 
 * that searches for &lt;charset&gt;
 * <pre>
 * meta http-equiv="content-type" content="text/html; charset=&ltcharset&gt;"
 * </pre>
 * in html pages to the interface {@link ICodepageDetector}.
 * </p>
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 *
 */
public class HTMLCodepageDetector extends AbstractCodepageDetector
{
	private boolean verbose = false;


	public HTMLCodepageDetector(){
		this(true);
	}

    public HTMLCodepageDetector(boolean verbose)
    {
        super();
        this.verbose = verbose;
    }
    

    /* (non-Javadoc)
     * @see aw.io.ICodepageDetector#detectCodepage(java.net.URL)
     */
    public Charset detectCodepage(URL url) throws IOException
    {
        HTMLCharsetLexer lexer;
        HTMLCharsetParser parser;
        Charset charset = null;
        String csName = null;
        if (this.verbose)
        {
            System.out.println("  trying to parse for charset attribute with codepage: US-ASCII");
        }
        try
        {
            lexer = new HTMLCharsetLexer(new InputStreamReader(url.openStream(), "US-ASCII"));
            parser = new HTMLCharsetParser(lexer);
			csName = parser.htmlDocument();
			if(csName != null){
            	charset = Charset.forName(csName);
			}
        }
        catch (ANTLRException ae)
        {
            if (this.verbose)
            {
                System.out.println("  ANTLR parser exception: " + ae.getMessage());
            }
        }
        catch (Exception deepdown)
        {
            if (this.verbose)
            {
                System.out.println("  Decoding Exception: " + deepdown.getMessage()+" (unsupported java charset).");
            }
        }
        return charset;
    }

}
