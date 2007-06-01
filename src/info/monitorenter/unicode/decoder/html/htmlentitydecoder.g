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
package info.monitorenter.unicode.decoder.html;

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
		
		defaultErrorHandler=true;
		
}

decode [OutputStreamWriter out] throws IOException
	: 
	( 
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
	ALPHA { out.write('\u0391');}
	|
	BETA { out.write('\u0392');}
	|
	GAMMA { out.write('\u0393');}
	|
	DELTA { out.write('\u0394');}
	|
	EPSILON { out.write('\u0395');}
	|
	ZETA { out.write('\u0396');}
	|
	ETA { out.write('\u0397');}
	|
	THETA { out.write('\u0398');}
	|
	IOTA { out.write('\u0399');}
	|
	KAPPA { out.write('\u039A');}
	|
	LAMBDA { out.write('\u039B');}
	|
	MU { out.write('\u039C');}
	|
	NU { out.write('\u039D');}
	|
	XI { out.write('\u039E');}
	|
	OMICRON { out.write('\u039F');}
	|
	PI { out.write('\u03A0');}
	|
	RHO { out.write('\u03A1');}
	|
	SIGMA { out.write('\u03A3');}
	|
	TAU { out.write('\u03A4');}
	|
	UPSILON { out.write('\u03A5');}
	|
	PHI { out.write('\u03A6');}
	|
	CHI { out.write('\u03A7');}
	|
	PSI { out.write('\u03A8');}
	|
	OMEGA { out.write('\u03A9');}
	|
	ALPHA_LC { out.write('\u03B1');}
	|
	BETA_LC { out.write('\u03B2');}
	|
	GAMMA_LC { out.write('\u03B3');}
	|
	DELTA_LC  { out.write('\u03B4');}
	|
	EPSILON_LC { out.write('\u03B5');}
	|
	ZETA_LC { out.write('\u03B6');}
	|
	ETA_LC { out.write('\u03B7');}
	|
	THETA_LC { out.write('\u03B8');}
	|
	IOTA_LC { out.write('\u03B9');}
	|
	KAPPA_LC { out.write('\u03BA');}
	|
	LAMBDA_LC { out.write('\u03BB');}
	|
	MU_LC { out.write('\u03BC');}
	|
	NU_LC { out.write('\u03BD');}
	|
	XI_LC { out.write('\u03BE');}
	|
	OMICRON_LC { out.write('\u03BF');}
	|
	PI_LC { out.write('\u03C0');}
	|
	RHO_LC { out.write('\u03C1');}
	|
	SIGMAF_LC { out.write('\u03C2');}
	|
	SIGMA_LC { out.write('\u03C3');}
	|
	TAU_LC { out.write('\u03C4');}
	|
	UPSILON_LC { out.write('\u03C5');}
	|
	PHI_LC { out.write('\u03C6');}
	|
	CHI_LC { out.write('\u03C7');}
	|
	PSI_LC { out.write('\u03C8');}
	|
	OMEGA_LC { out.write('\u03C9');}
	|
	THETASYM { out.write('\u03D1');}
	|
	UPSIH { out.write('\u03D2');}
	|
	PIV { out.write('\u03D6');} 
	| 
	BULL { out.write('\u2022');}
	|
	HELLIP { out.write('\u2026');}
	|
	PRIME_LC { out.write('\u2032');}
	|
	PRIME { out.write('\u2033');}
	|
	OLINE { out.write('\u203E');}
	|
	FRASL { out.write('\u2044');}
	|
	WEIERP { out.write('\u2118');}
	|
	IMAGE { out.write('\u2111');}
	|
	REAL { out.write('\u211C');}
	|
	TRADE { out.write('\u2122');}
	|
	ALEFSYM { out.write('\u2135');}
	|
	LARR { out.write('\u2190');}
	|
	UARR { out.write('\u2191');}
	|
	RARR { out.write('\u2192');}
	|
	DARR { out.write('\u2193');}
	|
	HARR { out.write('\u2194');}
	|
	CRARR { out.write('\u21B5');}
	|
	LARR_D { out.write('\u21D0');}
	|
	UARR_D { out.write('\u21D1');}
	|
	RARR_D { out.write('\u21D2');}
	|
	DARR_D { out.write('\u21D3');}
	|
	HARR_D { out.write('\u21D4');}
	|
	FORALL { out.write('\u2200');}
	|
	PART { out.write('\u2202');}
	|
	EXIST { out.write('\u2203');}
	|
	EMPTY { out.write('\u2205');}
	|
	NABLA { out.write('\u2207');}
	|
	ISIN { out.write('\u2208');}
	|
	NOTIN { out.write('\u2209');}
	|
	NI { out.write('\u220B');}
	|
	PROD { out.write('\u220F');}
	|
	SUM { out.write('\u2211');}
	|
	MINUS { out.write('\u2212');}
	|
	LOWAST { out.write('\u2217');}
	|
	RADIC { out.write('\u221A');}
	|
	PROP { out.write('\u221D');}
	|
	INFIN { out.write('\u221E');}
	|
	ANG { out.write('\u2220');}
	|
	AND { out.write('\u2227');}
	|
	OR { out.write('\u2228');}
	|
	CAP { out.write('\u2229');}
	|
	CUP { out.write('\u222A');}
	|
	INT { out.write('\u222B');}
	|
	THERE4 { out.write('\u2234');}
	|
	SIM { out.write('\u223C');}
	|
	CONG { out.write('\u2245');}
	|
	ASYMP { out.write('\u2248');}
	|
	NE { out.write('\u2260');}
	|
	EQUIV { out.write('\u2261');}
	|
	LE { out.write('\u2264');}
	|
	GE { out.write('\u2265');}
	|
	SUB { out.write('\u2282');}
	|
	SUP { out.write('\u2283');}
	|
	NSUB { out.write('\u2284');}
	|
	SUBE { out.write('\u2286');}
	|
	SUPE { out.write('\u2287');}
	|
	OPLUS { out.write('\u2295');}
	|
	OTIMES { out.write('\u2297');}
	|
	PERP { out.write('\u22A5');}
	|
	SDOT { out.write('\u22C5');}
	|
	LCEIL { out.write('\u2308');}
	|
	RCEIL { out.write('\u2309');}
	|
	LFLOOR { out.write('\u230A');}
	|
	RFLOOR { out.write('\u230B');}
	|
	LANG { out.write('\u2329');}
	|
	RANG { out.write('\u232A');}
	|
	LOZ { out.write('\u25CA');}
	|
	SPADES { out.write('\u2660');}
	|
	CLUBS { out.write('\u2663');}
	|
	HEARTS { out.write('\u2665');}
	|
	DIAMS { out.write('\u2666');}
	|
	QUOT { out.write('\u0022');}
	|
	AMP { out.write('\u0026');}
	|
	LT { out.write('\u003C');}
	|
	GT { out.write('\u003E');}
	|
	OELIG { out.write('\u0152');}
	|
	OELIG_LC { out.write('\u0153');}
	|
	SCARON { out.write('\u0160');}
	|
	SCARON_LC { out.write('\u0161');}
	|
	YUML { out.write('\u0178');}
	|
	CIRC { out.write('\u02C6');}
	|
	TILDE { out.write('\u02DC');}
	|
	ENSP { out.write('\u2002');}
	|
	EMSP { out.write('\u2003');}
	|
	THINSP { out.write('\u2009');}
	|
	ZWNJ { out.write('\u200C');}
	|
	ZWJ { out.write('\u200D');}
	|
	LRM { out.write('\u200E');}
	|
	RLM { out.write('\u200F');}
	|
	NDASH { out.write('\u2013');}
	|
	MDASH { out.write('\u2014');}
	|
	LSQUO { out.write('\u2018');}
	|
	RSQUO { out.write('\u2019');}
	|
	SBQUO { out.write('\u201A');}
	|
	LDQUO { out.write('\u201C');}
	|
	RDQUO { out.write('\u201D');}
	|
	BDQUO { out.write('\u201E');}
	|
	DAGGER_LC { out.write('\u2020');}
	|
	DAGGER { out.write('\u2021');}
	|
	PERMIL { out.write('\u2030');}
	|
	LSAQUO { out.write('\u2039');}
	|
	RSAQUO { out.write('\u203A');}
	|
	EURO { out.write('\u20AC');}
	|
	token : ANY_CHAR { out.write(token.getText());}
	|
	ncrhtoken : NCR_H
	{
		out.write( new String(new char[] {(char) Integer.parseInt(ncrhtoken.getText(), 16)}));
	}
	|
	ncrdtoken : NCR_D
	{
		out.write( new String(new char[] {(char) Integer.parseInt(ncrdtoken.getText(), 10)}));
	}
	)*
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
// 24.2.1 The list of characters
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

