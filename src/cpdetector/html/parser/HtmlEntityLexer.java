// $ANTLR : "htmlentitydecoder.g" -> "HtmlEntityLexer.java"$

package cpdetector.html.parser;

import java.io.IOException;
import java.io.OutputStreamWriter;

import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.CharScanner;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.CommonToken;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.MismatchedCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.SemanticException;

public class HtmlEntityLexer extends antlr.CharScanner implements HtmlEntityDecoderTokenTypes, TokenStream
 {
public HtmlEntityLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public HtmlEntityLexer(Reader in) {
	this(new CharBuffer(in));
}
public HtmlEntityLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public HtmlEntityLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(true);
	literals = new Hashtable();
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='r') && (LA(4)=='a') && (LA(5)=='c') && (LA(6)=='1') && (LA(7)=='4')) {
					mFRAC14(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='r') && (LA(4)=='a') && (LA(5)=='c') && (LA(6)=='1') && (LA(7)=='2')) {
					mFRAC12(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='r') && (LA(4)=='a') && (LA(5)=='c') && (LA(6)=='3')) {
					mFRAC34(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='r') && (LA(4)=='d') && (LA(5)=='f')) {
					mORDF(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='p') && (LA(5)=='2')) {
					mSUP2(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='p') && (LA(5)=='3')) {
					mSUP3(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='p') && (LA(5)=='1')) {
					mSUP1(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='r') && (LA(4)=='d') && (LA(5)=='m')) {
					mORDM(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='e') && (LA(4)=='n')) {
					mCENT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='c') && (LA(4)=='u')) {
					mACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='i') && (LA(4)=='c')) {
					mMICRO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='i') && (LA(4)=='d')) {
					mMIDDOT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='e') && (LA(4)=='d')) {
					mCEDIL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='c') && (LA(4)=='i')) {
					mACIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='b')) {
					mNBSP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='e')) {
					mIEXCL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='o')) {
					mPOUND(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='u')) {
					mCURREN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='y') && (LA(3)=='e')) {
					mYEN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='e')) {
					mSECT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='m')) {
					mUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='o')) {
					mCOPY(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='o')) {
					mNOT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='h')) {
					mSHY(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='e')) {
					mREG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='a')) {
					mMACR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='e')) {
					mDEG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='l')) {
					mPLUSMN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='a')) {
					mPARA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='a')) {
					mRAQUO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='q')) {
					mIQUEST(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='g')) {
					mAGRAVE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='a')) {
					mAACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='c')) {
					mACIRC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='t')) {
					mATILDE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='u')) {
					mAUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='r')) {
					mARING(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='E')) {
					mAELIG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='g')) {
					mEGRAVE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='a')) {
					mEACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='c')) {
					mECIRC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='u')) {
					mEUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='I') && (LA(3)=='g')) {
					mIGRAVE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='I') && (LA(3)=='a')) {
					mIACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='I') && (LA(3)=='c')) {
					mICIRC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='I') && (LA(3)=='u')) {
					mIUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='T')) {
					mETH(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='g')) {
					mOGRAVE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='a')) {
					mOACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='c')) {
					mOCIRC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='t')) {
					mOTILDE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='u')) {
					mOUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='i')) {
					mTIMES(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='s')) {
					mOSLASH(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='U') && (LA(3)=='g')) {
					mUGRAVE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='U') && (LA(3)=='a')) {
					mUACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='U') && (LA(3)=='c')) {
					mUCIRC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='U') && (LA(3)=='u')) {
					mUUML(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='z')) {
					mSZLIG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='g')) {
					mAGRAVE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='a')) {
					mAACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='t')) {
					mATILDE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='u')) {
					mAUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='r')) {
					mARING_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='e')) {
					mAELIG_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='c')) {
					mCCEDIL_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='g')) {
					mEGRAVE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='a')) {
					mEACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='c')) {
					mECIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='u')) {
					mEUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='g')) {
					mIGRAVE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='a')) {
					mIACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='c')) {
					mICIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='u')) {
					mIUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='t')) {
					mETH_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='t')) {
					mNTILDE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='g')) {
					mOGRAVE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='a')) {
					mOACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='c')) {
					mOCIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='t')) {
					mOTILDE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='u')) {
					mOUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='i')) {
					mDIVIDE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='s')) {
					mOSLASH_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='g')) {
					mUGRAVE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='a')) {
					mUACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='c')) {
					mUCIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='u')) {
					mUUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='y') && (LA(3)=='a')) {
					mYACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='h')) {
					mTHORN_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='y') && (LA(3)=='u')) {
					mYUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='b')) {
					mBRVBAR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l')) {
					mLAQUO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='C')) {
					mCCEDIL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='N')) {
					mNTILDE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='Y')) {
					mYACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='T')) {
					mTHORN(true);
					theRetToken=_returnToken;
				}
				else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true)) {
					mANY_CHAR(true);
					theRetToken=_returnToken;
				}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mNBSP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NBSP;
		int _saveIndex;
		
		match("&nbsp;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIEXCL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IEXCL;
		int _saveIndex;
		
		match("&iexcl;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CENT;
		int _saveIndex;
		
		match("&cent;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPOUND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = POUND;
		int _saveIndex;
		
		match("&pound;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCURREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CURREN;
		int _saveIndex;
		
		match("&curren;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mYEN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = YEN;
		int _saveIndex;
		
		match("&yen;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBRVBAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BRVBAR;
		int _saveIndex;
		
		match("&brvbar;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SECT;
		int _saveIndex;
		
		match("&sect;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UML;
		int _saveIndex;
		
		match("&uml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOPY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COPY;
		int _saveIndex;
		
		match("&copy;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mORDF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ORDF;
		int _saveIndex;
		
		match("&ordf;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LAQUO;
		int _saveIndex;
		
		match("&laquo;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NOT;
		int _saveIndex;
		
		match("&not;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSHY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SHY;
		int _saveIndex;
		
		match("&shy;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mREG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = REG;
		int _saveIndex;
		
		match("&reg;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMACR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MACR;
		int _saveIndex;
		
		match("&macr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDEG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DEG;
		int _saveIndex;
		
		match("&deg;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUSMN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUSMN;
		int _saveIndex;
		
		match("&plusmn;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUP2(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUP2;
		int _saveIndex;
		
		match("&sup2;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUP3(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUP3;
		int _saveIndex;
		
		match("&sup3;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ACUTE;
		int _saveIndex;
		
		match("&acute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMICRO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MICRO;
		int _saveIndex;
		
		match("&micro;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPARA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PARA;
		int _saveIndex;
		
		match("&para;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMIDDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MIDDOT;
		int _saveIndex;
		
		match("&middot");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CEDIL;
		int _saveIndex;
		
		match("&cedil;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUP1(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUP1;
		int _saveIndex;
		
		match("&sup1;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mORDM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ORDM;
		int _saveIndex;
		
		match("&ordm;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RAQUO;
		int _saveIndex;
		
		match("&raquo;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFRAC14(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FRAC14;
		int _saveIndex;
		
		match("&frac14;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFRAC12(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FRAC12;
		int _saveIndex;
		
		match("&frac12;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFRAC34(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FRAC34;
		int _saveIndex;
		
		match("&frac34;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIQUEST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IQUEST;
		int _saveIndex;
		
		match("&iquest;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AGRAVE;
		int _saveIndex;
		
		match("&Agrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AACUTE;
		int _saveIndex;
		
		match("&Aacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mACIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ACIRC;
		int _saveIndex;
		
		match("&Acirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mATILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ATILDE;
		int _saveIndex;
		
		match("&Atilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AUML;
		int _saveIndex;
		
		match("&Auml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mARING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ARING;
		int _saveIndex;
		
		match("&Aring;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAELIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AELIG;
		int _saveIndex;
		
		match("&AElig;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CCEDIL;
		int _saveIndex;
		
		match("&Ccedil;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EGRAVE;
		int _saveIndex;
		
		match("&Egrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EACUTE;
		int _saveIndex;
		
		match("&Eacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mECIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ECIRC;
		int _saveIndex;
		
		match("&Ecirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EUML;
		int _saveIndex;
		
		match("&Euml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IGRAVE;
		int _saveIndex;
		
		match("&Igrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IACUTE;
		int _saveIndex;
		
		match("&Iacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mICIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ICIRC;
		int _saveIndex;
		
		match("&Icirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IUML;
		int _saveIndex;
		
		match("&Iuml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mETH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ETH;
		int _saveIndex;
		
		match("&ETH;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NTILDE;
		int _saveIndex;
		
		match("&Ntilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OGRAVE;
		int _saveIndex;
		
		match("&Ograve;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OACUTE;
		int _saveIndex;
		
		match("&Oacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OCIRC;
		int _saveIndex;
		
		match("&Ocirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OTILDE;
		int _saveIndex;
		
		match("&Otilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OUML;
		int _saveIndex;
		
		match("&Ouml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TIMES;
		int _saveIndex;
		
		match("&times;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OSLASH;
		int _saveIndex;
		
		match("&Oslash;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UGRAVE;
		int _saveIndex;
		
		match("&Ugrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UACUTE;
		int _saveIndex;
		
		match("&Uacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UCIRC;
		int _saveIndex;
		
		match("&Ucirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UUML;
		int _saveIndex;
		
		match("&Uuml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mYACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = YACUTE;
		int _saveIndex;
		
		match("&Yacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHORN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THORN;
		int _saveIndex;
		
		match("&THORN;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSZLIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SZLIG;
		int _saveIndex;
		
		match("&szlig;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AGRAVE_LC;
		int _saveIndex;
		
		match("&agrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AACUTE_LC;
		int _saveIndex;
		
		match("&aacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mACIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ACIRC_LC;
		int _saveIndex;
		
		match("&acirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mATILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ATILDE_LC;
		int _saveIndex;
		
		match("&atilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AUML_LC;
		int _saveIndex;
		
		match("&auml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mARING_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ARING_LC;
		int _saveIndex;
		
		match("&aring;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAELIG_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AELIG_LC;
		int _saveIndex;
		
		match("&aelig;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCCEDIL_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CCEDIL_LC;
		int _saveIndex;
		
		match("&ccedil;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EGRAVE_LC;
		int _saveIndex;
		
		match("&egrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EACUTE_LC;
		int _saveIndex;
		
		match("&eacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mECIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ECIRC_LC;
		int _saveIndex;
		
		match("&ecirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EUML_LC;
		int _saveIndex;
		
		match("&euml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IGRAVE_LC;
		int _saveIndex;
		
		match("&igrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IACUTE_LC;
		int _saveIndex;
		
		match("&iacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mICIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ICIRC_LC;
		int _saveIndex;
		
		match("&icirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IUML_LC;
		int _saveIndex;
		
		match("&iuml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mETH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ETH_LC;
		int _saveIndex;
		
		match("&eth;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NTILDE_LC;
		int _saveIndex;
		
		match("&ntilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OGRAVE_LC;
		int _saveIndex;
		
		match("&ograve;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OACUTE_LC;
		int _saveIndex;
		
		match("&oacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OCIRC_LC;
		int _saveIndex;
		
		match("&ocirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OTILDE_LC;
		int _saveIndex;
		
		match("&otilde;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OUML_LC;
		int _saveIndex;
		
		match("&ouml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIVIDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIVIDE;
		int _saveIndex;
		
		match("&divide;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOSLASH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OSLASH_LC;
		int _saveIndex;
		
		match("&oslash;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UGRAVE_LC;
		int _saveIndex;
		
		match("&ugrave;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UACUTE_LC;
		int _saveIndex;
		
		match("&uacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UCIRC_LC;
		int _saveIndex;
		
		match("&ucirc;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UUML_LC;
		int _saveIndex;
		
		match("&uuml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mYACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = YACUTE_LC;
		int _saveIndex;
		
		match("&yacute;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHORN_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THORN_LC;
		int _saveIndex;
		
		match("&thorn;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mYUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = YUML_LC;
		int _saveIndex;
		
		match("&yuml;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mANY_CHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ANY_CHAR;
		int _saveIndex;
		
		matchNot(EOF_CHAR);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	
	}
