/*
 *  htmlentitydecoder.g of project cpdetector, 
 *  an ANTLR grammar for generating a html entity decoder.
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
package cpdetector.html.parser;

import java.io.IOException;
import java.io.OutputStreamWriter;
}
options{
//		language="java";	 
}

class HtmlEntityDecoder extends Parser;
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
	NBSP { out.write('\u00A0');}
	|
	IEXCL { out.write('\u00A1');}
	|
	CENT { out.write('\u00A2');}
	|
	POUND { out.write('\u00A3');}
	|
	CURREN { out.write('\u00A4');}
	|
	YEN { out.write('\u00A5');}
	|
	BRVBAR { out.write('\u00A6');}
	|
	SECT { out.write('\u00A7');}
	|
	UML { out.write('\u00A8');}
	|
	COPY { out.write('\u00A9');}
	|
	ORDF { out.write('\u00AA');}
	|
	LAQUO { out.write('\u00AB');}
	|
	NOT { out.write('\u00AC');}
	|
	SHY { out.write('\u00AD');}
	|
	REG { out.write('\u00AE');}
	|
	MACR { out.write('\u00AF');}
	|
	DEG { out.write('\u00B0');}
	|
	PLUSMN { out.write('\u00B1');}
	|
	SUP2 { out.write('\u00B2');}
	|
	SUP3 { out.write('\u00B3');}
	|
	ACUTE { out.write('\u00B4');}
	|
	PARA { out.write('\u00B5');}
	|
	MIDDOT { out.write('\u00B7');}
	|
	CEDIL { out.write('\u00B8');}
	|
	SUP1 { out.write('\u00B9');}
	|
	ORDM { out.write('\u00BA');}
	|
	RAQUO { out.write('\u00BB');}
	|
	FRAC14 { out.write('\u00BC');}
	|
	FRAC12 { out.write('\u00BD');}
	|
	FRAC34 { out.write('\u00BE');}
	|
	IQUEST { out.write('\u00BF');}
	|
	AGRAVE { out.write('\u00C0');}
	|
	AACUTE { out.write('\u00C1');}
	|
	ACIRC { out.write('\u00C2');}
	|
	ATILDE { out.write('\u00C3');}
	|
	AUML { out.write('\u00C4');}
	|
	ARING { out.write('\u00C5');}
	|
	AELIG { out.write('\u00C6');}
	|
	CCEDIL { out.write('\u00C7');}
	|
	EGRAVE { out.write('\u00C8');}
	|
	EACUTE { out.write('\u00C9');}
	|
	ECIRC { out.write('\u00CA');}
	|
	EUML { out.write('\u00CB');}
	|
	IGRAVE { out.write('\u00CC');}
	|
	IACUTE { out.write('\u00CD');}
	|
	ICIRC { out.write('\u00CE');}
	|
	IUML { out.write('\u00CF');}
	|
	ETH { out.write('\u00D0');}
	|
	NTILDE { out.write('\u00D1');}
	|
	OGRAVE { out.write('\u00D2');}
	|
	OACUTE { out.write('\u00D3');}
	|
	OCIRC { out.write('\u00D4');}
	|
	OTILDE { out.write('\u00D5');}
	|
	OUML { out.write('\u00D6');}
	|
	TIMES { out.write('\u00D7');}
	|
	OSLASH { out.write('\u00D8');}
	|
	UGRAVE { out.write('\u00D9');}
	|
	UACUTE { out.write('\u00DA');}
	|
	UCIRC { out.write('\u00DB');}
	|
	UUML { out.write('\u00DC');}
	|
	YACUTE { out.write('\u00DD');}
	|
	THORN { out.write('\u00DE');}
	|
	SZLIG { out.write('\u00DF');}
	|
	AGRAVE_LC { out.write('\u00E0');}
	|
	AACUTE_LC { out.write('\u00E1');}
	|
	ACIRC_LC { out.write('\u00E2');}
	|
	ATILDE_LC { out.write('\u00E3');}
	|
	AUML_LC { out.write('\u00E4');}
	|
	ARING_LC { out.write('\u00E5');}
	|
	AELIG_LC { out.write('\u00E6');}
	|
	CCEDIL_LC { out.write('\u00E7');}
	|
	EGRAVE_LC { out.write('\u00E8');}
	|
	EACUTE_LC { out.write('\u00E9');}
	|
	ECIRC_LC { out.write('\u00EA');}
	|
	EUML_LC { out.write('\u00EB');}
	|
	IGRAVE_LC { out.write('\u00EC');}
	|
	IACUTE_LC { out.write('\u00ED');}
	|
	ICIRC_LC { out.write('\u00EE');}
	|
	IUML_LC { out.write('\u00EF');}
	|
	ETH_LC { out.write('\u00F0');}
	|
	NTILDE_LC { out.write('\u00F1');}
	|
	OGRAVE_LC { out.write('\u00F2');}
	|
	OACUTE_LC { out.write('\u00F3');}
	|
	OCIRC_LC { out.write('\u00F4');}
	|
	OTILDE_LC { out.write('\u00F5');}
	|
	OUML_LC { out.write('\u00F6');}
	|
	DIVIDE { out.write('\u00F7');}
	|
	OSLASH_LC { out.write('\u00F8');}
	|
	UGRAVE_LC { out.write('\u00F9');}
	|
	UACUTE_LC { out.write('\u00FA');}
	|
	UCIRC_LC { out.write('\u00FB');}
	|
	UUML_LC { out.write('\u00FC');}
	|
	YACUTE_LC { out.write('\u00FD');}
	|
	THORN_LC { out.write('\u00FE');}
	|
	YUML_LC { out.write('\u00FF');}
	|
	token: ANY_CHAR { out.write(token.getText());}
	;
 

class HtmlEntityLexer extends Lexer;
options{
	codeGenDebug=false; 
	k=7;
	charVocabulary='\u0000'..'\uFFFE';
	genHashLines=true;
	caseSensitive= true;
	filter = false;
}

/*
 * Taken from http://www.w3.org/TR/html401/sgml/entities.html 
 */

