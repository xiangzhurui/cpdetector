// $ANTLR : "charsetParser.g" -> "HTMLCharsetLexer.java"$

	package cpdetector.io.parser;

import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.NoViableAltForCharException;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;

public class HTMLCharsetLexer extends antlr.CharScanner implements HTMLCharsetParserTokenTypes, TokenStream
 {
public HTMLCharsetLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public HTMLCharsetLexer(Reader in) {
	this(new CharBuffer(in));
}
public HTMLCharsetLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public HTMLCharsetLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = true;
	setCaseSensitive(false);
	literals = new Hashtable();
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		setCommitToPath(false);
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				if ((LA(1)=='m')) {
					mMETA_CONTENT_TYPE(true);
					theRetToken=_returnToken;
				}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {consume(); continue tryAgain;}
				}
				
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				if ( !getCommitToPath() ) {consume(); continue tryAgain;}
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

	public final void mMETA_CONTENT_TYPE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = META_CONTENT_TYPE;
		int _saveIndex;
		
		_saveIndex=text.length();
		match("meta");
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case 'h':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match("http-equiv");
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '=':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match('=');
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '"':  case 'c':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		switch ( LA(1)) {
		case '"':
		{
			_saveIndex=text.length();
			match('\"');
			text.setLength(_saveIndex);
			{
			switch ( LA(1)) {
			case '\n':  case '\r':  case ' ':
			{
				_saveIndex=text.length();
				mSPACING(false);
				text.setLength(_saveIndex);
				break;
			}
			case 'c':
			{
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			break;
		}
		case 'c':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match("content-type");
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '"':  case 'c':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		switch ( LA(1)) {
		case '"':
		{
			_saveIndex=text.length();
			match('\"');
			text.setLength(_saveIndex);
			{
			switch ( LA(1)) {
			case '\n':  case '\r':  case ' ':
			{
				_saveIndex=text.length();
				mSPACING(false);
				text.setLength(_saveIndex);
				break;
			}
			case 'c':
			{
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			break;
		}
		case 'c':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match("content");
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '=':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match('=');
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '"':  case '/':  case '0':  case '1':
		case '2':  case '3':  case '4':  case '5':
		case '6':  case '7':  case '8':  case '9':
		case ';':  case 'a':  case 'b':  case 'c':
		case 'd':  case 'e':  case 'f':  case 'g':
		case 'h':  case 'i':  case 'j':  case 'k':
		case 'l':  case 'm':  case 'n':  case 'o':
		case 'p':  case 'q':  case 'r':  case 's':
		case 't':  case 'u':  case 'v':  case 'w':
		case 'x':  case 'y':  case 'z':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		switch ( LA(1)) {
		case '"':
		{
			_saveIndex=text.length();
			match('\"');
			text.setLength(_saveIndex);
			{
			switch ( LA(1)) {
			case '\n':  case '\r':  case ' ':
			{
				_saveIndex=text.length();
				mSPACING(false);
				text.setLength(_saveIndex);
				break;
			}
			case '/':  case '0':  case '1':  case '2':
			case '3':  case '4':  case '5':  case '6':
			case '7':  case '8':  case '9':  case ';':
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			break;
		}
		case '/':  case '0':  case '1':  case '2':
		case '3':  case '4':  case '5':  case '6':
		case '7':  case '8':  case '9':  case ';':
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		_loop631:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				_saveIndex=text.length();
				mLETTER(false);
				text.setLength(_saveIndex);
				{
				switch ( LA(1)) {
				case '\n':  case '\r':  case ' ':
				{
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
					break;
				}
				case '/':  case '0':  case '1':  case '2':
				case '3':  case '4':  case '5':  case '6':
				case '7':  case '8':  case '9':  case ';':
				case 'a':  case 'b':  case 'c':  case 'd':
				case 'e':  case 'f':  case 'g':  case 'h':
				case 'i':  case 'j':  case 'k':  case 'l':
				case 'm':  case 'n':  case 'o':  case 'p':
				case 'q':  case 'r':  case 's':  case 't':
				case 'u':  case 'v':  case 'w':  case 'x':
				case 'y':  case 'z':
				{
					break;
				}
				default:
				{
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				}
				}
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				_saveIndex=text.length();
				mDIGIT(false);
				text.setLength(_saveIndex);
				{
				switch ( LA(1)) {
				case '\n':  case '\r':  case ' ':
				{
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
					break;
				}
				case '/':  case '0':  case '1':  case '2':
				case '3':  case '4':  case '5':  case '6':
				case '7':  case '8':  case '9':  case ';':
				case 'a':  case 'b':  case 'c':  case 'd':
				case 'e':  case 'f':  case 'g':  case 'h':
				case 'i':  case 'j':  case 'k':  case 'l':
				case 'm':  case 'n':  case 'o':  case 'p':
				case 'q':  case 'r':  case 's':  case 't':
				case 'u':  case 'v':  case 'w':  case 'x':
				case 'y':  case 'z':
				{
					break;
				}
				default:
				{
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				}
				}
				break;
			}
			case '/':
			{
				_saveIndex=text.length();
				match('/');
				text.setLength(_saveIndex);
				{
				switch ( LA(1)) {
				case '\n':  case '\r':  case ' ':
				{
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
					break;
				}
				case '/':  case '0':  case '1':  case '2':
				case '3':  case '4':  case '5':  case '6':
				case '7':  case '8':  case '9':  case ';':
				case 'a':  case 'b':  case 'c':  case 'd':
				case 'e':  case 'f':  case 'g':  case 'h':
				case 'i':  case 'j':  case 'k':  case 'l':
				case 'm':  case 'n':  case 'o':  case 'p':
				case 'q':  case 'r':  case 's':  case 't':
				case 'u':  case 'v':  case 'w':  case 'x':
				case 'y':  case 'z':
				{
					break;
				}
				default:
				{
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				}
				}
				break;
			}
			default:
			{
				break _loop631;
			}
			}
		} while (true);
		}
		_saveIndex=text.length();
		match(';');
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case 'c':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match("charset");
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case '\n':  case '\r':  case ' ':
		{
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
			break;
		}
		case '=':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		_saveIndex=text.length();
		match('=');
		text.setLength(_saveIndex);
		{
		if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
			_saveIndex=text.length();
			mSPACING(false);
			text.setLength(_saveIndex);
		}
		else {
		}
		
		}
		{
		_loop640:
		do {
			switch ( LA(1)) {
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				mLETTER(false);
				{
				if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
				}
				else {
				}
				
				}
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				mDIGIT(false);
				{
				if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
				}
				else {
				}
				
				}
				break;
			}
			case '-':
			{
				match('-');
				{
				if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
				}
				else {
				}
				
				}
				break;
			}
			case '_':
			{
				match('_');
				{
				if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
					_saveIndex=text.length();
					mSPACING(false);
					text.setLength(_saveIndex);
				}
				else {
				}
				
				}
				break;
			}
			default:
			{
				break _loop640;
			}
			}
		} while (true);
		}
		{
		if ((LA(1)=='"')) {
			_saveIndex=text.length();
			match('\"');
			text.setLength(_saveIndex);
			{
			if ((LA(1)=='\n'||LA(1)=='\r'||LA(1)==' ')) {
				_saveIndex=text.length();
				mSPACING(false);
				text.setLength(_saveIndex);
			}
			else {
			}
			
			}
		}
		else {
		}
		
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mSPACING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SPACING;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '\n':  case '\r':
		{
			mNEWLINE(false);
			break;
		}
		case ' ':
		{
			mSPACE(false);
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mLETTER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LETTER;
		int _saveIndex;
		
		matchRange('a','z');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT;
		int _saveIndex;
		
		matchRange('0','9');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mNEWLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NEWLINE;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '\n':
		{
			match('\n');
			newline();
			break;
		}
		case '\r':
		{
			match('\r');
			match('\n');
			newline();
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mSPACE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SPACE;
		int _saveIndex;
		
		match(' ');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	
	}
