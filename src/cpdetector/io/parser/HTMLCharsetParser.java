// $ANTLR : "charsetParser.g" -> "HTMLCharsetParser.java"$

	package cpdetector.io.parser;

import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.TokenStreamException;

public class HTMLCharsetParser extends antlr.LLkParser       implements HTMLCharsetParserTokenTypes
 {

protected HTMLCharsetParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public HTMLCharsetParser(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected HTMLCharsetParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public HTMLCharsetParser(TokenStream lexer) {
  this(lexer,2);
}

public HTMLCharsetParser(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
}

	public final String  htmlDocument() throws RecognitionException, TokenStreamException {
		String charset;
		
		Token  token = null;
		
		switch ( LA(1)) {
		case META_CONTENT_TYPE:
		{
			{
			token = LT(1);
			match(META_CONTENT_TYPE);
			}
			charset=token.getText();
			break;
		}
		case EOF:
		{
			charset=null;
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return charset;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"META_CONTENT_TYPE",
		"SPACING",
		"NEWLINE",
		"SPACE",
		"DIGIT",
		"LETTER"
	};
	
	
	}