// 24.3 Character entity references for symbols, mathematical symbols, and Greek letters 

ALPHA      : "&Alpha;";
BETA       : "&Beta;";
GAMMA      : "&Gamma;";
DELTA      : "&Delta;";
EPSILON    : "&Epsilon;";
ZETA       : "&Zeta;";
ETA        : "&Eta;";
THETA      : "&Theta;";
IOTA       : "&Iota;";
KAPPA      : "&Kappa;";
LAMBDA     : "&Lambda;";
MU         : "&Mu;";
NU         : "&Nu;";
XI         : "&Xi;";
OMICRON    : "&Omicron;";
PI         : "&Pi;";
RHO        : "&Rho;";
SIGMA      : "&Sigma;";
TAU        : "&Tau;";
UPSILON    : "&Upsilon;";
PHI        : "&Phi;";
CHI        : "&Chi;";
PSI        : "&Psi;";
OMEGA      : "&Omega;";
ALPHA_LC   : "&alpha;";
BETA_LC    : "&beta;";
GAMMA_LC   : "&gamma;";
DELTA_LC   : "&delta;";
EPSILON_LC : "&epsilon;";
ZETA_LC    : "&zeta;";
ETA_LC     : "&eta;";
THETA_LC   : "&theta;";
IOTA_LC    : "&iota;";
KAPPA_LC   : "&kappa;";
LAMBDA_LC  : "&lambda;";
MU_LC      : "&mu;";
NU_LC      : "&nu;";
XI_LC      : "&xi;";
OMICRON_LC : "&omicron;";
PI_LC      : "&pi;";
RHO_LC     : "&rho;";
SIGMAF_LC  : "&sigmaf;";
SIGMA_LC   : "&sigma;";
TAU_LC     : "&tau;";
UPSILON_LC : "&upsilon;";
PHI_LC     : "&phi;";
CHI_LC     : "&chi;";
PSI_LC     : "&psi;";
OMEGA_LC   : "&omega;";
THETASYM   : "&thetasym;";
UPSIH      : "&upsih;";
PIV        : "&piv;";
BULL       : "&bull;";
HELLIP     : "&hellip;";
PRIME_LC   : "&prime;";
PRIME      : "&Prime;";
OLINE      : "&oline;";
FRASL      : "&frasl;";
WEIERP     : "&weierp;";
IMAGE      : "&image;";
REAL       : "&real;";
TRADE      : "&trade;";
ALEFSYM    : "&alefsym;";
LARR       : "&larr;";
UARR       : "&uarr;";
RARR       : "&rarr;";
DARR       : "&darr;";
HARR       : "&harr;";
CRARR      : "&crarr;";
LARR_D     : "&lArr;";
UARR_D     : "&uArr;";
RARR_D     : "&rArr;";
DARR_D     : "&dArr;";
HARR_D     : "&hArr;";
FORALL     : "&forall;";
PART       : "&part;";
EXIST      : "&exist;";
EMPTY      : "&empty;";
NABLA      : "&nabla;";
ISIN       : "&isin;";
NOTIN      : "&notin;";
NI         : "&ni;";
PROD       : "&prod;";
SUM        : "&sum;";
MINUS      : "&minus;";
LOWAST     : "&lowast;";
RADIC      : "&radic;";
PROP       : "&prop;";
INFIN      : "&infin;";
ANG        : "&ang;";
AND        : "&and;";
OR         : "&or;";
CAP        : "&cap;";
CUP        : "&cup;";
INT        : "&int;";
THERE4     : "&there4;";
SIM        : "&sim;";
CONG       : "&cong;";
ASYMP      : "&asymp;";
NE         : "&ne;";
EQUIV      : "&equiv;";
LE         : "&le;";
GE         : "&ge;";
SUB        : "&sub;";
SUP        : "&sup;";
NSUB       : "&nsub;";
SUBE       : "&sube;";
SUPE       : "&supe;";
OPLUS      : "&oplus;";
OTIMES     : "&otimes;";
PERP       : "&perp;";
SDOT       : "&sdot;";
LCEIL      : "&lceil;";
RCEIL      : "&rceil;";
LFLOOR     : "&lfloor;";
RFLOOR     : "&rfloor;";
LANG       : "&lang;";
RANG       : "&rang;";
LOZ        : "&loz;";
SPADES     : "&spades;";
CLUBS      : "&clubs;";
HEARTS     : "&hearts;";
DIAMS      : "&diams;";

