// $ANTLR 2.7.4: "htmlentitydecoder.g" -> "HtmlEntityDecoder.java"$

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
			out.write('\u00FF');
			break;
		}
		case BETA:
		{
			match(BETA);
			out.write('\u00FF');
			break;
		}
		case GAMMA:
		{
			match(GAMMA);
			out.write('\u00FF');
			break;
		}
		case DELTA:
		{
			match(DELTA);
			out.write('\u00FF');
			break;
		}
		case EPSILON:
		{
			match(EPSILON);
			out.write('\u00FF');
			break;
		}
		case ZETA:
		{
			match(ZETA);
			out.write('\u00FF');
			break;
		}
		case ETA:
		{
			match(ETA);
			out.write('\u00FF');
			break;
		}
		case THETA:
		{
			match(THETA);
			out.write('\u00FF');
			break;
		}
		case IOTA:
		{
			match(IOTA);
			out.write('\u00FF');
			break;
		}
		case KAPPA:
		{
			match(KAPPA);
			out.write('\u00FF');
			break;
		}
		case LAMBDA:
		{
			match(LAMBDA);
			out.write('\u00FF');
			break;
		}
		case MU:
		{
			match(MU);
			out.write('\u00FF');
			break;
		}
		case NU:
		{
			match(NU);
			out.write('\u00FF');
			break;
		}
		case XI:
		{
			match(XI);
			out.write('\u00FF');
			break;
		}
		case OMICRON:
		{
			match(OMICRON);
			out.write('\u00FF');
			break;
		}
		case PI:
		{
			match(PI);
			out.write('\u00FF');
			break;
		}
		case RHO:
		{
			match(RHO);
			out.write('\u00FF');
			break;
		}
		case SIGMA:
		{
			match(SIGMA);
			out.write('\u00FF');
			break;
		}
		case TAU:
		{
			match(TAU);
			out.write('\u00FF');
			break;
		}
		case UPSILON:
		{
			match(UPSILON);
			out.write('\u00FF');
			break;
		}
		case PHI:
		{
			match(PHI);
			out.write('\u00FF');
			break;
		}
		case CHI:
		{
			match(CHI);
			out.write('\u00FF');
			break;
		}
		case PSI:
		{
			match(PSI);
			out.write('\u00FF');
			break;
		}
		case OMEGA:
		{
			match(OMEGA);
			out.write('\u00FF');
			break;
		}
		case ALPHA_LC:
		{
			match(ALPHA_LC);
			out.write('\u00FF');
			break;
		}
		case BETA_LC:
		{
			match(BETA_LC);
			out.write('\u00FF');
			break;
		}
		case GAMMA_LC:
		{
			match(GAMMA_LC);
			out.write('\u00FF');
			break;
		}
		case DELTA_LC:
		{
			match(DELTA_LC);
			out.write('\u00FF');
			break;
		}
		case EPSILON_LC:
		{
			match(EPSILON_LC);
			out.write('\u00FF');
			break;
		}
		case ZETA_LC:
		{
			match(ZETA_LC);
			out.write('\u00FF');
			break;
		}
		case ETA_LC:
		{
			match(ETA_LC);
			out.write('\u00FF');
			break;
		}
		case THETA_LC:
		{
			match(THETA_LC);
			out.write('\u00FF');
			break;
		}
		case IOTA_LC:
		{
			match(IOTA_LC);
			out.write('\u00FF');
			break;
		}
		case KAPPA_LC:
		{
			match(KAPPA_LC);
			out.write('\u00FF');
			break;
		}
		case LAMBDA_LC:
		{
			match(LAMBDA_LC);
			out.write('\u00FF');
			break;
		}
		case MU_LC:
		{
			match(MU_LC);
			out.write('\u00FF');
			break;
		}
		case NU_LC:
		{
			match(NU_LC);
			out.write('\u00FF');
			break;
		}
		case XI_LC:
		{
			match(XI_LC);
			out.write('\u00FF');
			break;
		}
		case OMICRON_LC:
		{
			match(OMICRON_LC);
			out.write('\u00FF');
			break;
		}
		case PI_LC:
		{
			match(PI_LC);
			out.write('\u00FF');
			break;
		}
		case RHO_LC:
		{
			match(RHO_LC);
			out.write('\u00FF');
			break;
		}
		case SIGMAF_LC:
		{
			match(SIGMAF_LC);
			out.write('\u00FF');
			break;
		}
		case SIGMA_LC:
		{
			match(SIGMA_LC);
			out.write('\u00FF');
			break;
		}
		case TAU_LC:
		{
			match(TAU_LC);
			out.write('\u00FF');
			break;
		}
		case UPSILON_LC:
		{
			match(UPSILON_LC);
			out.write('\u00FF');
			break;
		}
		case PHI_LC:
		{
			match(PHI_LC);
			out.write('\u00FF');
			break;
		}
		case CHI_LC:
		{
			match(CHI_LC);
			out.write('\u00FF');
			break;
		}
		case PSI_LC:
		{
			match(PSI_LC);
			out.write('\u00FF');
			break;
		}
		case OMEGA_LC:
		{
			match(OMEGA_LC);
			out.write('\u00FF');
			break;
		}
		case THETASYM:
		{
			match(THETASYM);
			out.write('\u00FF');
			break;
		}
		case UPSIH:
		{
			match(UPSIH);
			out.write('\u00FF');
			break;
		}
		case PIV:
		{
			match(PIV);
			out.write('\u00FF');
			break;
		}
		case BULL:
		{
			match(BULL);
			out.write('\u00FF');
			break;
		}
		case HELLIP:
		{
			match(HELLIP);
			out.write('\u00FF');
			break;
		}
		case PRIME_LC:
		{
			match(PRIME_LC);
			out.write('\u00FF');
			break;
		}
		case PRIME:
		{
			match(PRIME);
			out.write('\u00FF');
			break;
		}
		case OLINE:
		{
			match(OLINE);
			out.write('\u00FF');
			break;
		}
		case FRASL:
		{
			match(FRASL);
			out.write('\u00FF');
			break;
		}
		case WEIERP:
		{
			match(WEIERP);
			out.write('\u00FF');
			break;
		}
		case IMAGE:
		{
			match(IMAGE);
			out.write('\u00FF');
			break;
		}
		case REAL:
		{
			match(REAL);
			out.write('\u00FF');
			break;
		}
		case TRADE:
		{
			match(TRADE);
			out.write('\u00FF');
			break;
		}
		case ALEFSYM:
		{
			match(ALEFSYM);
			out.write('\u00FF');
			break;
		}
		case LARR:
		{
			match(LARR);
			out.write('\u00FF');
			break;
		}
		case UARR:
		{
			match(UARR);
			out.write('\u00FF');
			break;
		}
		case RARR:
		{
			match(RARR);
			out.write('\u00FF');
			break;
		}
		case DARR:
		{
			match(DARR);
			out.write('\u00FF');
			break;
		}
		case HARR:
		{
			match(HARR);
			out.write('\u00FF');
			break;
		}
		case CRARR:
		{
			match(CRARR);
			out.write('\u00FF');
			break;
		}
		case LARR_D:
		{
			match(LARR_D);
			out.write('\u00FF');
			break;
		}
		case UARR_D:
		{
			match(UARR_D);
			out.write('\u00FF');
			break;
		}
		case RARR_D:
		{
			match(RARR_D);
			out.write('\u00FF');
			break;
		}
		case DARR_D:
		{
			match(DARR_D);
			out.write('\u00FF');
			break;
		}
		case HARR_D:
		{
			match(HARR_D);
			out.write('\u00FF');
			break;
		}
		case FORALL:
		{
			match(FORALL);
			out.write('\u00FF');
			break;
		}
		case PART:
		{
			match(PART);
			out.write('\u00FF');
			break;
		}
		case EXIST:
		{
			match(EXIST);
			out.write('\u00FF');
			break;
		}
		case EMPTY:
		{
			match(EMPTY);
			out.write('\u00FF');
			break;
		}
		case NABLA:
		{
			match(NABLA);
			out.write('\u00FF');
			break;
		}
		case ISIN:
		{
			match(ISIN);
			out.write('\u00FF');
			break;
		}
		case NOTIN:
		{
			match(NOTIN);
			out.write('\u00FF');
			break;
		}
		case NI:
		{
			match(NI);
			out.write('\u00FF');
			break;
		}
		case PROD:
		{
			match(PROD);
			out.write('\u00FF');
			break;
		}
		case SUM:
		{
			match(SUM);
			out.write('\u00FF');
			break;
		}
		case MINUS:
		{
			match(MINUS);
			out.write('\u00FF');
			break;
		}
		case LOWAST:
		{
			match(LOWAST);
			out.write('\u00FF');
			break;
		}
		case RADIC:
		{
			match(RADIC);
			out.write('\u00FF');
			break;
		}
		case PROP:
		{
			match(PROP);
			out.write('\u00FF');
			break;
		}
		case INFIN:
		{
			match(INFIN);
			out.write('\u00FF');
			break;
		}
		case ANG:
		{
			match(ANG);
			out.write('\u00FF');
			break;
		}
		case AND:
		{
			match(AND);
			out.write('\u00FF');
			break;
		}
		case OR:
		{
			match(OR);
			out.write('\u00FF');
			break;
		}
		case CAP:
		{
			match(CAP);
			out.write('\u00FF');
			break;
		}
		case CUP:
		{
			match(CUP);
			out.write('\u00FF');
			break;
		}
		case INT:
		{
			match(INT);
			out.write('\u00FF');
			break;
		}
		case THERE4:
		{
			match(THERE4);
			out.write('\u00FF');
			break;
		}
		case SIM:
		{
			match(SIM);
			out.write('\u00FF');
			break;
		}
		case CONG:
		{
			match(CONG);
			out.write('\u00FF');
			break;
		}
		case ASYMP:
		{
			match(ASYMP);
			out.write('\u00FF');
			break;
		}
		case NE:
		{
			match(NE);
			out.write('\u00FF');
			break;
		}
		case EQUIV:
		{
			match(EQUIV);
			out.write('\u00FF');
			break;
		}
		case LE:
		{
			match(LE);
			out.write('\u00FF');
			break;
		}
		case GE:
		{
			match(GE);
			out.write('\u00FF');
			break;
		}
		case SUB:
		{
			match(SUB);
			out.write('\u00FF');
			break;
		}
		case SUP:
		{
			match(SUP);
			out.write('\u00FF');
			break;
		}
		case NSUB:
		{
			match(NSUB);
			out.write('\u00FF');
			break;
		}
		case SUBE:
		{
			match(SUBE);
			out.write('\u00FF');
			break;
		}
		case SUPE:
		{
			match(SUPE);
			out.write('\u00FF');
			break;
		}
		case OPLUS:
		{
			match(OPLUS);
			out.write('\u00FF');
			break;
		}
		case OTIMES:
		{
			match(OTIMES);
			out.write('\u00FF');
			break;
		}
		case PERP:
		{
			match(PERP);
			out.write('\u00FF');
			break;
		}
		case SDOT:
		{
			match(SDOT);
			out.write('\u00FF');
			break;
		}
		case LCEIL:
		{
			match(LCEIL);
			out.write('\u00FF');
			break;
		}
		case RCEIL:
		{
			match(RCEIL);
			out.write('\u00FF');
			break;
		}
		case LFLOOR:
		{
			match(LFLOOR);
			out.write('\u00FF');
			break;
		}
		case RFLOOR:
		{
			match(RFLOOR);
			out.write('\u00FF');
			break;
		}
		case LANG:
		{
			match(LANG);
			out.write('\u00FF');
			break;
		}
		case RANG:
		{
			match(RANG);
			out.write('\u00FF');
			break;
		}
		case LOZ:
		{
			match(LOZ);
			out.write('\u00FF');
			break;
		}
		case SPADES:
		{
			match(SPADES);
			out.write('\u00FF');
			break;
		}
		case CLUBS:
		{
			match(CLUBS);
			out.write('\u00FF');
			break;
		}
		case HEARTS:
		{
			match(HEARTS);
			out.write('\u00FF');
			break;
		}
		case DIAMS:
		{
			match(DIAMS);
			out.write('\u00FF');
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
		{
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
		"ANY_CHAR",
		"MICRO"
	};
	
	
	}