NBSP    : "&nbsp;";
IEXCL   : "&iexcl;";
CENT    : "&cent;";
POUND   : "&pound;";
CURREN  : "&curren;";
YEN     : "&yen;";
BRVBAR  : "&brvbar;";
SECT    : "&sect;";
UML     : "&uml;";
COPY    : "&copy;";
ORDF    : "&ordf;";
LAQUO   : "&laquo;";
NOT     : "&not;";
SHY     : "&shy;";
REG     : "&reg;";
MACR    : "&macr;";
DEG     : "&deg;";
PLUSMN  : "&plusmn;";
SUP2    : "&sup2;";
SUP3    : "&sup3;";
ACUTE   : "&acute;";
MICRO   : "&micro;";
PARA    : "&para;";
MIDDOT  : "&middot";
CEDIL   : "&cedil;";
SUP1    : "&sup1;";
ORDM    : "&ordm;";
RAQUO   : "&raquo;";
FRAC14  : "&frac14;";
FRAC12  : "&frac12;";
FRAC34  : "&frac34;";
IQUEST  : "&iquest;";
AGRAVE  : "&Agrave;";
AACUTE  : "&Aacute;";
ACIRC   : "&Acirc;";
ATILDE  : "&Atilde;";
AUML    : "&Auml;";
ARING   : "&Aring;";
AELIG   : "&AElig;";
CCEDIL  : "&Ccedil;";
EGRAVE  : "&Egrave;";
EACUTE  : "&Eacute;";
ECIRC   : "&Ecirc;";
EUML    : "&Euml;";
IGRAVE  : "&Igrave;";
IACUTE  : "&Iacute;";
ICIRC   : "&Icirc;";
IUML    : "&Iuml;";
ETH     : "&ETH;";
NTILDE  : "&Ntilde;";
OGRAVE  : "&Ograve;";
OACUTE  : "&Oacute;";
OCIRC   : "&Ocirc;";
OTILDE  : "&Otilde;";
OUML    : "&Ouml;";
TIMES   : "&times;";
OSLASH  : "&Oslash;";
UGRAVE  : "&Ugrave;";
UACUTE  : "&Uacute;";
UCIRC   : "&Ucirc;";
UUML    : "&Uuml;";
YACUTE  : "&Yacute;";
THORN      : "&THORN;";
SZLIG      : "&szlig;";
AGRAVE_LC  : "&agrave;";
AACUTE_LC  : "&aacute;";
ACIRC_LC   : "&acirc;";
ATILDE_LC  : "&atilde;";
AUML_LC    : "&auml;";
ARING_LC   : "&aring;";
AELIG_LC   : "&aelig;";
CCEDIL_LC  : "&ccedil;";
EGRAVE_LC  : "&egrave;";
EACUTE_LC  : "&eacute;";
ECIRC_LC   : "&ecirc;";
EUML_LC    : "&euml;";
IGRAVE_LC  : "&igrave;";
IACUTE_LC  : "&iacute;";
ICIRC_LC   : "&icirc;";
IUML_LC    : "&iuml;";
ETH_LC     : "&eth;";
NTILDE_LC  : "&ntilde;";
OGRAVE_LC  : "&ograve;";
OACUTE_LC  : "&oacute;";
OCIRC_LC   : "&ocirc;";
OTILDE_LC  : "&otilde;";
OUML_LC    : "&ouml;";
DIVIDE     : "&divide;";
OSLASH_LC  : "&oslash;";
UGRAVE_LC  : "&ugrave;";
UACUTE_LC  : "&uacute;";
UCIRC_LC   : "&ucirc;";
UUML_LC    : "&uuml;";
YACUTE_LC  : "&yacute;";
THORN_LC   : "&thorn;";
YUML_LC    : "&yuml;";

ANY_CHAR: .;  
