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
package info.monitorenter.unicode.encoder.latex;

import java.io.IOException;
import java.io.OutputStreamWriter;
}
options{
//		language="java";	  
}

class LatexEncoder extends Parser; 
options{
		k=1;
		defaultErrorHandler = false;
}

encodeNext []  returns [Token token] {token=null;}
	: 
		( 
			token000 : QUOTATION_MARK  {
				token000.setText("\\'\\'"); 
				token = token000;
			}
			|
			token001 : NUMBER_SIGN {
				token001.setText("\\#");
				token = token001;
			}
			|
			token002 : DOLLAR_SIGN {
				token002.setText("\\$");
				token = token002;
			}
			|
			token003 : PERCENT_SIGN {
				token003.setText("\\%");
				token = token003;
			}
			|
			token004 : AMPERSAND {
				token004.setText("\\&");
				token = token004;
			}
			|
			token005 : APOSTROPHE {
				token005.setText("\\'");
				token = token005;
			}
			|
			token006 : ASTERISK {
				token006.setText("$\\star$");
				token = token006;
			}
			|
			token007 : CIRCUMFLEX {
				token007.setText("\\^{}");
				token = token007;
			}
			|
			token008 : LEFT_SQUARE_BRACKET {
				token008.setText("\\[");
				token = token008;
			}
			|
			token009 : RIGHT_SQUARE_BRACKET {
				token009.setText("\\]");
				token = token009;
			}
			|
			token010 : LOW_LINE {
				token010.setText("\\_");
				token = token010;
			}
			|
			token011 : LEFT_CURLY_BRACKET {
				token011.setText("\\{");
				token = token011;
			}
			|
			token012 : RIGHT_CURLY_BRACKET {
				token012.setText("\\}");
				token = token012;
			}
			|
			token013 : CENT_SIGN {
				token002.setText("$\\varnothing$");
				token = token013;
			}
			|
			token014 : POUND_SIGN {
				token014.setText("\\pounds");
				token = token014;
			}
			|
			token015 : COPYRIGHT_SIGN {
				token015.setText("\\copyright");
				token = token015;
			}
			|
			token016 : REGISTERED_SIGN {
				token016.setText("\\textregistered");
				token = token016;
			}
			|
			token017 : DEGREE_SIGN {
				token017.setText("$\\,^{\\circ}\\mathrm{C}$");
				token = token017;
			}
			|
			token018 : LATIN_CAPITAL_LETTER_A_WITH_GRAVE {
				token018.setText("\\`A");
				token = token018;
			}
			|
			token019 : LATIN_CAPITAL_LETTER_A_WITH_ACUTE {
				token019.setText("\\'A");
				token = token019;
			}
			|
			token020 : LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX {
				token020.setText("\\^A");
				token = token020;
			}
			|
			token021 : LATIN_CAPITAL_LETTER_A_WITH_TILDE {
				token021.setText("\\~A");
				token = token021;
			}
			|
			token022 : LATIN_CAPITAL_LETTER_A_WITH_DIAERESIS {
				token022.setText("\\\"A");
				token = token022;
			}
			|
			token023 : LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE {
				token023.setText("\\AA");
				token = token023;
			}
			|
			token024 : LATIN_CAPITAL_LETTER_AE {
				token024.setText("\\AE");
				token = token024;
			}
			|
			token025 : LATIN_CAPITAL_LETTER_C_WITH_CEDILLA {
				token025.setText("\\c C");
				token = token025;
			}
			|
			token026 : LATIN_CAPITAL_LETTER_E_WITH_GRAVE {
				token026.setText("\\`E");
				token = token026;
			}
			|
			token027 : LATIN_CAPITAL_LETTER_E_WITH_ACUTE {
				token027.setText("\\'E");
				token = token027;
			}
			|
			token028 : LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX {
				token028.setText("\\^E");
				token = token028;
			}
			|
			token029 : LATIN_CAPITAL_LETTER_E_WITH_DIAERESIS {
				token029.setText("\\\"E");
				token = token029;
			}
			|
			token030 : LATIN_CAPITAL_LETTER_I_WITH_GRAVE {
				token030.setText("\\`I");
				token = token030;
			}
			|
			token031 : LATIN_CAPITAL_LETTER_I_WITH_ACUTE {
				token031.setText("\\'I");
				token = token031;
			}
			|
			token032 : LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX {
				token032.setText("\\^I");
				token = token032;
			}
			|
			token033 : LATIN_CAPITAL_LETTER_I_WITH_DIAERESIS {
				token033.setText("\\\"I");
				token033 = token002;
			}
			|
			// TODO: search for an upper case ETH in latex! 
			token034 : LATIN_CAPITAL_LETTER_ETH {
				token034.setText("$\\eth$");
				token = token034;
			}
			|
			token035 : LATIN_CAPITAL_LETTER_N_WITH_TILDE {
				token035.setText("\\~N");
				token = token035;
			}
			|
			token036 : LATIN_CAPITAL_LETTER_O_WITH_GRAVE {
				token036.setText("\\`O");
				token = token036;
			}
			|
			token037 : LATIN_CAPITAL_LETTER_O_WITH_ACUTE {
				token037.setText("\\'O");
				token = token037;
			}
			|
			token038 : LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX {
				token038.setText("\\^O");
				token = token038;
			}
			|
			token039 : LATIN_CAPITAL_LETTER_O_WITH_TILDE {
				token039.setText("\\~O");
				token = token039;
			}
			|
			token040 : LATIN_CAPITAL_LETTER_O_WITH_DIAERESIS {
				token040.setText("\\\"O");
				token = token040;
			}
			|
			token041 : MULTIPLICATION_SIGN {
				token041.setText("$*$");
				token = token041;
			}
			|
			token042 : LATIN_CAPITAL_LETTER_O_WITH_STROKE {
				token042.setText("\\O");
				token = token042;
			}
			|
			token043 : LATIN_CAPITAL_LETTER_U_WITH_GRAVE {
				token043.setText("\\`U");
				token = token043;
			}
			|
			token044 : LATIN_CAPITAL_LETTER_U_WITH_ACUTE {
				token044.setText("\\'U");
				token = token044;
			}
			|
			token045 : LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX {
				token045.setText("\\^U");
				token = token045;
			}
			|
			token046 : LATIN_CAPITAL_LETTER_U_WITH_DIAERESIS {
				token046.setText("\\\"U");
				token = token046;
			}
			|
			token047 : LATIN_CAPITAL_LETTER_Y_WITH_ACUTE {
				token047.setText("\\'Y");
				token = token047;
			}
			|
			// TODO: this is not supported by Latex?
			token048 : LATIN_CAPITAL_LETTER_THORN {
				// token048.setText("\\#");
				token = token048;
			}
			|
			token049 : LATIN_SMALL_LETTER_SHARP_S {
				token049.setText("\\ss");
				token = token049;
			}
			|
			token050 : LATIN_SMALL_LETTER_A_WITH_GRAVE {
				token050.setText("\\`a");
				token = token050;
			}
			|
			token051 : LATIN_SMALL_LETTER_A_WITH_ACUTE {
				token051.setText("\\'a");
				token = token051;
			}
			|
			token052 : LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX {
				token052.setText("\\^a");
				token = token052;
			}
			|
			token053 : LATIN_SMALL_LETTER_A_WITH_TILDE {
				token053.setText("\\~a");
				token = token053;
			}
			|
			token054 : LATIN_SMALL_LETTER_A_WITH_DIAERESIS {
				token054.setText("\\\"a");
				token = token054;
			}
			|
			token055 : LATIN_SMALL_LETTER_A_WITH_RING_ABOVE {
				token055.setText("\\aa");
				token = token055;
			}
			|
			token056 : LATIN_SMALL_LETTER_AE {
				token056.setText("\\ae");
				token = token056;
			}
			|
			token057 : LATIN_SMALL_LETTER_C_WITH_CEDILLA {
				token057.setText("\\c c");
				token = token057;
			}
			|
			token058 : LATIN_SMALL_LETTER_E_WITH_GRAVE {
				token058.setText("\\`e");
				token = token058;
			}
			|
			token059 : LATIN_SMALL_LETTER_E_WITH_ACUTE {
				token059.setText("\\'e");
				token = token059;
			}
			|
			token060 : LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX {
				token060.setText("\\^e");
				token = token060;
			}
			|
			token061 : LATIN_SMALL_LETTER_E_WITH_DIAERESIS {
				token061.setText("\\\"e");
				token = token061;
			}
			|
			token062 : LATIN_SMALL_LETTER_I_WITH_GRAVE {
				token062.setText("\\`i");
				token = token062;
			}
			|
			token063 : LATIN_SMALL_LETTER_I_WITH_ACUTE {
				token063.setText("\\'i");
				token = token063;
			}
			|
			token064 : LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX {
				token064.setText("\\^i");
				token = token064;
			}
			|
			token065 : LATIN_SMALL_LETTER_I_WITH_DIAERESIS {
				token065.setText("\\\"i");
				token = token065;
			}
			|
			token066 : LATIN_SMALL_LETTER_ETH {
				token066.setText("$\\eth$");
				token = token066;
			}
			|
			token067 : LATIN_SMALL_LETTER_N_WITH_TILDE {
				token067.setText("\\~n");
				token = token067;
			}
			|
			token068 : LATIN_SMALL_LETTER_O_WITH_GRAVE {
				token068.setText("\\`o");
				token = token068;
			}
			|
			token069 : LATIN_SMALL_LETTER_O_WITH_ACUTE {
				token069.setText("\\'o");
				token = token069;
			}
			|
			token070 : LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX {
				token070.setText("\\^o");
				token = token070;
			}
			|
			token071 : LATIN_SMALL_LETTER_O_WITH_TILDE {
				token071.setText("\\~o");
				token = token071;
			}
			|
			token072 : LATIN_SMALL_LETTER_O_WITH_DIAERESIS {
				token072.setText("\\\"o");
				token = token072;
			}
			|
			token073 : DIVISION_SIGN {
				token073.setText("$\\div$");
				token = token073;
			}
			|
			token074 : LATIN_SMALL_LETTER_O_WITH_STROKE {
				token074.setText("\\o");
				token = token074;
			}
			|
			token075 : LATIN_SMALL_LETTER_U_WITH_GRAVE {
				token075.setText("\\`u");
				token = token075;
			}
			|
			token076 : LATIN_SMALL_LETTER_U_WITH_ACUTE {
				token076.setText("\\'u");
				token = token076;
			}
			|
			token077 : LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX {
				token077.setText("\\^u");
				token = token077;
			}
			|
			token078 : LATIN_SMALL_LETTER_U_WITH_DIAERESIS {
				token078.setText("\\\"u");
				token = token078;
			}
			|
			token079 : LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX {
				token079.setText("\\^u");
				token = token079;
			}
			|
			token080 : LATIN_SMALL_LETTER_U_WITH_DIAERESIS {
				token080.setText("\\\"u");
				token = token080;
			}
			|
			token081 : LATIN_SMALL_LETTER_Y_WITH_ACUTE {
				token080.setText("\\'y");
				token = token080;
			}
			|
			// TODO: this is not supported by latex?
			token082 : LATIN_SMALL_LETTER_THORN {
				//token082.setText("\\\"u");
				token = token082;
			}
			|
			token083 : LATIN_SMALL_LETTER_Y_WITH_DIAERESIS {
				token083.setText("\\\"y");
				token = token083; 
			}
			|
			// TODO: this is not supported by latex?
			token084 : EURO_CURRENCY {
				//token084.setText("\\\"u");
				token = token084;
			}
			|
			token085 : EURO_SIGN {
				token085.setText("\\euro");
				token = token085;
			}
			|
			tokenAnyChar : ANY_CHAR {
				token = tokenAnyChar;
			} 
			|
			tokenEOF : EOF {
				token = tokenEOF;
			}
			
		)
	;
 