//24.4.1 The list of characters
QUOT       : "&quot;";
AMP        : "&amp;";
LT         : "&lt;";
GT         : "&gt;";
OELIG      : "&OElig;";
OELIG_LC   : "&oelig;";
SCARON     : "&Scaron;";
SCARON_LC  : "&scaron;";
YUML       : "&Yuml;";
CIRC       : "&circ;";
TILDE      : "&tilde;";
ENSP       : "&ensp;";
EMSP       : "&emsp;";
THINSP     : "&thinsp;";
ZWNJ       : "&zwnj;";
ZWJ        : "&zwj;";
LRM        : "&lrm;";
RLM        : "&rlm;";
NDASH      : "&ndash;";
MDASH      : "&mdash;";
LSQUO      : "&lsquo;";
RSQUO      : "&rsquo;";
SBQUO      : "&sbquo;";
LDQUO      : "&ldquo;";
RDQUO      : "&rdquo;";
BDQUO      : "&bdquo;";
DAGGER_LC  : "&dagger;";
DAGGER     : "&Dagger;";
PERMIL     : "&permil;";
LSAQUO     : "&lsaquo;";
RSAQUO     : "&rsaquo;";
EURO       : "&euro;";

// Numeric character references (http://www.w3.org/TR/html4/charset.html#h-5.3.1)
// decimal
NCR_D : 
	"&#"! 
	(
		DIGIT 
		|	
		DIGIT DIGIT 
		|	
		DIGIT DIGIT DIGIT 
		|	
		DIGIT DIGIT DIGIT DIGIT 
		|	
		DIGIT DIGIT DIGIT DIGIT DIGIT 
		|	
		DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT 
		|	
		DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT 
	)
	";"!
	;

// hexadecimal
NCR_H :
	(
		"&#x"!
		|
		"&#X"!
	)
	(
		HEXDIGIT 
		|
		HEXDIGIT HEXDIGIT 
		|
		HEXDIGIT HEXDIGIT HEXDIGIT 
		|
		HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT 
		|
		HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT 
		|
		HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT  HEXDIGIT
	)
	";"!
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
protected	
HEXDIGIT : 
	'0'..'9'
	|
	'a'..'f'
	|
	'A'..'F'
	;
