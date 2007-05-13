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
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='h') && (LA(4)=='e') && (LA(5)=='t') && (LA(6)=='a') && (LA(7)==';')) {
					mTHETA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='i') && (LA(4)=='g') && (LA(5)=='m') && (LA(6)=='a') && (LA(7)=='f')) {
					mSIGMAF_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='i') && (LA(4)=='g') && (LA(5)=='m') && (LA(6)=='a') && (LA(7)==';')) {
					mSIGMA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='h') && (LA(4)=='e') && (LA(5)=='t') && (LA(6)=='a') && (LA(7)=='s')) {
					mTHETASYM(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='r') && (LA(4)=='a') && (LA(5)=='c') && (LA(6)=='3')) {
					mFRAC34(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='p') && (LA(4)=='s') && (LA(5)=='i') && (LA(6)=='l')) {
					mUPSILON_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='p') && (LA(4)=='s') && (LA(5)=='i') && (LA(6)=='h')) {
					mUPSIH(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='r') && (LA(4)=='d') && (LA(5)=='f')) {
					mORDF(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='o') && (LA(4)=='t') && (LA(5)==';')) {
					mNOT(true);
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
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='a') && (LA(4)=='r') && (LA(5)=='a')) {
					mPARA(true);
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
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='t') && (LA(4)=='i') && (LA(5)=='l')) {
					mOTILDE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='r') && (LA(4)=='a') && (LA(5)=='s')) {
					mFRASL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='a') && (LA(4)=='r') && (LA(5)=='t')) {
					mPART(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='o') && (LA(4)=='t') && (LA(5)=='i')) {
					mNOTIN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='r') && (LA(4)=='o') && (LA(5)=='d')) {
					mPROD(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='r') && (LA(4)=='o') && (LA(5)=='p')) {
					mPROP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='h') && (LA(4)=='e') && (LA(5)=='r')) {
					mTHERE4(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='b') && (LA(5)==';')) {
					mSUB(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='p') && (LA(5)==';')) {
					mSUP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='b') && (LA(5)=='e')) {
					mSUBE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='p') && (LA(5)=='e')) {
					mSUPE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='t') && (LA(4)=='i') && (LA(5)=='m')) {
					mOTIMES(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='e') && (LA(4)=='n')) {
					mCENT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='u') && (LA(4)=='r')) {
					mCURREN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='o') && (LA(4)=='p')) {
					mCOPY(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='a') && (LA(4)=='q')) {
					mLAQUO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='e') && (LA(4)=='g')) {
					mREG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='e') && (LA(4)=='g')) {
					mDEG(true);
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
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='a') && (LA(4)=='q')) {
					mRAQUO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='c') && (LA(4)=='i')) {
					mACIRC_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='t') && (LA(4)=='h')) {
					mETH_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='i') && (LA(4)=='v')) {
					mDIVIDE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='a') && (LA(4)=='c')) {
					mUACUTE_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='h') && (LA(4)=='o')) {
					mTHORN_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='m') && (LA(4)=='i')) {
					mOMICRON(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='O') && (LA(3)=='m') && (LA(4)=='e')) {
					mOMEGA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='l') && (LA(4)=='p')) {
					mALPHA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='e') && (LA(4)=='l')) {
					mDELTA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='t') && (LA(4)=='a')) {
					mETA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='a') && (LA(4)=='m')) {
					mLAMBDA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='m') && (LA(4)=='i')) {
					mOMICRON_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='i') && (LA(4)==';')) {
					mPI_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='m') && (LA(4)=='e')) {
					mOMEGA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='i') && (LA(4)=='v')) {
					mPIV(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='h') && (LA(3)=='e') && (LA(4)=='l')) {
					mHELLIP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='r') && (LA(4)=='i')) {
					mPRIME_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='e') && (LA(4)=='a')) {
					mREAL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='l') && (LA(4)=='e')) {
					mALEFSYM(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='a') && (LA(4)=='r')) {
					mLARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='a') && (LA(4)=='r')) {
					mUARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='a') && (LA(4)=='r')) {
					mRARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='u') && (LA(4)=='m')) {
					mSUM(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='i') && (LA(4)=='n')) {
					mMINUS(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='o') && (LA(4)=='w')) {
					mLOWAST(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='a') && (LA(4)=='d')) {
					mRADIC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='n') && (LA(4)=='f')) {
					mINFIN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='n') && (LA(4)=='g')) {
					mANG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='n') && (LA(4)=='d')) {
					mAND(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='r') && (LA(4)==';')) {
					mOR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='u') && (LA(4)=='p')) {
					mCUP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='n') && (LA(4)=='t')) {
					mINT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='i') && (LA(4)=='m')) {
					mSIM(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='o') && (LA(4)=='n')) {
					mCONG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='a') && (LA(4)=='n')) {
					mLANG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='a') && (LA(4)=='n')) {
					mRANG(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='o') && (LA(4)=='z')) {
					mLOZ(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='h') && (LA(3)=='e') && (LA(4)=='a')) {
					mHEARTS(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='i') && (LA(4)=='a')) {
					mDIAMS(true);
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
				else if ((LA(1)=='&') && (LA(2)=='y') && (LA(3)=='e')) {
					mYEN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='b') && (LA(3)=='r')) {
					mBRVBAR(true);
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
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='h')) {
					mSHY(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='a')) {
					mMACR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='l')) {
					mPLUSMN(true);
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
				else if ((LA(1)=='&') && (LA(2)=='C') && (LA(3)=='c')) {
					mCCEDIL(true);
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
				else if ((LA(1)=='&') && (LA(2)=='N') && (LA(3)=='t')) {
					mNTILDE(true);
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
				else if ((LA(1)=='&') && (LA(2)=='T') && (LA(3)=='H')) {
					mTHORN(true);
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
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='u')) {
					mOUML_LC(true);
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
				else if ((LA(1)=='&') && (LA(2)=='y') && (LA(3)=='u')) {
					mYUML_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='A') && (LA(3)=='l')) {
					mALPHA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='p')) {
					mEPSILON(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='E') && (LA(3)=='t')) {
					mETA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='T') && (LA(3)=='h')) {
					mTHETA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='I') && (LA(3)=='o')) {
					mIOTA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='N') && (LA(3)=='u')) {
					mNU(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='P') && (LA(3)=='i')) {
					mPI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='T') && (LA(3)=='a')) {
					mTAU(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='U') && (LA(3)=='p')) {
					mUPSILON(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='P') && (LA(3)=='h')) {
					mPHI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='C') && (LA(3)=='h')) {
					mCHI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='P') && (LA(3)=='s')) {
					mPSI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='b') && (LA(3)=='e')) {
					mBETA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='g') && (LA(3)=='a')) {
					mGAMMA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='p')) {
					mEPSILON_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='o')) {
					mIOTA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='m') && (LA(3)=='u')) {
					mMU_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='u')) {
					mNU_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='h')) {
					mRHO_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='a')) {
					mTAU_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='h')) {
					mPHI_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='h')) {
					mCHI_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='s')) {
					mPSI_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='b') && (LA(3)=='u')) {
					mBULL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='P') && (LA(3)=='r')) {
					mPRIME(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='l')) {
					mOLINE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='m')) {
					mIMAGE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='t') && (LA(3)=='r')) {
					mTRADE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='a')) {
					mDARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='h') && (LA(3)=='a')) {
					mHARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='r')) {
					mCRARR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='A')) {
					mLARR_D(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='u') && (LA(3)=='A')) {
					mUARR_D(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='A')) {
					mRARR_D(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='d') && (LA(3)=='A')) {
					mDARR_D(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='h') && (LA(3)=='A')) {
					mHARR_D(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='f') && (LA(3)=='o')) {
					mFORALL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='x')) {
					mEXIST(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='m')) {
					mEMPTY(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='a')) {
					mNABLA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='i') && (LA(3)=='s')) {
					mISIN(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='i')) {
					mNI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='a')) {
					mCAP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='a') && (LA(3)=='s')) {
					mASYMP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='e')) {
					mNE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='e') && (LA(3)=='q')) {
					mEQUIV(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='e')) {
					mLE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='g') && (LA(3)=='e')) {
					mGE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='n') && (LA(3)=='s')) {
					mNSUB(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='o') && (LA(3)=='p')) {
					mOPLUS(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='p') && (LA(3)=='e')) {
					mPERP(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='d')) {
					mSDOT(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='c')) {
					mLCEIL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='c')) {
					mRCEIL(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='l') && (LA(3)=='f')) {
					mLFLOOR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='r') && (LA(3)=='f')) {
					mRFLOOR(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='s') && (LA(3)=='p')) {
					mSPADES(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='c') && (LA(3)=='l')) {
					mCLUBS(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='Y')) {
					mYACUTE(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='B')) {
					mBETA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='G')) {
					mGAMMA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='D')) {
					mDELTA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='Z')) {
					mZETA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='K')) {
					mKAPPA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='L')) {
					mLAMBDA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='M')) {
					mMU(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='X')) {
					mXI(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='R')) {
					mRHO(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='S')) {
					mSIGMA(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='z')) {
					mZETA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='k')) {
					mKAPPA_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='x')) {
					mXI_LC(true);
					theRetToken=_returnToken;
				}
				else if ((LA(1)=='&') && (LA(2)=='w')) {
					mWEIERP(true);
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
              e.printStackTrace(System.err);
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
	
	public final void mALPHA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ALPHA;
		int _saveIndex;
		
		match("&Alpha;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BETA;
		int _saveIndex;
		
		match("&Beta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mGAMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GAMMA;
		int _saveIndex;
		
		match("&Gamma;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDELTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DELTA;
		int _saveIndex;
		
		match("&Delta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EPSILON;
		int _saveIndex;
		
		match("&Epsilon;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mZETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ZETA;
		int _saveIndex;
		
		match("&Zeta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ETA;
		int _saveIndex;
		
		match("&Eta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THETA;
		int _saveIndex;
		
		match("&Theta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIOTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IOTA;
		int _saveIndex;
		
		match("&Iota;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mKAPPA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = KAPPA;
		int _saveIndex;
		
		match("&Kappa;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLAMBDA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LAMBDA;
		int _saveIndex;
		
		match("&Lambda;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MU;
		int _saveIndex;
		
		match("&Mu;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NU;
		int _saveIndex;
		
		match("&Nu;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mXI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = XI;
		int _saveIndex;
		
		match("&Xi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOMICRON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OMICRON;
		int _saveIndex;
		
		match("&Omicron;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PI;
		int _saveIndex;
		
		match("&Pi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRHO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RHO;
		int _saveIndex;
		
		match("&Rho;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSIGMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SIGMA;
		int _saveIndex;
		
		match("&Sigma;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTAU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TAU;
		int _saveIndex;
		
		match("&Tau;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UPSILON;
		int _saveIndex;
		
		match("&Upsilon;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PHI;
		int _saveIndex;
		
		match("&Phi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHI;
		int _saveIndex;
		
		match("&Chi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPSI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PSI;
		int _saveIndex;
		
		match("&Psi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOMEGA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OMEGA;
		int _saveIndex;
		
		match("&Omega;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mALPHA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ALPHA_LC;
		int _saveIndex;
		
		match("&alpha;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BETA_LC;
		int _saveIndex;
		
		match("&beta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mGAMMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GAMMA_LC;
		int _saveIndex;
		
		match("&gamma;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDELTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DELTA_LC;
		int _saveIndex;
		
		match("&delta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EPSILON_LC;
		int _saveIndex;
		
		match("&epsilon;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mZETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ZETA_LC;
		int _saveIndex;
		
		match("&zeta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ETA_LC;
		int _saveIndex;
		
		match("&eta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THETA_LC;
		int _saveIndex;
		
		match("&theta;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIOTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IOTA_LC;
		int _saveIndex;
		
		match("&iota;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mKAPPA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = KAPPA_LC;
		int _saveIndex;
		
		match("&kappa;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLAMBDA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LAMBDA_LC;
		int _saveIndex;
		
		match("&lambda;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MU_LC;
		int _saveIndex;
		
		match("&mu;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NU_LC;
		int _saveIndex;
		
		match("&nu;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mXI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = XI_LC;
		int _saveIndex;
		
		match("&xi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOMICRON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OMICRON_LC;
		int _saveIndex;
		
		match("&omicron;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PI_LC;
		int _saveIndex;
		
		match("&pi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRHO_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RHO_LC;
		int _saveIndex;
		
		match("&rho;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSIGMAF_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SIGMAF_LC;
		int _saveIndex;
		
		match("&sigmaf;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSIGMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SIGMA_LC;
		int _saveIndex;
		
		match("&sigma;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTAU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TAU_LC;
		int _saveIndex;
		
		match("&tau;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UPSILON_LC;
		int _saveIndex;
		
		match("&upsilon;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PHI_LC;
		int _saveIndex;
		
		match("&phi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CHI_LC;
		int _saveIndex;
		
		match("&chi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPSI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PSI_LC;
		int _saveIndex;
		
		match("&psi;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOMEGA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OMEGA_LC;
		int _saveIndex;
		
		match("&omega;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHETASYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THETASYM;
		int _saveIndex;
		
		match("&thetasym;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUPSIH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UPSIH;
		int _saveIndex;
		
		match("&upsih;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PIV;
		int _saveIndex;
		
		match("&piv;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mBULL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BULL;
		int _saveIndex;
		
		match("&bull;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHELLIP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HELLIP;
		int _saveIndex;
		
		match("&hellip;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPRIME_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PRIME_LC;
		int _saveIndex;
		
		match("&prime;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPRIME(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PRIME;
		int _saveIndex;
		
		match("&Prime;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OLINE;
		int _saveIndex;
		
		match("&oline;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFRASL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FRASL;
		int _saveIndex;
		
		match("&frasl;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mWEIERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WEIERP;
		int _saveIndex;
		
		match("&weierp;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIMAGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IMAGE;
		int _saveIndex;
		
		match("&image;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mREAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = REAL;
		int _saveIndex;
		
		match("&real;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTRADE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = TRADE;
		int _saveIndex;
		
		match("&trade;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mALEFSYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ALEFSYM;
		int _saveIndex;
		
		match("&alefsym;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LARR;
		int _saveIndex;
		
		match("&larr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UARR;
		int _saveIndex;
		
		match("&uarr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RARR;
		int _saveIndex;
		
		match("&rarr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DARR;
		int _saveIndex;
		
		match("&darr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HARR;
		int _saveIndex;
		
		match("&harr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CRARR;
		int _saveIndex;
		
		match("&crarr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LARR_D;
		int _saveIndex;
		
		match("&lArr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mUARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = UARR_D;
		int _saveIndex;
		
		match("&uArr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RARR_D;
		int _saveIndex;
		
		match("&rArr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DARR_D;
		int _saveIndex;
		
		match("&dArr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HARR_D;
		int _saveIndex;
		
		match("&hArr;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mFORALL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = FORALL;
		int _saveIndex;
		
		match("&forall;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPART(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PART;
		int _saveIndex;
		
		match("&part;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEXIST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXIST;
		int _saveIndex;
		
		match("&exist;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEMPTY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EMPTY;
		int _saveIndex;
		
		match("&empty;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNABLA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NABLA;
		int _saveIndex;
		
		match("&nabla;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mISIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ISIN;
		int _saveIndex;
		
		match("&isin;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNOTIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NOTIN;
		int _saveIndex;
		
		match("&notin;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NI;
		int _saveIndex;
		
		match("&ni;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPROD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PROD;
		int _saveIndex;
		
		match("&prod;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUM;
		int _saveIndex;
		
		match("&sum;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MINUS;
		int _saveIndex;
		
		match("&minus;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLOWAST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LOWAST;
		int _saveIndex;
		
		match("&lowast;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRADIC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RADIC;
		int _saveIndex;
		
		match("&radic;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPROP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PROP;
		int _saveIndex;
		
		match("&prop;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINFIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INFIN;
		int _saveIndex;
		
		match("&infin;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ANG;
		int _saveIndex;
		
		match("&ang;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = AND;
		int _saveIndex;
		
		match("&and;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OR;
		int _saveIndex;
		
		match("&or;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCAP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CAP;
		int _saveIndex;
		
		match("&cap;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CUP;
		int _saveIndex;
		
		match("&cup;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT;
		int _saveIndex;
		
		match("&int;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mTHERE4(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = THERE4;
		int _saveIndex;
		
		match("&there4;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSIM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SIM;
		int _saveIndex;
		
		match("&sim;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCONG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CONG;
		int _saveIndex;
		
		match("&cong;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASYMP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASYMP;
		int _saveIndex;
		
		match("&asymp;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NE;
		int _saveIndex;
		
		match("&ne;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mEQUIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EQUIV;
		int _saveIndex;
		
		match("&equiv;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LE;
		int _saveIndex;
		
		match("&le;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = GE;
		int _saveIndex;
		
		match("&ge;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUB;
		int _saveIndex;
		
		match("&sub;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUP;
		int _saveIndex;
		
		match("&sup;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NSUB;
		int _saveIndex;
		
		match("&nsub;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUBE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUBE;
		int _saveIndex;
		
		match("&sube;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSUPE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SUPE;
		int _saveIndex;
		
		match("&supe;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OPLUS;
		int _saveIndex;
		
		match("&oplus;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mOTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = OTIMES;
		int _saveIndex;
		
		match("&otimes;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PERP;
		int _saveIndex;
		
		match("&perp;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SDOT;
		int _saveIndex;
		
		match("&sdot;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCEIL;
		int _saveIndex;
		
		match("&lceil;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCEIL;
		int _saveIndex;
		
		match("&rceil;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LFLOOR;
		int _saveIndex;
		
		match("&lfloor;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RFLOOR;
		int _saveIndex;
		
		match("&rfloor;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LANG;
		int _saveIndex;
		
		match("&lang;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RANG;
		int _saveIndex;
		
		match("&rang;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLOZ(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LOZ;
		int _saveIndex;
		
		match("&loz;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSPADES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SPADES;
		int _saveIndex;
		
		match("&spades;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCLUBS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = CLUBS;
		int _saveIndex;
		
		match("&clubs;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHEARTS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HEARTS;
		int _saveIndex;
		
		match("&hearts;");
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDIAMS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIAMS;
		int _saveIndex;
		
		match("&diams;");
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
		
		if ((LA(1)=='\r') && (LA(2)=='\n')) {
			match('\r');
			match('\n');
			newline();
		}
		else if ((LA(1)=='\n') && (true) && (true) && (true) && (true) && (true) && (true)) {
			match('\n');
			newline();
		}
		else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true) && (true) && (true) && (true) && (true)) {
			matchNot(EOF_CHAR);
		}
		else {
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	
	}