class LatexEncoderLexer extends Lexer;
options{
	codeGenDebug=false; 
	k=7;
	charVocabulary='\u0000'..'\uFFFE';
	genHashLines=true;
	caseSensitive= true;
	filter = false;
}

QUOTATION_MARK        : '\u0022'; // differ between starting and ending "
NUMBER_SIGN           : '\u0023'; // \#
DOLLAR_SIGN           : '\u0024'; // \$  
PERCENT_SIGN          : '\u0025'; // \%
AMPERSAND             : '\u0026'; // \&
APOSTROPHE            : '\'';     // differ between starting and ending ' (\u0027 is for java the same as: ' and has to be used  in escaped form)
ASTERISK              : '\u002A'; // $\star$
CIRCUMFLEX            : '\u005E'; // \^{}
LEFT_SQUARE_BRACKET   : '\u005B'; // \[
RIGHT_SQUARE_BRACKET  : '\u005D'; // \]
LOW_LINE              : '\u005F'; // \_
LEFT_CURLY_BRACKET    : '\u007B'; // \{
RIGHT_CURLY_BRACKET   : '\u007D'; // \}
CENT_SIGN             : '\u00A2';
POUND_SIGN            : '\u00A3';
COPYRIGHT_SIGN        : '\u00A9';
REGISTERED_SIGN       : '\u00AE';
DEGREE_SIGN           : '\u00B0';


