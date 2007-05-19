/*
 *  latexencoder.g of project cpdetector, 
 *  an ANTLR grammar for generating an encoder from unicode to latex.
 *  Copyright (C) Achim Westermann, created on 12.05.2007
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
 * Portions created by the Initial Developer are Copyright (C) 2006 
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
header{
package info.monitorenter.encoder.latex.parser;

import java.io.IOException;
import java.io.OutputStreamWriter;
}
options{
//		language="java";	 
}

class UnicodeLatexEncoder extends Parser;
options{
		k=1;
		/*
		If omitted, a RecognitionException of rule section will 
		be caught, reported (System.err) and advanced to the next 
		section... . If something is wrong, it makes no sense still 
		trying to parse (my opinion).
		*/
		
		defaultErrorHandler=false; 
		
}

decode [OutputStreamWriter out] throws IOException
	:
	( 

	)*
	;
 
/**
 * Token names are taken from the 
 * <a href="http://www.unicode.org/Public/UNIDATA/UnicodeData.txt">unicoce charcater database</a>. 
 */
class UnicodeLatexLexer extends Lexer;
options{
	codeGenDebug=false; 
	k=7;
	charVocabulary='\u0000'..'\uFFFE';
	genHashLines=true;
	caseSensitive= true;
	filter = false;
}

LATIN_SMALL_LETTER_SHARP 
	: 
	'\u00DF'
	;

DOLLAR_SIGN 
	:
	'\u0024'
	;

PERCENT_SIGN 
	:
	'\u0025'
	;

CIRCUMFLEX_ACCENT 
	:
	'\u005E'
	;

AMPERSAND 
	:
	'\u0026' 
	;
	
LOW_LINE 
	:
	'\u005F'
	;

LEFT_CURLY_BRACKET
	: 
	'\u007B'
	;

RIGHT_CURLY_BRACKET 
	:
	'\u007D'
	;

TILDE 
	:
	'\u007E'
	;

	
// newline UNIX and Windows to have correct lexer line information
ANY_CHAR   :
	'\n' { newline();} 
	| 
	'\r' '\n'{ newline(); } 
	|
    .;  
    
protected
DIGIT :
	'0'..'9'
	;
	
HEXDIGIT : 
	'0'..'9'
	|
	'a'..'f'
	|
	'A'..'F'
	;
