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
		"ANY_CHAR",
		"MICRO"
	};
	
	
	}
