// $ANTLR : "htmlentitydecoder.g" -> "HtmlEntityDecoder.java"$

package cpdetector.html.parser;

import java.io.IOException;
import java.io.OutputStreamWriter;

public interface HtmlEntityDecoderTokenTypes {
  int EOF = 1;

  int NULL_TREE_LOOKAHEAD = 3;

  int NBSP = 4;

  int IEXCL = 5;

  int CENT = 6;

  int POUND = 7;

  int CURREN = 8;

  int YEN = 9;

  int BRVBAR = 10;

  int SECT = 11;

  int UML = 12;

  int COPY = 13;

  int ORDF = 14;

  int LAQUO = 15;

  int NOT = 16;

  int SHY = 17;

  int REG = 18;

  int MACR = 19;

  int DEG = 20;

  int PLUSMN = 21;

  int SUP2 = 22;

  int SUP3 = 23;

  int ACUTE = 24;

  int PARA = 25;

  int MIDDOT = 26;

  int CEDIL = 27;

  int SUP1 = 28;

  int ORDM = 29;

  int RAQUO = 30;

  int FRAC14 = 31;

  int FRAC12 = 32;

  int FRAC34 = 33;

  int IQUEST = 34;

  int AGRAVE = 35;

  int AACUTE = 36;

  int ACIRC = 37;

  int ATILDE = 38;

  int AUML = 39;

  int ARING = 40;

  int AELIG = 41;

  int CCEDIL = 42;

  int EGRAVE = 43;

  int EACUTE = 44;

  int ECIRC = 45;

  int EUML = 46;

  int IGRAVE = 47;

  int IACUTE = 48;

  int ICIRC = 49;

  int IUML = 50;

  int ETH = 51;

  int NTILDE = 52;

  int OGRAVE = 53;

  int OACUTE = 54;

  int OCIRC = 55;

  int OTILDE = 56;

  int OUML = 57;

  int TIMES = 58;

  int OSLASH = 59;

  int UGRAVE = 60;

  int UACUTE = 61;

  int UCIRC = 62;

  int UUML = 63;

  int YACUTE = 64;

  int THORN = 65;

  int SZLIG = 66;

  int AGRAVE_LC = 67;

  int AACUTE_LC = 68;

  int ACIRC_LC = 69;

  int ATILDE_LC = 70;

  int AUML_LC = 71;

  int ARING_LC = 72;

  int AELIG_LC = 73;

  int CCEDIL_LC = 74;

  int EGRAVE_LC = 75;

  int EACUTE_LC = 76;

  int ECIRC_LC = 77;

  int EUML_LC = 78;

  int IGRAVE_LC = 79;

  int IACUTE_LC = 80;

  int ICIRC_LC = 81;

  int IUML_LC = 82;

  int ETH_LC = 83;

  int NTILDE_LC = 84;

  int OGRAVE_LC = 85;

  int OACUTE_LC = 86;

  int OCIRC_LC = 87;

  int OTILDE_LC = 88;

  int OUML_LC = 89;

  int DIVIDE = 90;

  int OSLASH_LC = 91;

  int UGRAVE_LC = 92;

  int UACUTE_LC = 93;

  int UCIRC_LC = 94;

  int UUML_LC = 95;

  int YACUTE_LC = 96;

  int THORN_LC = 97;

  int YUML_LC = 98;

  int ALPHA = 99;

  int BETA = 100;

  int GAMMA = 101;

  int DELTA = 102;

  int EPSILON = 103;

  int ZETA = 104;

  int ETA = 105;

  int THETA = 106;

  int IOTA = 107;

  int KAPPA = 108;

  int LAMBDA = 109;

  int MU = 110;

  int NU = 111;

  int XI = 112;

  int OMICRON = 113;

  int PI = 114;

  int RHO = 115;

  int SIGMA = 116;

  int TAU = 117;

  int UPSILON = 118;

  int PHI = 119;

  int CHI = 120;

  int PSI = 121;

  int OMEGA = 122;

  int ALPHA_LC = 123;

  int BETA_LC = 124;

  int GAMMA_LC = 125;

  int DELTA_LC = 126;

  int EPSILON_LC = 127;

  int ZETA_LC = 128;

  int ETA_LC = 129;

  int THETA_LC = 130;

  int IOTA_LC = 131;

  int KAPPA_LC = 132;

  int LAMBDA_LC = 133;

  int MU_LC = 134;

  int NU_LC = 135;

  int XI_LC = 136;

  int OMICRON_LC = 137;

  int PI_LC = 138;

  int RHO_LC = 139;

  int SIGMAF_LC = 140;

  int SIGMA_LC = 141;

  int TAU_LC = 142;

  int UPSILON_LC = 143;

  int PHI_LC = 144;

  int CHI_LC = 145;

  int PSI_LC = 146;

  int OMEGA_LC = 147;

  int THETASYM = 148;

  int UPSIH = 149;

  int PIV = 150;

  int BULL = 151;

  int HELLIP = 152;

  int PRIME_LC = 153;

  int PRIME = 154;

  int OLINE = 155;

  int FRASL = 156;

  int WEIERP = 157;

  int IMAGE = 158;

  int REAL = 159;

  int TRADE = 160;

  int ALEFSYM = 161;

  int LARR = 162;

  int UARR = 163;

  int RARR = 164;

  int DARR = 165;

  int HARR = 166;

  int CRARR = 167;

  int LARR_D = 168;

  int UARR_D = 169;

  int RARR_D = 170;

  int DARR_D = 171;

  int HARR_D = 172;

  int FORALL = 173;

  int PART = 174;

  int EXIST = 175;

  int EMPTY = 176;

  int NABLA = 177;

  int ISIN = 178;

  int NOTIN = 179;

  int NI = 180;

  int PROD = 181;

  int SUM = 182;

  int MINUS = 183;

  int LOWAST = 184;

  int RADIC = 185;

  int PROP = 186;

  int INFIN = 187;

  int ANG = 188;

  int AND = 189;

  int OR = 190;

  int CAP = 191;

  int CUP = 192;

  int INT = 193;

  int THERE4 = 194;

  int SIM = 195;

  int CONG = 196;

  int ASYMP = 197;

  int NE = 198;

  int EQUIV = 199;

  int LE = 200;

  int GE = 201;

  int SUB = 202;

  int SUP = 203;

  int NSUB = 204;

  int SUBE = 205;

  int SUPE = 206;

  int OPLUS = 207;

  int OTIMES = 208;

  int PERP = 209;

  int SDOT = 210;

  int LCEIL = 211;

  int RCEIL = 212;

  int LFLOOR = 213;

  int RFLOOR = 214;

  int LANG = 215;

  int RANG = 216;

  int LOZ = 217;

  int SPADES = 218;

  int CLUBS = 219;

  int HEARTS = 220;

  int DIAMS = 221;

  int ANY_CHAR = 222;

  int MICRO = 223;
}
