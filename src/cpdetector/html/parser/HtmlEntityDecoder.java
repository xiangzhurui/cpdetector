// $ANTLR : "htmlentitydecoder.g" -> "HtmlEntityDecoder.java"$

package cpdetector.html.parser;

import java.io.IOException;
import java.io.OutputStreamWriter;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class HtmlEntityDecoder extends antlr.LLkParser       implements HtmlEntityDecoderTokenTypes
 {

protected HtmlEntityDecoder(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public HtmlEntityDecoder(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected HtmlEntityDecoder(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public HtmlEntityDecoder(TokenStream lexer) {
  this(lexer,1);
}

public HtmlEntityDecoder(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void decode(
		OutputStreamWriter out
	) throws RecognitionException, TokenStreamException, IOException {
		
		Token  token = null;
		
		switch ( LA(1)) {
		case NBSP:
		{
			match(NBSP);
			out.write('\u00A0');
			break;
		}
		case IEXCL:
		{
			match(IEXCL);
			out.write('\u00A1');
			break;
		}
		case CENT:
		{
			match(CENT);
			out.write('\u00A2');
			break;
		}
		case POUND:
		{
			match(POUND);
			out.write('\u00A3');
			break;
		}
		case CURREN:
		{
			match(CURREN);
			out.write('\u00A4');
			break;
		}
		case YEN:
		{
			match(YEN);
			out.write('\u00A5');
			break;
		}
		case BRVBAR:
		{
			match(BRVBAR);
			out.write('\u00A6');
			break;
		}
		case SECT:
		{
			match(SECT);
			out.write('\u00A7');
			break;
		}
		case UML:
		{
			match(UML);
			out.write('\u00A8');
			break;
		}
		case COPY:
		{
			match(COPY);
			out.write('\u00A9');
			break;
		}
		case ORDF:
		{
			match(ORDF);
			out.write('\u00AA');
			break;
		}
		case LAQUO:
		{
			match(LAQUO);
			out.write('\u00AB');
			break;
		}
		case NOT:
		{
			match(NOT);
			out.write('\u00AC');
			break;
		}
		case SHY:
		{
			match(SHY);
			out.write('\u00AD');
			break;
		}
		case REG:
		{
			match(REG);
			out.write('\u00AE');
			break;
		}
		case MACR:
		{
			match(MACR);
			out.write('\u00AF');
			break;
		}
		case DEG:
		{
			match(DEG);
			out.write('\u00B0');
			break;
		}
		case PLUSMN:
		{
			match(PLUSMN);
			out.write('\u00B1');
			break;
		}
		case SUP2:
		{
			match(SUP2);
			out.write('\u00B2');
			break;
		}
		case SUP3:
		{
			match(SUP3);
			out.write('\u00B3');
			break;
		}
		case ACUTE:
		{
			match(ACUTE);
			out.write('\u00B4');
			break;
		}
		case PARA:
		{
			match(PARA);
			out.write('\u00B5');
			break;
		}
		case MIDDOT:
		{
			match(MIDDOT);
			out.write('\u00B7');
			break;
		}
		case CEDIL:
		{
			match(CEDIL);
			out.write('\u00B8');
			break;
		}
		case SUP1:
		{
			match(SUP1);
			out.write('\u00B9');
			break;
		}
		case ORDM:
		{
			match(ORDM);
			out.write('\u00BA');
			break;
		}
		case RAQUO:
		{
			match(RAQUO);
			out.write('\u00BB');
			break;
		}
		case FRAC14:
		{
			match(FRAC14);
			out.write('\u00BC');
			break;
		}
		case FRAC12:
		{
			match(FRAC12);
			out.write('\u00BD');
			break;
		}
		case FRAC34:
		{
			match(FRAC34);
			out.write('\u00BE');
			break;
		}
		case IQUEST:
		{
			match(IQUEST);
			out.write('\u00BF');
			break;
		}
		case AGRAVE:
		{
			match(AGRAVE);
			out.write('\u00C0');
			break;
		}
		case AACUTE:
		{
			match(AACUTE);
			out.write('\u00C1');
			break;
		}
		case ACIRC:
		{
			match(ACIRC);
			out.write('\u00C2');
			break;
		}
		case ATILDE:
		{
			match(ATILDE);
			out.write('\u00C3');
			break;
		}
		case AUML:
		{
			match(AUML);
			out.write('\u00C4');
			break;
		}
		case ARING:
		{
			match(ARING);
			out.write('\u00C5');
			break;
		}
		case AELIG:
		{
			match(AELIG);
			out.write('\u00C6');
			break;
		}
		case CCEDIL:
		{
			match(CCEDIL);
			out.write('\u00C7');
			break;
		}
		case EGRAVE:
		{
			match(EGRAVE);
			out.write('\u00C8');
			break;
		}
		case EACUTE:
		{
			match(EACUTE);
			out.write('\u00C9');
			break;
		}
		case ECIRC:
		{
			match(ECIRC);
			out.write('\u00CA');
			break;
		}
		case EUML:
		{
			match(EUML);
			out.write('\u00CB');
			break;
		}
		case IGRAVE:
		{
			match(IGRAVE);
			out.write('\u00CC');
			break;
		}
		case IACUTE:
		{
			match(IACUTE);
			out.write('\u00CD');
			break;
		}
		case ICIRC:
		{
			match(ICIRC);
			out.write('\u00CE');
			break;
		}
		case IUML:
		{
			match(IUML);
			out.write('\u00CF');
			break;
		}
		case ETH:
		{
			match(ETH);
			out.write('\u00D0');
			break;
		}
		case NTILDE:
		{
			match(NTILDE);
			out.write('\u00D1');
			break;
		}
		case OGRAVE:
		{
			match(OGRAVE);
			out.write('\u00D2');
			break;
		}
		case OACUTE:
		{
			match(OACUTE);
			out.write('\u00D3');
			break;
		}
		case OCIRC:
		{
			match(OCIRC);
			out.write('\u00D4');
			break;
		}
		case OTILDE:
		{
			match(OTILDE);
			out.write('\u00D5');
			break;
		}
		case OUML:
		{
			match(OUML);
			out.write('\u00D6');
			break;
		}
		case TIMES:
		{
			match(TIMES);
			out.write('\u00D7');
			break;
		}
		case OSLASH:
		{
			match(OSLASH);
			out.write('\u00D8');
			break;
		}
		case UGRAVE:
		{
			match(UGRAVE);
			out.write('\u00D9');
			break;
		}
		case UACUTE:
		{
			match(UACUTE);
			out.write('\u00DA');
			break;
		}
		case UCIRC:
		{
			match(UCIRC);
			out.write('\u00DB');
			break;
		}
		case UUML:
		{
			match(UUML);
			out.write('\u00DC');
			break;
		}
		case YACUTE:
		{
			match(YACUTE);
			out.write('\u00DD');
			break;
		}
		case THORN:
		{
			match(THORN);
			out.write('\u00DE');
			break;
		}
		case SZLIG:
		{
			match(SZLIG);
			out.write('\u00DF');
			break;
		}
		case AGRAVE_LC:
		{
			match(AGRAVE_LC);
			out.write('\u00E0');
			break;
		}
		case AACUTE_LC:
		{
			match(AACUTE_LC);
			out.write('\u00E1');
			break;
		}
		case ACIRC_LC:
		{
			match(ACIRC_LC);
			out.write('\u00E2');
			break;
		}
		case ATILDE_LC:
		{
			match(ATILDE_LC);
			out.write('\u00E3');
			break;
		}
		case AUML_LC:
		{
			match(AUML_LC);
			out.write('\u00E4');
			break;
		}
		case ARING_LC:
		{
			match(ARING_LC);
			out.write('\u00E5');
			break;
		}
		case AELIG_LC:
		{
			match(AELIG_LC);
			out.write('\u00E6');
			break;
		}
		case CCEDIL_LC:
		{
			match(CCEDIL_LC);
			out.write('\u00E7');
			break;
		}
		case EGRAVE_LC:
		{
			match(EGRAVE_LC);
			out.write('\u00E8');
			break;
		}
		case EACUTE_LC:
		{
			match(EACUTE_LC);
			out.write('\u00E9');
			break;
		}
		case ECIRC_LC:
		{
			match(ECIRC_LC);
			out.write('\u00EA');
			break;
		}
		case EUML_LC:
		{
			match(EUML_LC);
			out.write('\u00EB');
			break;
		}
		case IGRAVE_LC:
		{
			match(IGRAVE_LC);
			out.write('\u00EC');
			break;
		}
		case IACUTE_LC:
		{
			match(IACUTE_LC);
			out.write('\u00ED');
			break;
		}
		case ICIRC_LC:
		{
			match(ICIRC_LC);
			out.write('\u00EE');
			break;
		}
		case IUML_LC:
		{
			match(IUML_LC);
			out.write('\u00EF');
			break;
		}
		case ETH_LC:
		{
			match(ETH_LC);
			out.write('\u00F0');
			break;
		}
		case NTILDE_LC:
		{
			match(NTILDE_LC);
			out.write('\u00F1');
			break;
		}
		case OGRAVE_LC:
		{
			match(OGRAVE_LC);
			out.write('\u00F2');
			break;
		}
		case OACUTE_LC:
		{
			match(OACUTE_LC);
			out.write('\u00F3');
			break;
		}
		case OCIRC_LC:
		{
			match(OCIRC_LC);
			out.write('\u00F4');
			break;
		}
		case OTILDE_LC:
		{
			match(OTILDE_LC);
			out.write('\u00F5');
			break;
		}
		case OUML_LC:
		{
			match(OUML_LC);
			out.write('\u00F6');
			break;
		}
		case DIVIDE:
		{
			match(DIVIDE);
			out.write('\u00F7');
			break;
		}
		case OSLASH_LC:
		{
			match(OSLASH_LC);
			out.write('\u00F8');
			break;
		}
		case UGRAVE_LC:
		{
			match(UGRAVE_LC);
			out.write('\u00F9');
			break;
		}
		case UACUTE_LC:
		{
			match(UACUTE_LC);
			out.write('\u00FA');
			break;
		}
		case UCIRC_LC:
		{
			match(UCIRC_LC);
			out.write('\u00FB');
			break;
		}
		case UUML_LC:
		{
			match(UUML_LC);
			out.write('\u00FC');
			break;
		}
		case YACUTE_LC:
		{
			match(YACUTE_LC);
			out.write('\u00FD');
			break;
		}
		case THORN_LC:
		{
			match(THORN_LC);
			out.write('\u00FE');
			break;
		}
		case YUML_LC:
		{
			match(YUML_LC);
			out.write('\u00FF');
			break;
		}
		case ALPHA:
		{
			match(ALPHA);
			out.write('\u0391');
			break;
		}
		case BETA:
		{
			match(BETA);
			out.write('\u0392');
			break;
		}
		case GAMMA:
		{
			match(GAMMA);
			out.write('\u0393');
			break;
		}
		case DELTA:
		{
			match(DELTA);
			out.write('\u0394');
			break;
		}
		case EPSILON:
		{
			match(EPSILON);
			out.write('\u0395');
			break;
		}
		case ZETA:
		{
			match(ZETA);
			out.write('\u0396');
			break;
		}
		case ETA:
		{
			match(ETA);
			out.write('\u0397');
			break;
		}
		case THETA:
		{
			match(THETA);
			out.write('\u0398');
			break;
		}
		case IOTA:
		{
			match(IOTA);
			out.write('\u0399');
			break;
		}
		case KAPPA:
		{
			match(KAPPA);
			out.write('\u039A');
			break;
		}
		case LAMBDA:
		{
			match(LAMBDA);
			out.write('\u039B');
			break;
		}
		case MU:
		{
			match(MU);
			out.write('\u039C');
			break;
		}
		case NU:
		{
			match(NU);
			out.write('\u039D');
			break;
		}
		case XI:
		{
			match(XI);
			out.write('\u039E');
			break;
		}
		case OMICRON:
		{
			match(OMICRON);
			out.write('\u039F');
			break;
		}
		case PI:
		{
			match(PI);
			out.write('\u03A0');
			break;
		}
		case RHO:
		{
			match(RHO);
			out.write('\u03A1');
			break;
		}
		case SIGMA:
		{
			match(SIGMA);
			out.write('\u03A3');
			break;
		}
		case TAU:
		{
			match(TAU);
			out.write('\u03A4');
			break;
		}
		case UPSILON:
		{
			match(UPSILON);
			out.write('\u03A5');
			break;
		}
		case PHI:
		{
			match(PHI);
			out.write('\u03A6');
			break;
		}
		case CHI:
		{
			match(CHI);
			out.write('\u03A7');
			break;
		}
		case PSI:
		{
			match(PSI);
			out.write('\u03A8');
			break;
		}
		case OMEGA:
		{
			match(OMEGA);
			out.write('\u03A9');
			break;
		}
		case ALPHA_LC:
		{
			match(ALPHA_LC);
			out.write('\u03B1');
			break;
		}
		case BETA_LC:
		{
			match(BETA_LC);
			out.write('\u03B2');
			break;
		}
		case GAMMA_LC:
		{
			match(GAMMA_LC);
			out.write('\u03B3');
			break;
		}
		case DELTA_LC:
		{
			match(DELTA_LC);
			out.write('\u03B4');
			break;
		}
		case EPSILON_LC:
		{
			match(EPSILON_LC);
			out.write('\u03B5');
			break;
		}
		case ZETA_LC:
		{
			match(ZETA_LC);
			out.write('\u03B6');
			break;
		}
		case ETA_LC:
		{
			match(ETA_LC);
			out.write('\u03B7');
			break;
		}
		case THETA_LC:
		{
			match(THETA_LC);
			out.write('\u03B8');
			break;
		}
		case IOTA_LC:
		{
			match(IOTA_LC);
			out.write('\u03B9');
			break;
		}
		case KAPPA_LC:
		{
			match(KAPPA_LC);
			out.write('\u03BA');
			break;
		}
		case LAMBDA_LC:
		{
			match(LAMBDA_LC);
			out.write('\u03BB');
			break;
		}
		case MU_LC:
		{
			match(MU_LC);
			out.write('\u03BC');
			break;
		}
		case NU_LC:
		{
			match(NU_LC);
			out.write('\u03BD');
			break;
		}
		case XI_LC:
		{
			match(XI_LC);
			out.write('\u03BE');
			break;
		}
		case OMICRON_LC:
		{
			match(OMICRON_LC);
			out.write('\u03BF');
			break;
		}
		case PI_LC:
		{
			match(PI_LC);
			out.write('\u03C0');
			break;
		}
		case RHO_LC:
		{
			match(RHO_LC);
			out.write('\u03C1');
			break;
		}
		case SIGMAF_LC:
		{
			match(SIGMAF_LC);
			out.write('\u03C2');
			break;
		}
		case SIGMA_LC:
		{
			match(SIGMA_LC);
			out.write('\u03C3');
			break;
		}
		case TAU_LC:
		{
			match(TAU_LC);
			out.write('\u03C4');
			break;
		}
		case UPSILON_LC:
		{
			match(UPSILON_LC);
			out.write('\u03C5');
			break;
		}
		case PHI_LC:
		{
			match(PHI_LC);
			out.write('\u03C6');
			break;
		}
		case CHI_LC:
		{
			match(CHI_LC);
			out.write('\u03C7');
			break;
		}
		case PSI_LC:
		{
			match(PSI_LC);
			out.write('\u03C8');
			break;
		}
		case OMEGA_LC:
		{
			match(OMEGA_LC);
			out.write('\u03C9');
			break;
		}
		case THETASYM:
		{
			match(THETASYM);
			out.write('\u03D1');
			break;
		}
		case UPSIH:
		{
			match(UPSIH);
			out.write('\u03D2');
			break;
		}
		case PIV:
		{
			match(PIV);
			out.write('\u03D6');
			break;
		}
		case BULL:
		{
			match(BULL);
			out.write('\u2022');
			break;
		}
		case HELLIP:
		{
			match(HELLIP);
			out.write('\u2026');
			break;
		}
		case PRIME_LC:
		{
			match(PRIME_LC);
			out.write('\u2032');
			break;
		}
		case PRIME:
		{
			match(PRIME);
			out.write('\u2033');
			break;
		}
		case OLINE:
		{
			match(OLINE);
			out.write('\u203E');
			break;
		}
		case FRASL:
		{
			match(FRASL);
			out.write('\u2044');
			break;
		}
		case WEIERP:
		{
			match(WEIERP);
			out.write('\u2118');
			break;
		}
		case IMAGE:
		{
			match(IMAGE);
			out.write('\u2111');
			break;
		}
		case REAL:
		{
			match(REAL);
			out.write('\u211C');
			break;
		}
		case TRADE:
		{
			match(TRADE);
			out.write('\u2122');
			break;
		}
		case ALEFSYM:
		{
			match(ALEFSYM);
			out.write('\u2135');
			break;
		}
		case LARR:
		{
			match(LARR);
			out.write('\u2190');
			break;
		}
		case UARR:
		{
			match(UARR);
			out.write('\u2191');
			break;
		}
		case RARR:
		{
			match(RARR);
			out.write('\u2192');
			break;
		}
		case DARR:
		{
			match(DARR);
			out.write('\u2193');
			break;
		}
		case HARR:
		{
			match(HARR);
			out.write('\u2194');
			break;
		}
		case CRARR:
		{
			match(CRARR);
			out.write('\u21B5');
			break;
		}
		case LARR_D:
		{
			match(LARR_D);
			out.write('\u21D0');
			break;
		}
		case UARR_D:
		{
			match(UARR_D);
			out.write('\u21D1');
			break;
		}
		case RARR_D:
		{
			match(RARR_D);
			out.write('\u21D2');
			break;
		}
		case DARR_D:
		{
			match(DARR_D);
			out.write('\u21D3');
			break;
		}
		case HARR_D:
		{
			match(HARR_D);
			out.write('\u21D4');
			break;
		}
		case FORALL:
		{
			match(FORALL);
			out.write('\u2200');
			break;
		}
		case PART:
		{
			match(PART);
			out.write('\u2202');
			break;
		}
		case EXIST:
		{
			match(EXIST);
			out.write('\u2203');
			break;
		}
		case EMPTY:
		{
			match(EMPTY);
			out.write('\u2205');
			break;
		}
		case NABLA:
		{
			match(NABLA);
			out.write('\u2207');
			break;
		}
		case ISIN:
		{
			match(ISIN);
			out.write('\u2208');
			break;
		}
		case NOTIN:
		{
			match(NOTIN);
			out.write('\u2209');
			break;
		}
		case NI:
		{
			match(NI);
			out.write('\u220B');
			break;
		}
		case PROD:
		{
			match(PROD);
			out.write('\u220F');
			break;
		}
		case SUM:
		{
			match(SUM);
			out.write('\u2211');
			break;
		}
		case MINUS:
		{
			match(MINUS);
			out.write('\u2212');
			break;
		}
		case LOWAST:
		{
			match(LOWAST);
			out.write('\u2217');
			break;
		}
		case RADIC:
		{
			match(RADIC);
			out.write('\u221A');
			break;
		}
		case PROP:
		{
			match(PROP);
			out.write('\u221D');
			break;
		}
		case INFIN:
		{
			match(INFIN);
			out.write('\u221E');
			break;
		}
		case ANG:
		{
			match(ANG);
			out.write('\u2220');
			break;
		}
		case AND:
		{
			match(AND);
			out.write('\u2227');
			break;
		}
		case OR:
		{
			match(OR);
			out.write('\u2228');
			break;
		}
		case CAP:
		{
			match(CAP);
			out.write('\u2229');
			break;
		}
		case CUP:
		{
			match(CUP);
			out.write('\u222A');
			break;
		}
		case INT:
		{
			match(INT);
			out.write('\u222B');
			break;
		}
		case THERE4:
		{
			match(THERE4);
			out.write('\u2234');
			break;
		}
		case SIM:
		{
			match(SIM);
			out.write('\u223C');
			break;
		}
		case CONG:
		{
			match(CONG);
			out.write('\u2245');
			break;
		}
		case ASYMP:
		{
			match(ASYMP);
			out.write('\u2248');
			break;
		}
		case NE:
		{
			match(NE);
			out.write('\u2260');
			break;
		}
		case EQUIV:
		{
			match(EQUIV);
			out.write('\u2261');
			break;
		}
		case LE:
		{
			match(LE);
			out.write('\u2264');
			break;
		}
		case GE:
		{
			match(GE);
			out.write('\u2265');
			break;
		}
		case SUB:
		{
			match(SUB);
			out.write('\u2282');
			break;
		}
		case SUP:
		{
			match(SUP);
			out.write('\u2283');
			break;
		}
		case NSUB:
		{
			match(NSUB);
			out.write('\u2284');
			break;
		}
		case SUBE:
		{
			match(SUBE);
			out.write('\u2286');
			break;
		}
		case SUPE:
		{
			match(SUPE);
			out.write('\u2287');
			break;
		}
		case OPLUS:
		{
			match(OPLUS);
			out.write('\u2295');
			break;
		}
		case OTIMES:
		{
			match(OTIMES);
			out.write('\u2297');
			break;
		}
		case PERP:
		{
			match(PERP);
			out.write('\u22A5');
			break;
		}
		case SDOT:
		{
			match(SDOT);
			out.write('\u22C5');
			break;
		}
		case LCEIL:
		{
			match(LCEIL);
			out.write('\u2308');
			break;
		}
		case RCEIL:
		{
			match(RCEIL);
			out.write('\u2309');
			break;
		}
		case LFLOOR:
		{
			match(LFLOOR);
			out.write('\u230A');
			break;
		}
		case RFLOOR:
		{
			match(RFLOOR);
			out.write('\u230B');
			break;
		}
		case LANG:
		{
			match(LANG);
			out.write('\u2329');
			break;
		}
		case RANG:
		{
			match(RANG);
			out.write('\u232A');
			break;
		}
		case LOZ:
		{
			match(LOZ);
			out.write('\u25CA');
			break;
		}
		case SPADES:
		{
			match(SPADES);
			out.write('\u2660');
			break;
		}
		case CLUBS:
		{
			match(CLUBS);
			out.write('\u2663');
			break;
		}
		case HEARTS:
		{
			match(HEARTS);
			out.write('\u2665');
			break;
		}
		case QUOT:
		{
			match(QUOT);
			out.write('\u0022');
			break;
		}
		case AMP:
		{
			match(AMP);
			out.write('\u0026');
			break;
		}
		case LT:
		{
			match(LT);
			out.write('\u003C');
			break;
		}
		case GT:
		{
			match(GT);
			out.write('\u003E');
			break;
		}
		case OELIG:
		{
			match(OELIG);
			out.write('\u0152');
			break;
		}
		case OELIG_LC:
		{
			match(OELIG_LC);
			out.write('\u0153');
			break;
		}
		case SCARON:
		{
			match(SCARON);
			out.write('\u0160');
			break;
		}
		case SCARON_LC:
		{
			match(SCARON_LC);
			out.write('\u0161');
			break;
		}
		case YUML:
		{
			match(YUML);
			out.write('\u0178');
			break;
		}
		case CIRC:
		{
			match(CIRC);
			out.write('\u02C6');
			break;
		}
		case TILDE:
		{
			match(TILDE);
			out.write('\u02DC');
			break;
		}
		case ENSP:
		{
			match(ENSP);
			out.write('\u2002');
			break;
		}
		case EMSP:
		{
			match(EMSP);
			out.write('\u2003');
			break;
		}
		case THINSP:
		{
			match(THINSP);
			out.write('\u2009');
			break;
		}
		case ZWNJ:
		{
			match(ZWNJ);
			out.write('\u200C');
			break;
		}
		case ZWJ:
		{
			match(ZWJ);
			out.write('\u200D');
			break;
		}
		case LRM:
		{
			match(LRM);
			out.write('\u200E');
			break;
		}
		case RLM:
		{
			match(RLM);
			out.write('\u200F');
			break;
		}
		case NDASH:
		{
			match(NDASH);
			out.write('\u2013');
			break;
		}
		case MDASH:
		{
			match(MDASH);
			out.write('\u2014');
			break;
		}
		case LSQUO:
		{
			match(LSQUO);
			out.write('\u2018');
			break;
		}
		case RSQUO:
		{
			match(RSQUO);
			out.write('\u2019');
			break;
		}
		case SBQUO:
		{
			match(SBQUO);
			out.write('\u201A');
			break;
		}
		case LDQUO:
		{
			match(LDQUO);
			out.write('\u201C');
			break;
		}
		case RDQUO:
		{
			match(RDQUO);
			out.write('\u201D');
			break;
		}
		case BDQUO:
		{
			match(BDQUO);
			out.write('\u201E');
			break;
		}
		case DAGGER_LC:
		{
			match(DAGGER_LC);
			out.write('\u2020');
			break;
		}
		case DAGGER:
		{
			match(DAGGER);
			out.write('\u2021');
			break;
		}
		case PERMIL:
		{
			match(PERMIL);
			out.write('\u2030');
			break;
		}
		case LSAQUO:
		{
			match(LSAQUO);
			out.write('\u2039');
			break;
		}
		case RSAQUO:
		{
			match(RSAQUO);
			out.write('\u203A');
			break;
		}
		case EURO:
		{
			match(EURO);
			out.write('\u20AC');
			break;
		}
		case ANY_CHAR:
		{
			token = LT(1);
			match(ANY_CHAR);
			out.write(token.getText());
			break;
		}
		default:
			if ((LA(1)==DIAMS)) {
				match(DIAMS);
				out.write('\u2666');
			}
			else if ((LA(1)==DIAMS)) {
				match(DIAMS);
				out.write('\u2666');
			}
		else {
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"NBSP",
		"IEXCL",
		"CENT",
		"POUND",
		"CURREN",
		"YEN",
		"BRVBAR",
		"SECT",
		"UML",
		"COPY",
		"ORDF",
		"LAQUO",
		"NOT",
		"SHY",
		"REG",
		"MACR",
		"DEG",
		"PLUSMN",
		"SUP2",
		"SUP3",
		"ACUTE",
		"PARA",
		"MIDDOT",
		"CEDIL",
		"SUP1",
		"ORDM",
		"RAQUO",
		"FRAC14",
		"FRAC12",
		"FRAC34",
		"IQUEST",
		"AGRAVE",
		"AACUTE",
		"ACIRC",
		"ATILDE",
		"AUML",
		"ARING",
		"AELIG",
		"CCEDIL",
		"EGRAVE",
		"EACUTE",
		"ECIRC",
		"EUML",
		"IGRAVE",
		"IACUTE",
		"ICIRC",
		"IUML",
		"ETH",
		"NTILDE",
		"OGRAVE",
		"OACUTE",
		"OCIRC",
		"OTILDE",
		"OUML",
		"TIMES",
		"OSLASH",
		"UGRAVE",
		"UACUTE",
		"UCIRC",
		"UUML",
		"YACUTE",
		"THORN",
		"SZLIG",
		"AGRAVE_LC",
		"AACUTE_LC",
		"ACIRC_LC",
		"ATILDE_LC",
		"AUML_LC",
		"ARING_LC",
		"AELIG_LC",
		"CCEDIL_LC",
		"EGRAVE_LC",
		"EACUTE_LC",
		"ECIRC_LC",
		"EUML_LC",
		"IGRAVE_LC",
		"IACUTE_LC",
		"ICIRC_LC",
		"IUML_LC",
		"ETH_LC",
		"NTILDE_LC",
		"OGRAVE_LC",
		"OACUTE_LC",
		"OCIRC_LC",
		"OTILDE_LC",
		"OUML_LC",
		"DIVIDE",
		"OSLASH_LC",
		"UGRAVE_LC",
		"UACUTE_LC",
		"UCIRC_LC",
		"UUML_LC",
		"YACUTE_LC",
		"THORN_LC",
		"YUML_LC",
		"ALPHA",
		"BETA",
		"GAMMA",
		"DELTA",
		"EPSILON",
		"ZETA",
		"ETA",
		"THETA",
		"IOTA",
		"KAPPA",
		"LAMBDA",
		"MU",
		"NU",
		"XI",
		"OMICRON",
		"PI",
		"RHO",
		"SIGMA",
		"TAU",
		"UPSILON",
		"PHI",
		"CHI",
		"PSI",
		"OMEGA",
		"ALPHA_LC",
		"BETA_LC",
		"GAMMA_LC",
		"DELTA_LC",
		"EPSILON_LC",
		"ZETA_LC",
		"ETA_LC",
		"THETA_LC",
		"IOTA_LC",
		"KAPPA_LC",
		"LAMBDA_LC",
		"MU_LC",
		"NU_LC",
		"XI_LC",
		"OMICRON_LC",
		"PI_LC",
		"RHO_LC",
		"SIGMAF_LC",
		"SIGMA_LC",
		"TAU_LC",
		"UPSILON_LC",
		"PHI_LC",
		"CHI_LC",
		"PSI_LC",
		"OMEGA_LC",
		"THETASYM",
		"UPSIH",
		"PIV",
		"BULL",
		"HELLIP",
		"PRIME_LC",
		"PRIME",
		"OLINE",
		"FRASL",
		"WEIERP",
		"IMAGE",
		"REAL",
		"TRADE",
		"ALEFSYM",
		"LARR",
		"UARR",
		"RARR",
		"DARR",
		"HARR",
		"CRARR",
		"LARR_D",
		"UARR_D",
		"RARR_D",
		"DARR_D",
		"HARR_D",
		"FORALL",
		"PART",
		"EXIST",
		"EMPTY",
		"NABLA",
		"ISIN",
		"NOTIN",
		"NI",
		"PROD",
		"SUM",
		"MINUS",
		"LOWAST",
		"RADIC",
		"PROP",
		"INFIN",
		"ANG",
		"AND",
		"OR",
		"CAP",
		"CUP",
		"INT",
		"THERE4",
		"SIM",
		"CONG",
		"ASYMP",
		"NE",
		"EQUIV",
		"LE",
		"GE",
		"SUB",
		"SUP",
		"NSUB",
		"SUBE",
		"SUPE",
		"OPLUS",
		"OTIMES",
		"PERP",
		"SDOT",
		"LCEIL",
		"RCEIL",
		"LFLOOR",
		"RFLOOR",
		"LANG",
		"RANG",
		"LOZ",
		"SPADES",
		"CLUBS",
		"HEARTS",
		"DIAMS",
		"QUOT",
		"AMP",
		"LT",
		"GT",
		"OELIG",
		"OELIG_LC",
		"SCARON",
		"SCARON_LC",
		"YUML",
		"CIRC",
		"TILDE",
		"ENSP",
		"EMSP",
		"THINSP",
		"ZWNJ",
		"ZWJ",
		"LRM",
		"RLM",
		"NDASH",
		"MDASH",
		"LSQUO",
		"RSQUO",
		"SBQUO",
		"LDQUO",
		"RDQUO",
		"BDQUO",
		"DAGGER_LC",
		"DAGGER",
		"PERMIL",
		"LSAQUO",
		"RSAQUO",
		"EURO",
		"ANY_CHAR",
		"MICRO"
	};
	
	
	}
