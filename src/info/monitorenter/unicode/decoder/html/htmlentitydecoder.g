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
{
	/** 
	 * Flag to remember if a character entity reference
	 * may be contained in the decoded result so far.<p>
	 */
	private boolean m_potentialRemainingEntity = false;

	/**
	 * Decodes the given html input by replacing the character  
	 * entity references (named and numeric) by the unicode character 
	 * codes.
	 * <p>
	 * The result is written to the output stream.
	 * If &amp;amp; was found true is returned because the decoded 
	 * output then could contain a new character entity reference.
	 *
	 * @return true if &amp;amp; was found thus the result could 
	 *              contain a new character entity reference. 
	 */
	 public boolean isPotentialRemainingEntity () {
	 	return this.m_potentialRemainingEntity;
	 }
}

/**
 * Decodes the next <code>{@link antlr.Token}</code> 
 * with the decoded text.
 * <p>
 *
 * @return the next <code>{@link antlr.Token}</code> 
 *         with the decoded text.
 */
decodeNext [] returns [Token token] throws IOException 
{
	token=null;
}
	: 
	token000 : NBSP {
	    // \u00A0 could be an alternative?
		token000.setText(" "); 
		token = token000;
	}
	|
	token001 : IEXCL {
		token001.setText(String.valueOf('\u00A1')); 
		token = token001;
	}
	|
	token002 : CENT {
			token002.setText(String.valueOf('\u00A2')); 
			token = token002;
	}
	|
	token003 : POUND {
		token003.setText(String.valueOf('\u00A3')); 
		token = token003;
	}
	|
	token004 : CURREN {
		token004.setText(String.valueOf('\u00A4')); 
		token = token004;
	}
	|
	token005 : YEN {
		token005.setText(String.valueOf('\u00A5')); 
		token = token005;
	}
	| 
	token006 : BRVBAR {
		token006.setText(String.valueOf('\u00A6')); 
		token = token006;
	}
	|
	token007 : SECT {
		token007.setText(String.valueOf('\u00A7')); 
		token = token007;
	}
	|
	token008 : UML {
		token008.setText(String.valueOf('\u00A8')); 
		token = token008;
	}
	|
	token009 : COPY {
		token009.setText(String.valueOf('\u00A9')); 
		token = token009;
	}
	|
	token010 : ORDF {
		token010.setText(String.valueOf('\u00AA')); 
		token = token010;
	}
	|
	token011 : LAQUO {
		token011.setText(String.valueOf('\u00AB')); 
		token = token011;
	}
	|
	token012 : NOT {
		token012.setText(String.valueOf('\u00AC')); 
		token = token012;
	}
	|
	token013 : SHY {
		token013.setText(String.valueOf('\u00AD')); 
		token = token013;
	}
	|
	token014 : REG {
		token014.setText(String.valueOf('\u00AE')); 
		token = token014;
	}
	|
	token015 : MACR {
		token015.setText(String.valueOf('\u00AF')); 
		token = token015;
	}
	|
	token016 : DEG {
		token016.setText(String.valueOf('\u00B0')); 
		token = token016;
	}
	|
	token017 : PLUSMN {
		token017.setText(String.valueOf('\u00B1')); 
		token = token017;
	}
	|
	token018 : SUP2 {
		token018.setText(String.valueOf('\u00B2')); 
		token = token018;
	}
	|
	token019 : SUP3 {
		token019.setText(String.valueOf('\u00B3')); 
		token = token019;
	}
	|
	token020 : ACUTE {
		token020.setText(String.valueOf('\u00B4')); 
		token = token020;
	}
	|
	token021 :  MICRO {
		token021.setText(String.valueOf('\u00B5')); 
		token = token021;
	}
	|
	token022 : PARA {
		token022.setText(String.valueOf('\u00B6')); 
		token = token022;
	}
	|
	token023 : MIDDOT {
		token023.setText(String.valueOf('\u00B7')); 
		token = token023;
	}
	|
	token024 : CEDIL {
		token024.setText(String.valueOf('\u00B8')); 
		token = token024;
	}
	|
	token025 : SUP1 {
		token025.setText(String.valueOf('\u00B9')); 
		token = token025;
	}
	|
	token026 : ORDM {
		token026.setText(String.valueOf('\u00BA')); 
		token = token026;
	}
	|
	token027 : RAQUO {
		token027.setText(String.valueOf('\u00BB')); 
		token = token027;
	}
	|
	token028 : FRAC14 {
		token028.setText(String.valueOf('\u00BC')); 
		token = token028;
	}
	|
	token029 : FRAC12 {
		token029.setText(String.valueOf('\u00BD')); 
		token = token029;
	}
	|
	token030 : FRAC34 {
		token030.setText(String.valueOf('\u00BE')); 
		token = token030;
	}
	|
	token031 : IQUEST {
		token031.setText(String.valueOf('\u00BF')); 
		token = token031;
	}
	|
	token032 : AGRAVE {
		token032.setText(String.valueOf('\u00C0')); 
		token = token032;
	}
	|
	token033 : AACUTE {
		token033.setText(String.valueOf('\u00C1')); 
		token = token033;
	}
	|
	token034 : ACIRC {
		token034.setText(String.valueOf('\u00C2')); 
		token = token034;
	}
	|
	token035 : ATILDE {
		token035.setText(String.valueOf('\u00C3')); 
		token = token035;
	}
	|
	token036 : AUML {
		token036.setText(String.valueOf('\u00C4')); 
		token = token036;
	}
	|
	token037 : ARING {
		token037.setText(String.valueOf('\u00C5')); 
		token = token037;
	}
	|
	token038 : AELIG {
		token038.setText(String.valueOf('\u00C6')); 
		token = token038;
	}
	|
	token039 : CCEDIL {
		token039.setText(String.valueOf('\u00C7')); 
		token = token039;
	}
	|
	token040 : EGRAVE {
		token040.setText(String.valueOf('\u00C8')); 
		token = token040;
	}
	|
	token041 : EACUTE {
		token041.setText(String.valueOf('\u00C9')); 
		token = token041;
	}
	|
	tokenEcirc : ECIRC {
		tokenEcirc.setText(String.valueOf('\u00CA')); 
		token = tokenEcirc;
	}
	|
	token042 : EUML {
		token042.setText(String.valueOf('\u00CB')); 
		token = token042;
	}
	|
	token043 : IGRAVE {
		token043.setText(String.valueOf('\u00CC')); 
		token = token043;
	}
	|
	token044 : IACUTE {
		token044.setText(String.valueOf('\u00CD')); 
		token = token044;
	}
	|
	token045 : ICIRC {
		token045.setText(String.valueOf('\u00CE')); 
		token = token045;
	}
	|
	token046 : IUML {
		token046.setText(String.valueOf('\u00CF')); 
		token = token046;
	}
	|
	token047 : ETH {
		token047.setText(String.valueOf('\u00D0')); 
		token = token047;
	}
	|
	token048 : NTILDE {
		token048.setText(String.valueOf('\u00D1')); 
		token = token048;
	}
	|
	token049 : OGRAVE {
		token049.setText(String.valueOf('\u00D2')); 
		token = token049;
	}
	|
	token050 : OACUTE {
		token050.setText(String.valueOf('\u00D3')); 
		token = token050;
	}
	|
	token051 : OCIRC {
		token051.setText(String.valueOf('\u00D4')); 
		token = token051;
	}
	|
	token052 : OTILDE {
		token052.setText(String.valueOf('\u00D5')); 
		token = token052;
	}
	|
	token053 : OUML {
		token053.setText(String.valueOf('\u00D6')); 
		token = token053;
	}
	|
	token054 : TIMES {
		token054.setText(String.valueOf('\u00D7')); 
		token = token054;
	}
	|
	token055 : OSLASH {
		token055.setText(String.valueOf('\u00D8')); 
		token = token055;
	}
	|
	token056 : UGRAVE {
		token056.setText(String.valueOf('\u00D9')); 
		token = token056;
	}
	|
	token057 : UACUTE {
		token057.setText(String.valueOf('\u00DA')); 
		token = token057;
	}
	|
	token058 : UCIRC {
		token058.setText(String.valueOf('\u00DB')); 
		token = token058;
	}
	|
	token059 : UUML {
		token059.setText(String.valueOf('\u00DC')); 
		token = token059;
	}
	|
	token060 : YACUTE {
		token060.setText(String.valueOf('\u00DD')); 
		token = token060;
	}
	|
	token061 : THORN {
		token061.setText(String.valueOf('\u00DE')); 
		token = token061;
	}
	|
	token062 : SZLIG {
		token062.setText(String.valueOf('\u00DF')); 
		token = token062;
	}
	|
	token063 : AGRAVE_LC {
		token063.setText(String.valueOf('\u00E0')); 
		token = token063;
	}
	|
	token064 : AACUTE_LC {
		token064.setText(String.valueOf('\u00E1')); 
		token = token064;
	}
	|
	token065 : ACIRC_LC {
		token065.setText(String.valueOf('\u00E2')); 
		token = token065;
	}
	|
	token066 : ATILDE_LC {
		token066.setText(String.valueOf('\u00E3')); 
		token = token066;
	}
	|
	token067 : AUML_LC {
		token067.setText(String.valueOf('\u00E4')); 
		token = token067;
	}
	|
	token068 : ARING_LC {
		token068.setText(String.valueOf('\u00E5')); 
		token = token068;
	}
	|
	token069 : AELIG_LC {
		token069.setText(String.valueOf('\u00E6')); 
		token = token069;
	}
	|
	token070 : CCEDIL_LC {
		token070.setText(String.valueOf('\u00E7')); 
		token = token070;
	}
	|
	token071 : EGRAVE_LC {
		token071.setText(String.valueOf('\u00E8')); 
		token = token071;
	}
	|
	token072 : EACUTE_LC {
		token072.setText(String.valueOf('\u00E9')); 
		token = token072;
	}
	|
	token073 : ECIRC_LC {
		token073.setText(String.valueOf('\u00EA')); 
		token = token073;
	}
	|
	token074 : EUML_LC {
		token074.setText(String.valueOf('\u00EB')); 
		token = token074;
	}
	|
	token075 : IGRAVE_LC {
		token075.setText(String.valueOf('\u00EC')); 
		token = token075;
	}
	|
	token076 : IACUTE_LC {
		token076.setText(String.valueOf('\u00ED')); 
		token = token076;
	}
	|
	token077 : ICIRC_LC {
		token077.setText(String.valueOf('\u00EE')); 
		token = token077;
	}
	|
	token078 : IUML_LC {
		token078.setText(String.valueOf('\u00EF')); 
		token = token078;
	}
	|
	token079 : ETH_LC {
		token079.setText(String.valueOf('\u00F0')); 
		token = token079;
	}
	|
	token080 : NTILDE_LC {
		token080.setText(String.valueOf('\u00F1')); 
		token = token080;
	}
	|
	token081 : OGRAVE_LC {
		token081.setText(String.valueOf('\u00F2')); 
		token = token081;
	}
	|
	token082 : OACUTE_LC {
		token082.setText(String.valueOf('\u00F3')); 
		token = token082;
	}
	|
	token083 : OCIRC_LC {
		token083.setText(String.valueOf('\u00F4')); 
		token = token083;
	}
	|
	token084 : OTILDE_LC {
		token084.setText(String.valueOf('\u00F5')); 
		token = token084;
	}
	|
	token085 : OUML_LC {
		token085.setText(String.valueOf('\u00F6')); 
		token = token085;
	}
	|
	token086 : DIVIDE {
		token086.setText(String.valueOf('\u00F7')); 
		token = token086;
	}
	|
	token087 : OSLASH_LC {
		token087.setText(String.valueOf('\u00F8')); 
		token = token087;
	}
	|
	token088 : UGRAVE_LC {
		token088.setText(String.valueOf('\u00F9')); 
		token = token088;
	}
	|
	token089 : UACUTE_LC {
		token089.setText(String.valueOf('\u00FA')); 
		token = token089;
	}
	|
	token090 : UCIRC_LC {
		token090.setText(String.valueOf('\u00FB')); 
		token = token090;
	}
	|
	token091 : UUML_LC {
		token091.setText(String.valueOf('\u00FC')); 
		token = token091;
	}
	|
	token092 : YACUTE_LC {
		token092.setText(String.valueOf('\u00FD')); 
		token = token092;
	}
	|
	token093 : THORN_LC {
		token093.setText(String.valueOf('\u00FE')); 
		token = token093;
	}
	|
	token094 : YUML_LC {
		token094.setText(String.valueOf('\u00FF')); 
		token = token094;
	}
	|
	token095 : ALPHA {
		token095.setText(String.valueOf('\u0391')); 
		token = token095;
	}
	|
	token096 : BETA {
		token096.setText(String.valueOf('\u0392')); 
		token = token096;
	}
	|
	token097 : GAMMA {
		token097.setText(String.valueOf('\u0393')); 
		token = token097;
	}
	|
	token098 : DELTA {
		token098.setText(String.valueOf('\u0394')); 
		token = token098;
	}
	|
	token099 : EPSILON {
		token099.setText(String.valueOf('\u0395')); 
		token = token099;
	}
	|
	token100 : ZETA {
		token100.setText(String.valueOf('\u0396')); 
		token = token100;
	}
	|
	token101 : ETA {
		token101.setText(String.valueOf('\u0397')); 
		token = token101;
	}
	|
	token102 : THETA {
		token102.setText(String.valueOf('\u0398')); 
		token = token102;
	}
	|
	token103 : IOTA {
		token103.setText(String.valueOf('\u0399')); 
		token = token103;
	}
	|
	token104 : KAPPA {
		token104.setText(String.valueOf('\u039A')); 
		token = token104;
	}
	|
	token105 : LAMBDA {
		token105.setText(String.valueOf('\u039B')); 
		token = token105;
	}
	|
	token106 : MU {
		token106.setText(String.valueOf('\u039C')); 
		token = token106;
	}
	|
	token107 : NU {
		token107.setText(String.valueOf('\u039D')); 
		token = token107;
	}
	|
	token108 : XI {
		token108.setText(String.valueOf('\u039E')); 
		token = token108;
	}
	|
	token109 : OMICRON {
		token109.setText(String.valueOf('\u039F')); 
		token = token109;
	}
	|
	token110 : PI {
		token110.setText(String.valueOf('\u03A0')); 
		token = token110;
	}
	|
	token111 : RHO {
		token111.setText(String.valueOf('\u03A1')); 
		token = token111;
	}
	|
	token112 : SIGMA {
		token112.setText(String.valueOf('\u03A3')); 
		token = token112;
	}
	|
	token113 : TAU {
		token113.setText(String.valueOf('\u03A4')); 
		token = token113;
	}
	|
	token114 : UPSILON {
		token114.setText(String.valueOf('\u03A5')); 
		token = token114;
	}
	|
	token115 : PHI {
		token115.setText(String.valueOf('\u03A6')); 
		token = token115;
	}
	|
	token116 : CHI {
		token116.setText(String.valueOf('\u03A7')); 
		token = token116;
	}
	|
	token117 : PSI {
		token117.setText(String.valueOf('\u03A8')); 
		token = token117;
	}
	|
	token118 : OMEGA {
		token118.setText(String.valueOf('\u03A9')); 
		token = token118;
	}
	|
	token119 : ALPHA_LC {
		token119.setText(String.valueOf('\u03B1')); 
		token = token119;
	}
	|
	token120 : BETA_LC {
		token120.setText(String.valueOf('\u03B2')); 
		token = token120;
	}
	|
	token121 : GAMMA_LC {
		token121.setText(String.valueOf('\u03B3')); 
		token = token121;
	}
	|
	token122 : DELTA_LC  {
		token122.setText(String.valueOf('\u03B4')); 
		token = token122;
	}
	|
	token123 : EPSILON_LC {
		token123.setText(String.valueOf('\u03B5')); 
		token = token123;
	}
	|
	token124 : ZETA_LC {
		token124.setText(String.valueOf('\u03B6')); 
		token = token124;
	}
	|
	token125 : ETA_LC {
		token125.setText(String.valueOf('\u03B7')); 
		token = token125;
	}
	|
	token126 : THETA_LC {
		token126.setText(String.valueOf('\u03B8')); 
		token = token126;
	}
	|
	token127 : IOTA_LC {
		token127.setText(String.valueOf('\u03B9')); 
		token = token127;
	}
	|
	token128 : KAPPA_LC {
		token128.setText(String.valueOf('\u03BA')); 
		token = token128;
	}
	|
	token129 : LAMBDA_LC {
		token129.setText(String.valueOf('\u03BB')); 
		token = token129;
	}
	|
	token130 : MU_LC {
		token130.setText(String.valueOf('\u03BC')); 
		token = token130;
	}
	|
	token131 : NU_LC {
		token131.setText(String.valueOf('\u03BD')); 
		token = token131;
	}
	|
	token132 : XI_LC {
		token132.setText(String.valueOf('\u03BE')); 
		token = token132;
	}
	|
	token133 : OMICRON_LC {
		token133.setText(String.valueOf('\u03BF')); 
		token = token133;
	}
	|
	token134 : PI_LC {
		token134.setText(String.valueOf('\u03C0')); 
		token = token134;
	}
	|
	token135 : RHO_LC {
		token135.setText(String.valueOf('\u03C1')); 
		token = token135;
	}
	|
	token136 : SIGMAF_LC {
		token136.setText(String.valueOf('\u03C2')); 
		token = token136;
	}
	|
	token137 : SIGMA_LC {
		token137.setText(String.valueOf('\u03C3')); 
		token = token137;
	}
	|
	token138 : TAU_LC {
		token138.setText(String.valueOf('\u03C4')); 
		token = token138;
	}
	|
	token139 : UPSILON_LC {
		token139.setText(String.valueOf('\u03C5')); 
		token = token139;
	}
	|
	token140 : PHI_LC {
		token140.setText(String.valueOf('\u03C6')); 
		token = token140;
	}
	|
	token141 : CHI_LC {
		token141.setText(String.valueOf('\u03C7')); 
		token = token141;
	}
	|
	token142 : PSI_LC {
		token142.setText(String.valueOf('\u03C8')); 
		token = token142;
	}
	|
	token143 : OMEGA_LC {
		token143.setText(String.valueOf('\u03C9')); 
		token = token143;
	}
	|
	token144 : THETASYM {
		token144.setText(String.valueOf('\u03D1')); 
		token = token144;
	}
	|
	token145 : UPSIH {
		token145.setText(String.valueOf('\u03D2')); 
		token = token145;
	}
	|
	token146 : PIV {
		token146.setText(String.valueOf('\u03D6')); 
		token = token146;
	}
	| 
	token147 : BULL {
		token147.setText(String.valueOf('\u2022')); 
		token = token147;
	}
	|
	token148 : HELLIP {
		token148.setText(String.valueOf('\u2026')); 
		token = token148;
	}
	|
	token149 : PRIME_LC {
		token149.setText(String.valueOf('\u2032')); 
		token = token149;
	}
	|
	token150 : PRIME {
		token150.setText(String.valueOf('\u2033')); 
		token = token150;
	}
	|
	token151 : OLINE {
		token151.setText(String.valueOf('\u203E')); 
		token = token151;
	}
	|
	token152 : FRASL {
		token152.setText(String.valueOf('\u2044')); 
		token = token152;
	}
	|
	token153 : WEIERP {
		token153.setText(String.valueOf('\u2118')); 
		token = token153;
	}
	|
	token154 : IMAGE {
		token154.setText(String.valueOf('\u2111')); 
		token = token154;
	}
	|
	token155 : REAL {
		token155.setText(String.valueOf('\u211C')); 
		token = token155;
	}
	|
	token156 : TRADE {
		token156.setText(String.valueOf('\u2122')); 
		token = token156;
	}
	|
	token157 : ALEFSYM {
		token157.setText(String.valueOf('\u2135')); 
		token = token157;
	}
	|
	token158 : LARR {
		token158.setText(String.valueOf('\u2190')); 
		token = token158;
	}
	|
	token159 : UARR {
		token159.setText(String.valueOf('\u2191')); 
		token = token159;
	}
	|
	token160 : RARR {
		token160.setText(String.valueOf('\u2192')); 
		token = token160;
	}
	|
	token161 : DARR {
		token161.setText(String.valueOf('\u2193')); 
		token = token161;
	}
	|
	token162 : HARR {
		token162.setText(String.valueOf('\u2194')); 
		token = token162;
	}
	|
	token163 : CRARR {
		token163.setText(String.valueOf('\u21B5')); 
		token = token163;
	}
	|
	token164 : LARR_D {
		token164.setText(String.valueOf('\u21D0')); 
		token = token164;
	}
	|
	token165 : UARR_D {
		token165.setText(String.valueOf('\u21D1')); 
		token = token165;
	}
	|
	token166 : RARR_D {
		token166.setText(String.valueOf('\u21D2')); 
		token = token166;
	}
	|
	token167 : DARR_D {
		token167.setText(String.valueOf('\u21D3')); 
		token = token167;
	}
	|
	token168 : HARR_D {
		token168.setText(String.valueOf('\u21D4')); 
		token = token168;
	}
	|
	token169 : FORALL {
		token169.setText(String.valueOf('\u2200')); 
		token = token169;
	}
	|
	token170 : PART {
		token170.setText(String.valueOf('\u2202')); 
		token = token170;
	}
	|
	token171 : EXIST {
		token171.setText(String.valueOf('\u2203')); 
		token = token171;
	}
	|
	token172 : EMPTY {
		token172.setText(String.valueOf('\u2205')); 
		token = token172;
	}
	|
	token173 : NABLA {
		token173.setText(String.valueOf('\u2207')); 
		token = token173;
	}
	|
	token174 : ISIN {
		token174.setText(String.valueOf('\u2208')); 
		token = token174;
	}
	|
	token175 : NOTIN {
		token175.setText(String.valueOf('\u2209')); 
		token = token175;
	}
	|
	token176 : NI {
		token176.setText(String.valueOf('\u220B')); 
		token = token176;
	}
	|
	token177 : PROD {
		token177.setText(String.valueOf('\u220F')); 
		token = token177;
	}
	|
	token178 : SUM {
		token178.setText(String.valueOf('\u2211')); 
		token = token178;
	}
	|
	token179 : MINUS {
		token179.setText(String.valueOf('\u2212')); 
		token = token179;
	}
	|
	token180 : LOWAST {
		token180.setText(String.valueOf('\u2217')); 
		token = token180;
	}
	|
	token181 : RADIC {
		token181.setText(String.valueOf('\u221A')); 
		token = token181;
	}
	|
	token182 : PROP {
		token182.setText(String.valueOf('\u221D')); 
		token = token182;
	}
	|
	token183 : INFIN {
		token183.setText(String.valueOf('\u221E')); 
		token = token183;
	}
	|
	token184 : ANG {
		token184.setText(String.valueOf('\u2220')); 
		token = token184;
	}
	|
	token185 : AND {
		token185.setText(String.valueOf('\u2227')); 
		token = token185;
	}
	|
	token186 : OR {
		token186.setText(String.valueOf('\u2228')); 
		token = token186;
	}
	|
	token187 : CAP {
		token187.setText(String.valueOf('\u2229')); 
		token = token187;
	}
	|
	token188 : CUP {
		token188.setText(String.valueOf('\u222A')); 
		token = token188;
	}
	|
	token189 : INT {
		token189.setText(String.valueOf('\u222B')); 
		token = token189;
	}
	|
	token190 : THERE4 {
		token190.setText(String.valueOf('\u2234')); 
		token = token190;
	}
	|
	token191 : SIM {
		token191.setText(String.valueOf('\u223C')); 
		token = token191;
	}
	|
	token192 : CONG {
		token192.setText(String.valueOf('\u2245')); 
		token = token192;
	}
	|
	token193 : ASYMP {
		token193.setText(String.valueOf('\u2248')); 
		token = token193;
	}
	|
	token194 : NE {
		token194.setText(String.valueOf('\u2260')); 
		token = token194;
	}
	|
	token195 : EQUIV {
		token195.setText(String.valueOf('\u2261')); 
		token = token195;
	}
	|
	token196 : LE {
		token196.setText(String.valueOf('\u2264')); 
		token = token196;
	}
	|
	token197 : GE {
		token197.setText(String.valueOf('\u2265')); 
		token = token197;
	}
	|
	token198 : SUB {
		token198.setText(String.valueOf('\u2282')); 
		token = token198;
	}
	|
	token199 : SUP {
		token199.setText(String.valueOf('\u2283')); 
		token = token199;
	}
	|
	token200 : NSUB {
		token200.setText(String.valueOf('\u2284')); 
		token = token200;
	}
	|
	token201 : SUBE {
		token201.setText(String.valueOf('\u2286')); 
		token = token201;
	}
	|
	token202 : SUPE {
		token202.setText(String.valueOf('\u2287')); 
		token = token202;
	}
	|
	token203 : OPLUS {
		token203.setText(String.valueOf('\u2295')); 
		token = token203;
	}
	|
	token204 : OTIMES {
		token204.setText(String.valueOf('\u2297')); 
		token = token204;
	}
	|
	token205 : PERP {
		token205.setText(String.valueOf('\u22A5')); 
		token = token205;
	}
	|
	token206 : SDOT {
		token206.setText(String.valueOf('\u22C5')); 
		token = token206;
	}
	|
	token207 : LCEIL {
		token207.setText(String.valueOf('\u2308')); 
		token = token207;
	}
	|
	token208 : RCEIL {
		token208.setText(String.valueOf('\u2309')); 
		token = token208;
	}
	|
	token209 : LFLOOR {
		token209.setText(String.valueOf('\u230A')); 
		token = token209;
	}
	|
	token210 : RFLOOR {
		token210.setText(String.valueOf('\u230B')); 
		token = token210;
	}
	|
	token211 : LANG {
		token211.setText(String.valueOf('\u2329')); 
		token = token211;
	}
	|
	token212 : RANG {
		token212.setText(String.valueOf('\u232A')); 
		token = token212;
	}
	|
	token213 : LOZ {
		token213.setText(String.valueOf('\u25CA')); 
		token = token213;
	}
	|
	token214 : SPADES {
		token214.setText(String.valueOf('\u2660')); 
		token = token214;
	}
	|
	token215 : CLUBS {
		token215.setText(String.valueOf('\u2663')); 
		token = token215;
	}
	|
	token216 : HEARTS {
		token216.setText(String.valueOf('\u2665')); 
		token = token216;
	}
	|
	token217 : DIAMS {
		token217.setText(String.valueOf('\u2666')); 
		token = token217;
	}
	|
	token218 : QUOT {
		token218.setText(String.valueOf('\u0022')); 
		token = token218;
	}
	|
	token219 : AMP {
		token219.setText(String.valueOf('\u0026')); 
		token = token219;
		this.m_potentialRemainingEntity = true;
	}
	|
	token220 : LT {
		token220.setText(String.valueOf('\u003C')); 
		token = token220;
	}
	|
	token221 : GT {
		token221.setText(String.valueOf('\u003E')); 
		token = token221;
	}
	|
	token222 : OELIG {
		token222.setText(String.valueOf('\u0152')); 
		token = token222;
	}
	|
	token223 : OELIG_LC {
		token223.setText(String.valueOf('\u0153')); 
		token = token223;
	}
	|
	token224 : SCARON {
		token224.setText(String.valueOf('\u0160')); 
		token = token224;
	}
	|
	token225 : SCARON_LC {
		token225.setText(String.valueOf('\u0161')); 
		token = token225;
	}
	|
	token226 : YUML {
		token226.setText(String.valueOf('\u0178')); 
		token = token226;
	}
	|
	token227 : CIRC {
		token227.setText(String.valueOf('\u02C6')); 
		token = token227;
	}
	|
	token228 : TILDE {
		token228.setText(String.valueOf('\u02DC')); 
		token = token228;
	}
	|
	token229 : ENSP {
		token229.setText(String.valueOf('\u2002')); 
		token = token229;
	}
	|
	token230 : EMSP {
		token230.setText(String.valueOf('\u2003')); 
		token = token230;
	}
	|
	token231 : THINSP {
		token231.setText(String.valueOf('\u2009')); 
		token = token231;
	}
	|
	token232 : ZWNJ {
		token232.setText(String.valueOf('\u200C')); 
		token = token232;
	}
	|
	token233 : ZWJ	{
		token233.setText(String.valueOf('\u200D')); 
		token = token233;
	}
	|
	token234 : LRM {
		token234.setText(String.valueOf('\u200E')); 
		token = token234;
	}
	|
	token235 : RLM {
		token235.setText(String.valueOf('\u200F')); 
		token = token235;
	}
	|
	token236 : NDASH {
		token236.setText(String.valueOf('\u2013')); 
		token = token236;
	}
	|
	token237 : MDASH {
		token237.setText(String.valueOf('\u2014')); 
		token = token237;
	}
	|
	token238 : LSQUO {
		token238.setText(String.valueOf('\u2018')); 
		token = token238;
	}
	|
	token239 : RSQUO {
		token239.setText(String.valueOf('\u2019')); 
		token = token239;
	}
	|
	token240 : SBQUO {
		token240.setText(String.valueOf('\u201A')); 
		token = token240;
	}
	|
	token241 : LDQUO {
		token241.setText(String.valueOf('\u201C')); 
		token = token241;
	}
	|
	token242 : RDQUO {
		token242.setText(String.valueOf('\u201D')); 
		token = token242;
	}
	|
	token243 : BDQUO {
		token243.setText(String.valueOf('\u201E')); 
		token = token243;
	}
	|
	token244 : DAGGER_LC {
		token244.setText(String.valueOf('\u2020')); 
		token = token244;
	}
	|
	token245 : DAGGER {
		token245.setText(String.valueOf('\u2021')); 
		token = token245;
	}
	|
	token246 : PERMIL {
		token246.setText(String.valueOf('\u2030')); 
		token = token246;
	}
	|
	token247 : LSAQUO {
		token247.setText(String.valueOf('\u2039')); 
		token = token247;
	}
	|
	token248 : RSAQUO {
		token248.setText(String.valueOf('\u203A')); 
		token = token248;
	}
	|
	token249 : EURO {
		token249.setText(String.valueOf('\u20AC')); 
		token = token249;
	}
	|
	token250 : WORD {
		token = token250;
	}
	|
	token251 : NCR_H
	{
		token251.setText(new String(new char[] {(char) Integer.parseInt(token251.getText(), 16)})); 
		token = token251;
	}
	|
	token252 : NCR_D
	{
		token252.setText(new String(new char[] {(char) Integer.parseInt(token252.getText(), 10)})); 
		token = token252;
	}
	|
	token253 : EOF {
		token = token253;
	}
	;
 	
	
class HtmlEntityLexer extends Lexer;
options{
	codeGenDebug=false;  
	k=8;
	charVocabulary='\u0000'..'\uFFFE';
	defaultErrorHandler=true;
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
WORD   :
	'\n' { newline();} 
	| 
	'\r' '\n'{ newline(); } 
	|
	//	This rule is needed to enforce k=7: 
	// if ommitted, antlr will match less characters and run in 
	// recongnition exception for e.g. &section=...
	// break loop if next ampersand comes
    (~'&')+
    |
    // we have to allow a single ampersand that does not match any of 
    // the other tokens:
    '&'
    ; 
      
    
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