LATIN_CAPITAL_LETTER_A_WITH_GRAVE      : '\u00C0'; // A\�
LATIN_CAPITAL_LETTER_A_WITH_ACUTE      : '\u00C1'; // A\`
LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX : '\u00C2';
LATIN_CAPITAL_LETTER_A_WITH_TILDE      : '\u00C3';
LATIN_CAPITAL_LETTER_A_WITH_DIAERESIS  : '\u00C4';
LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE : '\u00C5';
LATIN_CAPITAL_LETTER_AE                : '\u00C6';
LATIN_CAPITAL_LETTER_C_WITH_CEDILLA    : '\u00C7';
LATIN_CAPITAL_LETTER_E_WITH_GRAVE      : '\u00C8';
LATIN_CAPITAL_LETTER_E_WITH_ACUTE      : '\u00C9';
LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX : '\u00CA';
LATIN_CAPITAL_LETTER_E_WITH_DIAERESIS  : '\u00CB';
LATIN_CAPITAL_LETTER_I_WITH_GRAVE      : '\u00CC';
LATIN_CAPITAL_LETTER_I_WITH_ACUTE      : '\u00CD';
LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX : '\u00CE';
LATIN_CAPITAL_LETTER_I_WITH_DIAERESIS  : '\u00CD';
LATIN_CAPITAL_LETTER_ETH               : '\u00D0';
LATIN_CAPITAL_LETTER_N_WITH_TILDE      : '\u00D1';
LATIN_CAPITAL_LETTER_O_WITH_GRAVE      : '\u00D2';
LATIN_CAPITAL_LETTER_O_WITH_ACUTE      : '\u00D3';
LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX : '\u00D4';
LATIN_CAPITAL_LETTER_O_WITH_TILDE      : '\u00D5';
LATIN_CAPITAL_LETTER_O_WITH_DIAERESIS  : '\u00D6';
MULTIPLICATION_SIGN                    : '\u00D7'; // $*$
LATIN_CAPITAL_LETTER_O_WITH_STROKE     : '\u00D8';
LATIN_CAPITAL_LETTER_U_WITH_GRAVE      : '\u00D9';
LATIN_CAPITAL_LETTER_U_WITH_ACUTE      : '\u00DA';
LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX : '\u00DB';
LATIN_CAPITAL_LETTER_U_WITH_DIAERESIS  : '\u00DC';
LATIN_CAPITAL_LETTER_Y_WITH_ACUTE      : '\u00DD';
LATIN_CAPITAL_LETTER_THORN             : '\u00DE';
LATIN_SMALL_LETTER_SHARP_S             : '\u00DF';
LATIN_SMALL_LETTER_A_WITH_GRAVE        : '\u00E0';
LATIN_SMALL_LETTER_A_WITH_ACUTE        : '\u00E1';
LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX   : '\u00E2';
LATIN_SMALL_LETTER_A_WITH_TILDE        : '\u00E3';
LATIN_SMALL_LETTER_A_WITH_DIAERESIS    : '\u00E4';
LATIN_SMALL_LETTER_A_WITH_RING_ABOVE   : '\u00E5';
LATIN_SMALL_LETTER_AE                  : '\u00E6';
LATIN_SMALL_LETTER_C_WITH_CEDILLA      : '\u00E7';
LATIN_SMALL_LETTER_E_WITH_GRAVE        : '\u00E8';
LATIN_SMALL_LETTER_E_WITH_ACUTE        : '\u00E9';
LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX   : '\u00EA';
LATIN_SMALL_LETTER_E_WITH_DIAERESIS    : '\u00EB';
LATIN_SMALL_LETTER_I_WITH_GRAVE        : '\u00EC';
LATIN_SMALL_LETTER_I_WITH_ACUTE        : '\u00ED';
LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX   : '\u00EE';
LATIN_SMALL_LETTER_I_WITH_DIAERESIS    : '\u00EF'; 
LATIN_SMALL_LETTER_ETH                 : '\u00F0';
LATIN_SMALL_LETTER_N_WITH_TILDE        : '\u00F1';
LATIN_SMALL_LETTER_O_WITH_GRAVE        : '\u00F2';
LATIN_SMALL_LETTER_O_WITH_ACUTE        : '\u00F3';
LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX   : '\u00F4';
LATIN_SMALL_LETTER_O_WITH_TILDE        : '\u00F5';
LATIN_SMALL_LETTER_O_WITH_DIAERESIS    : '\u00F6';
DIVISION_SIGN                          : '\u00F7'; // $/$
LATIN_SMALL_LETTER_O_WITH_STROKE       : '\u00F8';
LATIN_SMALL_LETTER_U_WITH_GRAVE        : '\u00F9';
LATIN_SMALL_LETTER_U_WITH_ACUTE        : '\u00FA';
LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX   : '\u00FB';
LATIN_SMALL_LETTER_U_WITH_DIAERESIS    : '\u00FC';
LATIN_SMALL_LETTER_Y_WITH_ACUTE        : '\u00FD';
LATIN_SMALL_LETTER_THORN               : '\u00FE';
LATIN_SMALL_LETTER_Y_WITH_DIAERESIS    : '\u00FF';

EURO_CURRENCY                          : '\u20A0';
EURO_SIGN                              : '\u20AC';



	
// newline UNIX and Windows to have correct lexer line information
ANY_CHAR   :
	'\n' { newline();} 
	| 
	'\r' '\n'{ newline(); } 
	|
    .;  
   
