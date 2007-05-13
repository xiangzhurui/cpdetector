// $ANTLR 2.7.4: "htmlentitydecoder.g" -> "HtmlEntityLexer.java"$

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
		traceIn("mNBSP");
		_ttype = NBSP;
		int _saveIndex;
		try { // debugging
			
			match("&nbsp;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNBSP");
		}
	}
	
	public final void mIEXCL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIEXCL");
		_ttype = IEXCL;
		int _saveIndex;
		try { // debugging
			
			match("&iexcl;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIEXCL");
		}
	}
	
	public final void mCENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCENT");
		_ttype = CENT;
		int _saveIndex;
		try { // debugging
			
			match("&cent;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCENT");
		}
	}
	
	public final void mPOUND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPOUND");
		_ttype = POUND;
		int _saveIndex;
		try { // debugging
			
			match("&pound;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPOUND");
		}
	}
	
	public final void mCURREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCURREN");
		_ttype = CURREN;
		int _saveIndex;
		try { // debugging
			
			match("&curren;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCURREN");
		}
	}
	
	public final void mYEN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mYEN");
		_ttype = YEN;
		int _saveIndex;
		try { // debugging
			
			match("&yen;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mYEN");
		}
	}
	
	public final void mBRVBAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mBRVBAR");
		_ttype = BRVBAR;
		int _saveIndex;
		try { // debugging
			
			match("&brvbar;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mBRVBAR");
		}
	}
	
	public final void mSECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSECT");
		_ttype = SECT;
		int _saveIndex;
		try { // debugging
			
			match("&sect;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSECT");
		}
	}
	
	public final void mUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUML");
		_ttype = UML;
		int _saveIndex;
		try { // debugging
			
			match("&uml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUML");
		}
	}
	
	public final void mCOPY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCOPY");
		_ttype = COPY;
		int _saveIndex;
		try { // debugging
			
			match("&copy;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCOPY");
		}
	}
	
	public final void mORDF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mORDF");
		_ttype = ORDF;
		int _saveIndex;
		try { // debugging
			
			match("&ordf;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mORDF");
		}
	}
	
	public final void mLAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLAQUO");
		_ttype = LAQUO;
		int _saveIndex;
		try { // debugging
			
			match("&laquo;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLAQUO");
		}
	}
	
	public final void mNOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNOT");
		_ttype = NOT;
		int _saveIndex;
		try { // debugging
			
			match("&not;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNOT");
		}
	}
	
	public final void mSHY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSHY");
		_ttype = SHY;
		int _saveIndex;
		try { // debugging
			
			match("&shy;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSHY");
		}
	}
	
	public final void mREG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mREG");
		_ttype = REG;
		int _saveIndex;
		try { // debugging
			
			match("&reg;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mREG");
		}
	}
	
	public final void mMACR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMACR");
		_ttype = MACR;
		int _saveIndex;
		try { // debugging
			
			match("&macr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMACR");
		}
	}
	
	public final void mDEG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDEG");
		_ttype = DEG;
		int _saveIndex;
		try { // debugging
			
			match("&deg;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDEG");
		}
	}
	
	public final void mPLUSMN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPLUSMN");
		_ttype = PLUSMN;
		int _saveIndex;
		try { // debugging
			
			match("&plusmn;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPLUSMN");
		}
	}
	
	public final void mSUP2(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUP2");
		_ttype = SUP2;
		int _saveIndex;
		try { // debugging
			
			match("&sup2;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUP2");
		}
	}
	
	public final void mSUP3(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUP3");
		_ttype = SUP3;
		int _saveIndex;
		try { // debugging
			
			match("&sup3;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUP3");
		}
	}
	
	public final void mACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mACUTE");
		_ttype = ACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&acute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mACUTE");
		}
	}
	
	public final void mMICRO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMICRO");
		_ttype = MICRO;
		int _saveIndex;
		try { // debugging
			
			match("&micro;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMICRO");
		}
	}
	
	public final void mPARA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPARA");
		_ttype = PARA;
		int _saveIndex;
		try { // debugging
			
			match("&para;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPARA");
		}
	}
	
	public final void mMIDDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMIDDOT");
		_ttype = MIDDOT;
		int _saveIndex;
		try { // debugging
			
			match("&middot");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMIDDOT");
		}
	}
	
	public final void mCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCEDIL");
		_ttype = CEDIL;
		int _saveIndex;
		try { // debugging
			
			match("&cedil;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCEDIL");
		}
	}
	
	public final void mSUP1(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUP1");
		_ttype = SUP1;
		int _saveIndex;
		try { // debugging
			
			match("&sup1;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUP1");
		}
	}
	
	public final void mORDM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mORDM");
		_ttype = ORDM;
		int _saveIndex;
		try { // debugging
			
			match("&ordm;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mORDM");
		}
	}
	
	public final void mRAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRAQUO");
		_ttype = RAQUO;
		int _saveIndex;
		try { // debugging
			
			match("&raquo;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRAQUO");
		}
	}
	
	public final void mFRAC14(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mFRAC14");
		_ttype = FRAC14;
		int _saveIndex;
		try { // debugging
			
			match("&frac14;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mFRAC14");
		}
	}
	
	public final void mFRAC12(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mFRAC12");
		_ttype = FRAC12;
		int _saveIndex;
		try { // debugging
			
			match("&frac12;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mFRAC12");
		}
	}
	
	public final void mFRAC34(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mFRAC34");
		_ttype = FRAC34;
		int _saveIndex;
		try { // debugging
			
			match("&frac34;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mFRAC34");
		}
	}
	
	public final void mIQUEST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIQUEST");
		_ttype = IQUEST;
		int _saveIndex;
		try { // debugging
			
			match("&iquest;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIQUEST");
		}
	}
	
	public final void mAGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAGRAVE");
		_ttype = AGRAVE;
		int _saveIndex;
		try { // debugging
			
			match("&Agrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAGRAVE");
		}
	}
	
	public final void mAACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAACUTE");
		_ttype = AACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Aacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAACUTE");
		}
	}
	
	public final void mACIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mACIRC");
		_ttype = ACIRC;
		int _saveIndex;
		try { // debugging
			
			match("&Acirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mACIRC");
		}
	}
	
	public final void mATILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mATILDE");
		_ttype = ATILDE;
		int _saveIndex;
		try { // debugging
			
			match("&Atilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mATILDE");
		}
	}
	
	public final void mAUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAUML");
		_ttype = AUML;
		int _saveIndex;
		try { // debugging
			
			match("&Auml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAUML");
		}
	}
	
	public final void mARING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mARING");
		_ttype = ARING;
		int _saveIndex;
		try { // debugging
			
			match("&Aring;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mARING");
		}
	}
	
	public final void mAELIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAELIG");
		_ttype = AELIG;
		int _saveIndex;
		try { // debugging
			
			match("&AElig;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAELIG");
		}
	}
	
	public final void mCCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCCEDIL");
		_ttype = CCEDIL;
		int _saveIndex;
		try { // debugging
			
			match("&Ccedil;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCCEDIL");
		}
	}
	
	public final void mEGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEGRAVE");
		_ttype = EGRAVE;
		int _saveIndex;
		try { // debugging
			
			match("&Egrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEGRAVE");
		}
	}
	
	public final void mEACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEACUTE");
		_ttype = EACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Eacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEACUTE");
		}
	}
	
	public final void mECIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mECIRC");
		_ttype = ECIRC;
		int _saveIndex;
		try { // debugging
			
			match("&Ecirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mECIRC");
		}
	}
	
	public final void mEUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEUML");
		_ttype = EUML;
		int _saveIndex;
		try { // debugging
			
			match("&Euml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEUML");
		}
	}
	
	public final void mIGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIGRAVE");
		_ttype = IGRAVE;
		int _saveIndex;
		try { // debugging
			
			match("&Igrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIGRAVE");
		}
	}
	
	public final void mIACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIACUTE");
		_ttype = IACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Iacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIACUTE");
		}
	}
	
	public final void mICIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mICIRC");
		_ttype = ICIRC;
		int _saveIndex;
		try { // debugging
			
			match("&Icirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mICIRC");
		}
	}
	
	public final void mIUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIUML");
		_ttype = IUML;
		int _saveIndex;
		try { // debugging
			
			match("&Iuml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIUML");
		}
	}
	
	public final void mETH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mETH");
		_ttype = ETH;
		int _saveIndex;
		try { // debugging
			
			match("&ETH;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mETH");
		}
	}
	
	public final void mNTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNTILDE");
		_ttype = NTILDE;
		int _saveIndex;
		try { // debugging
			
			match("&Ntilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNTILDE");
		}
	}
	
	public final void mOGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOGRAVE");
		_ttype = OGRAVE;
		int _saveIndex;
		try { // debugging
			
			match("&Ograve;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOGRAVE");
		}
	}
	
	public final void mOACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOACUTE");
		_ttype = OACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Oacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOACUTE");
		}
	}
	
	public final void mOCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOCIRC");
		_ttype = OCIRC;
		int _saveIndex;
		try { // debugging
			
			match("&Ocirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOCIRC");
		}
	}
	
	public final void mOTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOTILDE");
		_ttype = OTILDE;
		int _saveIndex;
		try { // debugging
			
			match("&Otilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOTILDE");
		}
	}
	
	public final void mOUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOUML");
		_ttype = OUML;
		int _saveIndex;
		try { // debugging
			
			match("&Ouml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOUML");
		}
	}
	
	public final void mTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTIMES");
		_ttype = TIMES;
		int _saveIndex;
		try { // debugging
			
			match("&times;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTIMES");
		}
	}
	
	public final void mOSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOSLASH");
		_ttype = OSLASH;
		int _saveIndex;
		try { // debugging
			
			match("&Oslash;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOSLASH");
		}
	}
	
	public final void mUGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUGRAVE");
		_ttype = UGRAVE;
		int _saveIndex;
		try { // debugging
			
			match("&Ugrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUGRAVE");
		}
	}
	
	public final void mUACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUACUTE");
		_ttype = UACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Uacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUACUTE");
		}
	}
	
	public final void mUCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUCIRC");
		_ttype = UCIRC;
		int _saveIndex;
		try { // debugging
			
			match("&Ucirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUCIRC");
		}
	}
	
	public final void mUUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUUML");
		_ttype = UUML;
		int _saveIndex;
		try { // debugging
			
			match("&Uuml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUUML");
		}
	}
	
	public final void mYACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mYACUTE");
		_ttype = YACUTE;
		int _saveIndex;
		try { // debugging
			
			match("&Yacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mYACUTE");
		}
	}
	
	public final void mTHORN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHORN");
		_ttype = THORN;
		int _saveIndex;
		try { // debugging
			
			match("&THORN;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHORN");
		}
	}
	
	public final void mSZLIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSZLIG");
		_ttype = SZLIG;
		int _saveIndex;
		try { // debugging
			
			match("&szlig;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSZLIG");
		}
	}
	
	public final void mAGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAGRAVE_LC");
		_ttype = AGRAVE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&agrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAGRAVE_LC");
		}
	}
	
	public final void mAACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAACUTE_LC");
		_ttype = AACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&aacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAACUTE_LC");
		}
	}
	
	public final void mACIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mACIRC_LC");
		_ttype = ACIRC_LC;
		int _saveIndex;
		try { // debugging
			
			match("&acirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mACIRC_LC");
		}
	}
	
	public final void mATILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mATILDE_LC");
		_ttype = ATILDE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&atilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mATILDE_LC");
		}
	}
	
	public final void mAUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAUML_LC");
		_ttype = AUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&auml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAUML_LC");
		}
	}
	
	public final void mARING_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mARING_LC");
		_ttype = ARING_LC;
		int _saveIndex;
		try { // debugging
			
			match("&aring;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mARING_LC");
		}
	}
	
	public final void mAELIG_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAELIG_LC");
		_ttype = AELIG_LC;
		int _saveIndex;
		try { // debugging
			
			match("&aelig;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAELIG_LC");
		}
	}
	
	public final void mCCEDIL_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCCEDIL_LC");
		_ttype = CCEDIL_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ccedil;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCCEDIL_LC");
		}
	}
	
	public final void mEGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEGRAVE_LC");
		_ttype = EGRAVE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&egrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEGRAVE_LC");
		}
	}
	
	public final void mEACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEACUTE_LC");
		_ttype = EACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&eacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEACUTE_LC");
		}
	}
	
	public final void mECIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mECIRC_LC");
		_ttype = ECIRC_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ecirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mECIRC_LC");
		}
	}
	
	public final void mEUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEUML_LC");
		_ttype = EUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&euml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEUML_LC");
		}
	}
	
	public final void mIGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIGRAVE_LC");
		_ttype = IGRAVE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&igrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIGRAVE_LC");
		}
	}
	
	public final void mIACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIACUTE_LC");
		_ttype = IACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&iacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIACUTE_LC");
		}
	}
	
	public final void mICIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mICIRC_LC");
		_ttype = ICIRC_LC;
		int _saveIndex;
		try { // debugging
			
			match("&icirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mICIRC_LC");
		}
	}
	
	public final void mIUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIUML_LC");
		_ttype = IUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&iuml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIUML_LC");
		}
	}
	
	public final void mETH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mETH_LC");
		_ttype = ETH_LC;
		int _saveIndex;
		try { // debugging
			
			match("&eth;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mETH_LC");
		}
	}
	
	public final void mNTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNTILDE_LC");
		_ttype = NTILDE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ntilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNTILDE_LC");
		}
	}
	
	public final void mOGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOGRAVE_LC");
		_ttype = OGRAVE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ograve;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOGRAVE_LC");
		}
	}
	
	public final void mOACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOACUTE_LC");
		_ttype = OACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&oacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOACUTE_LC");
		}
	}
	
	public final void mOCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOCIRC_LC");
		_ttype = OCIRC_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ocirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOCIRC_LC");
		}
	}
	
	public final void mOTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOTILDE_LC");
		_ttype = OTILDE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&otilde;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOTILDE_LC");
		}
	}
	
	public final void mOUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOUML_LC");
		_ttype = OUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ouml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOUML_LC");
		}
	}
	
	public final void mDIVIDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDIVIDE");
		_ttype = DIVIDE;
		int _saveIndex;
		try { // debugging
			
			match("&divide;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDIVIDE");
		}
	}
	
	public final void mOSLASH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOSLASH_LC");
		_ttype = OSLASH_LC;
		int _saveIndex;
		try { // debugging
			
			match("&oslash;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOSLASH_LC");
		}
	}
	
	public final void mUGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUGRAVE_LC");
		_ttype = UGRAVE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ugrave;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUGRAVE_LC");
		}
	}
	
	public final void mUACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUACUTE_LC");
		_ttype = UACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&uacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUACUTE_LC");
		}
	}
	
	public final void mUCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUCIRC_LC");
		_ttype = UCIRC_LC;
		int _saveIndex;
		try { // debugging
			
			match("&ucirc;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUCIRC_LC");
		}
	}
	
	public final void mUUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUUML_LC");
		_ttype = UUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&uuml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUUML_LC");
		}
	}
	
	public final void mYACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mYACUTE_LC");
		_ttype = YACUTE_LC;
		int _saveIndex;
		try { // debugging
			
			match("&yacute;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mYACUTE_LC");
		}
	}
	
	public final void mTHORN_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHORN_LC");
		_ttype = THORN_LC;
		int _saveIndex;
		try { // debugging
			
			match("&thorn;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHORN_LC");
		}
	}
	
	public final void mYUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mYUML_LC");
		_ttype = YUML_LC;
		int _saveIndex;
		try { // debugging
			
			match("&yuml;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mYUML_LC");
		}
	}
	
	public final void mALPHA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mALPHA");
		_ttype = ALPHA;
		int _saveIndex;
		try { // debugging
			
			match("&Alpha;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mALPHA");
		}
	}
	
	public final void mBETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mBETA");
		_ttype = BETA;
		int _saveIndex;
		try { // debugging
			
			match("&Beta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mBETA");
		}
	}
	
	public final void mGAMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mGAMMA");
		_ttype = GAMMA;
		int _saveIndex;
		try { // debugging
			
			match("&Gamma;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mGAMMA");
		}
	}
	
	public final void mDELTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDELTA");
		_ttype = DELTA;
		int _saveIndex;
		try { // debugging
			
			match("&Delta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDELTA");
		}
	}
	
	public final void mEPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEPSILON");
		_ttype = EPSILON;
		int _saveIndex;
		try { // debugging
			
			match("&Epsilon;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEPSILON");
		}
	}
	
	public final void mZETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mZETA");
		_ttype = ZETA;
		int _saveIndex;
		try { // debugging
			
			match("&Zeta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mZETA");
		}
	}
	
	public final void mETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mETA");
		_ttype = ETA;
		int _saveIndex;
		try { // debugging
			
			match("&Eta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mETA");
		}
	}
	
	public final void mTHETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHETA");
		_ttype = THETA;
		int _saveIndex;
		try { // debugging
			
			match("&Theta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHETA");
		}
	}
	
	public final void mIOTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIOTA");
		_ttype = IOTA;
		int _saveIndex;
		try { // debugging
			
			match("&Iota;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIOTA");
		}
	}
	
	public final void mKAPPA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mKAPPA");
		_ttype = KAPPA;
		int _saveIndex;
		try { // debugging
			
			match("&Kappa;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mKAPPA");
		}
	}
	
	public final void mLAMBDA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLAMBDA");
		_ttype = LAMBDA;
		int _saveIndex;
		try { // debugging
			
			match("&Lambda;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLAMBDA");
		}
	}
	
	public final void mMU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMU");
		_ttype = MU;
		int _saveIndex;
		try { // debugging
			
			match("&Mu;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMU");
		}
	}
	
	public final void mNU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNU");
		_ttype = NU;
		int _saveIndex;
		try { // debugging
			
			match("&Nu;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNU");
		}
	}
	
	public final void mXI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mXI");
		_ttype = XI;
		int _saveIndex;
		try { // debugging
			
			match("&Xi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mXI");
		}
	}
	
	public final void mOMICRON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOMICRON");
		_ttype = OMICRON;
		int _saveIndex;
		try { // debugging
			
			match("&Omicron;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOMICRON");
		}
	}
	
	public final void mPI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPI");
		_ttype = PI;
		int _saveIndex;
		try { // debugging
			
			match("&Pi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPI");
		}
	}
	
	public final void mRHO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRHO");
		_ttype = RHO;
		int _saveIndex;
		try { // debugging
			
			match("&Rho;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRHO");
		}
	}
	
	public final void mSIGMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSIGMA");
		_ttype = SIGMA;
		int _saveIndex;
		try { // debugging
			
			match("&Sigma;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSIGMA");
		}
	}
	
	public final void mTAU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTAU");
		_ttype = TAU;
		int _saveIndex;
		try { // debugging
			
			match("&Tau;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTAU");
		}
	}
	
	public final void mUPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUPSILON");
		_ttype = UPSILON;
		int _saveIndex;
		try { // debugging
			
			match("&Upsilon;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUPSILON");
		}
	}
	
	public final void mPHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPHI");
		_ttype = PHI;
		int _saveIndex;
		try { // debugging
			
			match("&Phi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPHI");
		}
	}
	
	public final void mCHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCHI");
		_ttype = CHI;
		int _saveIndex;
		try { // debugging
			
			match("&Chi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCHI");
		}
	}
	
	public final void mPSI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPSI");
		_ttype = PSI;
		int _saveIndex;
		try { // debugging
			
			match("&Psi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPSI");
		}
	}
	
	public final void mOMEGA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOMEGA");
		_ttype = OMEGA;
		int _saveIndex;
		try { // debugging
			
			match("&Omega;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOMEGA");
		}
	}
	
	public final void mALPHA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mALPHA_LC");
		_ttype = ALPHA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&alpha;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mALPHA_LC");
		}
	}
	
	public final void mBETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mBETA_LC");
		_ttype = BETA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&beta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mBETA_LC");
		}
	}
	
	public final void mGAMMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mGAMMA_LC");
		_ttype = GAMMA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&gamma;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mGAMMA_LC");
		}
	}
	
	public final void mDELTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDELTA_LC");
		_ttype = DELTA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&delta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDELTA_LC");
		}
	}
	
	public final void mEPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEPSILON_LC");
		_ttype = EPSILON_LC;
		int _saveIndex;
		try { // debugging
			
			match("&epsilon;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEPSILON_LC");
		}
	}
	
	public final void mZETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mZETA_LC");
		_ttype = ZETA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&zeta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mZETA_LC");
		}
	}
	
	public final void mETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mETA_LC");
		_ttype = ETA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&eta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mETA_LC");
		}
	}
	
	public final void mTHETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHETA_LC");
		_ttype = THETA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&theta;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHETA_LC");
		}
	}
	
	public final void mIOTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIOTA_LC");
		_ttype = IOTA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&iota;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIOTA_LC");
		}
	}
	
	public final void mKAPPA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mKAPPA_LC");
		_ttype = KAPPA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&kappa;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mKAPPA_LC");
		}
	}
	
	public final void mLAMBDA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLAMBDA_LC");
		_ttype = LAMBDA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&lambda;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLAMBDA_LC");
		}
	}
	
	public final void mMU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMU_LC");
		_ttype = MU_LC;
		int _saveIndex;
		try { // debugging
			
			match("&mu;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMU_LC");
		}
	}
	
	public final void mNU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNU_LC");
		_ttype = NU_LC;
		int _saveIndex;
		try { // debugging
			
			match("&nu;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNU_LC");
		}
	}
	
	public final void mXI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mXI_LC");
		_ttype = XI_LC;
		int _saveIndex;
		try { // debugging
			
			match("&xi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mXI_LC");
		}
	}
	
	public final void mOMICRON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOMICRON_LC");
		_ttype = OMICRON_LC;
		int _saveIndex;
		try { // debugging
			
			match("&omicron;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOMICRON_LC");
		}
	}
	
	public final void mPI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPI_LC");
		_ttype = PI_LC;
		int _saveIndex;
		try { // debugging
			
			match("&pi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPI_LC");
		}
	}
	
	public final void mRHO_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRHO_LC");
		_ttype = RHO_LC;
		int _saveIndex;
		try { // debugging
			
			match("&rho;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRHO_LC");
		}
	}
	
	public final void mSIGMAF_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSIGMAF_LC");
		_ttype = SIGMAF_LC;
		int _saveIndex;
		try { // debugging
			
			match("&sigmaf;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSIGMAF_LC");
		}
	}
	
	public final void mSIGMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSIGMA_LC");
		_ttype = SIGMA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&sigma;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSIGMA_LC");
		}
	}
	
	public final void mTAU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTAU_LC");
		_ttype = TAU_LC;
		int _saveIndex;
		try { // debugging
			
			match("&tau;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTAU_LC");
		}
	}
	
	public final void mUPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUPSILON_LC");
		_ttype = UPSILON_LC;
		int _saveIndex;
		try { // debugging
			
			match("&upsilon;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUPSILON_LC");
		}
	}
	
	public final void mPHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPHI_LC");
		_ttype = PHI_LC;
		int _saveIndex;
		try { // debugging
			
			match("&phi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPHI_LC");
		}
	}
	
	public final void mCHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCHI_LC");
		_ttype = CHI_LC;
		int _saveIndex;
		try { // debugging
			
			match("&chi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCHI_LC");
		}
	}
	
	public final void mPSI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPSI_LC");
		_ttype = PSI_LC;
		int _saveIndex;
		try { // debugging
			
			match("&psi;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPSI_LC");
		}
	}
	
	public final void mOMEGA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOMEGA_LC");
		_ttype = OMEGA_LC;
		int _saveIndex;
		try { // debugging
			
			match("&omega;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOMEGA_LC");
		}
	}
	
	public final void mTHETASYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHETASYM");
		_ttype = THETASYM;
		int _saveIndex;
		try { // debugging
			
			match("&thetasym;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHETASYM");
		}
	}
	
	public final void mUPSIH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUPSIH");
		_ttype = UPSIH;
		int _saveIndex;
		try { // debugging
			
			match("&upsih;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUPSIH");
		}
	}
	
	public final void mPIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPIV");
		_ttype = PIV;
		int _saveIndex;
		try { // debugging
			
			match("&piv;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPIV");
		}
	}
	
	public final void mBULL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mBULL");
		_ttype = BULL;
		int _saveIndex;
		try { // debugging
			
			match("&bull;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mBULL");
		}
	}
	
	public final void mHELLIP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mHELLIP");
		_ttype = HELLIP;
		int _saveIndex;
		try { // debugging
			
			match("&hellip;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mHELLIP");
		}
	}
	
	public final void mPRIME_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPRIME_LC");
		_ttype = PRIME_LC;
		int _saveIndex;
		try { // debugging
			
			match("&prime;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPRIME_LC");
		}
	}
	
	public final void mPRIME(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPRIME");
		_ttype = PRIME;
		int _saveIndex;
		try { // debugging
			
			match("&Prime;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPRIME");
		}
	}
	
	public final void mOLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOLINE");
		_ttype = OLINE;
		int _saveIndex;
		try { // debugging
			
			match("&oline;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOLINE");
		}
	}
	
	public final void mFRASL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mFRASL");
		_ttype = FRASL;
		int _saveIndex;
		try { // debugging
			
			match("&frasl;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mFRASL");
		}
	}
	
	public final void mWEIERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mWEIERP");
		_ttype = WEIERP;
		int _saveIndex;
		try { // debugging
			
			match("&weierp;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mWEIERP");
		}
	}
	
	public final void mIMAGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mIMAGE");
		_ttype = IMAGE;
		int _saveIndex;
		try { // debugging
			
			match("&image;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mIMAGE");
		}
	}
	
	public final void mREAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mREAL");
		_ttype = REAL;
		int _saveIndex;
		try { // debugging
			
			match("&real;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mREAL");
		}
	}
	
	public final void mTRADE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTRADE");
		_ttype = TRADE;
		int _saveIndex;
		try { // debugging
			
			match("&trade;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTRADE");
		}
	}
	
	public final void mALEFSYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mALEFSYM");
		_ttype = ALEFSYM;
		int _saveIndex;
		try { // debugging
			
			match("&alefsym;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mALEFSYM");
		}
	}
	
	public final void mLARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLARR");
		_ttype = LARR;
		int _saveIndex;
		try { // debugging
			
			match("&larr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLARR");
		}
	}
	
	public final void mUARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUARR");
		_ttype = UARR;
		int _saveIndex;
		try { // debugging
			
			match("&uarr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUARR");
		}
	}
	
	public final void mRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRARR");
		_ttype = RARR;
		int _saveIndex;
		try { // debugging
			
			match("&rarr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRARR");
		}
	}
	
	public final void mDARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDARR");
		_ttype = DARR;
		int _saveIndex;
		try { // debugging
			
			match("&darr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDARR");
		}
	}
	
	public final void mHARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mHARR");
		_ttype = HARR;
		int _saveIndex;
		try { // debugging
			
			match("&harr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mHARR");
		}
	}
	
	public final void mCRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCRARR");
		_ttype = CRARR;
		int _saveIndex;
		try { // debugging
			
			match("&crarr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCRARR");
		}
	}
	
	public final void mLARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLARR_D");
		_ttype = LARR_D;
		int _saveIndex;
		try { // debugging
			
			match("&lArr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLARR_D");
		}
	}
	
	public final void mUARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mUARR_D");
		_ttype = UARR_D;
		int _saveIndex;
		try { // debugging
			
			match("&uArr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mUARR_D");
		}
	}
	
	public final void mRARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRARR_D");
		_ttype = RARR_D;
		int _saveIndex;
		try { // debugging
			
			match("&rArr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRARR_D");
		}
	}
	
	public final void mDARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDARR_D");
		_ttype = DARR_D;
		int _saveIndex;
		try { // debugging
			
			match("&dArr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDARR_D");
		}
	}
	
	public final void mHARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mHARR_D");
		_ttype = HARR_D;
		int _saveIndex;
		try { // debugging
			
			match("&hArr;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mHARR_D");
		}
	}
	
	public final void mFORALL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mFORALL");
		_ttype = FORALL;
		int _saveIndex;
		try { // debugging
			
			match("&forall;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mFORALL");
		}
	}
	
	public final void mPART(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPART");
		_ttype = PART;
		int _saveIndex;
		try { // debugging
			
			match("&part;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPART");
		}
	}
	
	public final void mEXIST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEXIST");
		_ttype = EXIST;
		int _saveIndex;
		try { // debugging
			
			match("&exist;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEXIST");
		}
	}
	
	public final void mEMPTY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEMPTY");
		_ttype = EMPTY;
		int _saveIndex;
		try { // debugging
			
			match("&empty;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEMPTY");
		}
	}
	
	public final void mNABLA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNABLA");
		_ttype = NABLA;
		int _saveIndex;
		try { // debugging
			
			match("&nabla;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNABLA");
		}
	}
	
	public final void mISIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mISIN");
		_ttype = ISIN;
		int _saveIndex;
		try { // debugging
			
			match("&isin;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mISIN");
		}
	}
	
	public final void mNOTIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNOTIN");
		_ttype = NOTIN;
		int _saveIndex;
		try { // debugging
			
			match("&notin;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNOTIN");
		}
	}
	
	public final void mNI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNI");
		_ttype = NI;
		int _saveIndex;
		try { // debugging
			
			match("&ni;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNI");
		}
	}
	
	public final void mPROD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPROD");
		_ttype = PROD;
		int _saveIndex;
		try { // debugging
			
			match("&prod;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPROD");
		}
	}
	
	public final void mSUM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUM");
		_ttype = SUM;
		int _saveIndex;
		try { // debugging
			
			match("&sum;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUM");
		}
	}
	
	public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mMINUS");
		_ttype = MINUS;
		int _saveIndex;
		try { // debugging
			
			match("&minus;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mMINUS");
		}
	}
	
	public final void mLOWAST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLOWAST");
		_ttype = LOWAST;
		int _saveIndex;
		try { // debugging
			
			match("&lowast;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLOWAST");
		}
	}
	
	public final void mRADIC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRADIC");
		_ttype = RADIC;
		int _saveIndex;
		try { // debugging
			
			match("&radic;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRADIC");
		}
	}
	
	public final void mPROP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPROP");
		_ttype = PROP;
		int _saveIndex;
		try { // debugging
			
			match("&prop;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPROP");
		}
	}
	
	public final void mINFIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mINFIN");
		_ttype = INFIN;
		int _saveIndex;
		try { // debugging
			
			match("&infin;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mINFIN");
		}
	}
	
	public final void mANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mANG");
		_ttype = ANG;
		int _saveIndex;
		try { // debugging
			
			match("&ang;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mANG");
		}
	}
	
	public final void mAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mAND");
		_ttype = AND;
		int _saveIndex;
		try { // debugging
			
			match("&and;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mAND");
		}
	}
	
	public final void mOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOR");
		_ttype = OR;
		int _saveIndex;
		try { // debugging
			
			match("&or;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOR");
		}
	}
	
	public final void mCAP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCAP");
		_ttype = CAP;
		int _saveIndex;
		try { // debugging
			
			match("&cap;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCAP");
		}
	}
	
	public final void mCUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCUP");
		_ttype = CUP;
		int _saveIndex;
		try { // debugging
			
			match("&cup;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCUP");
		}
	}
	
	public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mINT");
		_ttype = INT;
		int _saveIndex;
		try { // debugging
			
			match("&int;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mINT");
		}
	}
	
	public final void mTHERE4(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mTHERE4");
		_ttype = THERE4;
		int _saveIndex;
		try { // debugging
			
			match("&there4;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mTHERE4");
		}
	}
	
	public final void mSIM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSIM");
		_ttype = SIM;
		int _saveIndex;
		try { // debugging
			
			match("&sim;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSIM");
		}
	}
	
	public final void mCONG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCONG");
		_ttype = CONG;
		int _saveIndex;
		try { // debugging
			
			match("&cong;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCONG");
		}
	}
	
	public final void mASYMP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mASYMP");
		_ttype = ASYMP;
		int _saveIndex;
		try { // debugging
			
			match("&asymp;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mASYMP");
		}
	}
	
	public final void mNE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNE");
		_ttype = NE;
		int _saveIndex;
		try { // debugging
			
			match("&ne;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNE");
		}
	}
	
	public final void mEQUIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mEQUIV");
		_ttype = EQUIV;
		int _saveIndex;
		try { // debugging
			
			match("&equiv;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mEQUIV");
		}
	}
	
	public final void mLE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLE");
		_ttype = LE;
		int _saveIndex;
		try { // debugging
			
			match("&le;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLE");
		}
	}
	
	public final void mGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mGE");
		_ttype = GE;
		int _saveIndex;
		try { // debugging
			
			match("&ge;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mGE");
		}
	}
	
	public final void mSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUB");
		_ttype = SUB;
		int _saveIndex;
		try { // debugging
			
			match("&sub;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUB");
		}
	}
	
	public final void mSUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUP");
		_ttype = SUP;
		int _saveIndex;
		try { // debugging
			
			match("&sup;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUP");
		}
	}
	
	public final void mNSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mNSUB");
		_ttype = NSUB;
		int _saveIndex;
		try { // debugging
			
			match("&nsub;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mNSUB");
		}
	}
	
	public final void mSUBE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUBE");
		_ttype = SUBE;
		int _saveIndex;
		try { // debugging
			
			match("&sube;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUBE");
		}
	}
	
	public final void mSUPE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSUPE");
		_ttype = SUPE;
		int _saveIndex;
		try { // debugging
			
			match("&supe;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSUPE");
		}
	}
	
	public final void mOPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOPLUS");
		_ttype = OPLUS;
		int _saveIndex;
		try { // debugging
			
			match("&oplus;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOPLUS");
		}
	}
	
	public final void mOTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mOTIMES");
		_ttype = OTIMES;
		int _saveIndex;
		try { // debugging
			
			match("&otimes;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mOTIMES");
		}
	}
	
	public final void mPERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mPERP");
		_ttype = PERP;
		int _saveIndex;
		try { // debugging
			
			match("&perp;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mPERP");
		}
	}
	
	public final void mSDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSDOT");
		_ttype = SDOT;
		int _saveIndex;
		try { // debugging
			
			match("&sdot;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSDOT");
		}
	}
	
	public final void mLCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLCEIL");
		_ttype = LCEIL;
		int _saveIndex;
		try { // debugging
			
			match("&lceil;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLCEIL");
		}
	}
	
	public final void mRCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRCEIL");
		_ttype = RCEIL;
		int _saveIndex;
		try { // debugging
			
			match("&rceil;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRCEIL");
		}
	}
	
	public final void mLFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLFLOOR");
		_ttype = LFLOOR;
		int _saveIndex;
		try { // debugging
			
			match("&lfloor;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLFLOOR");
		}
	}
	
	public final void mRFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRFLOOR");
		_ttype = RFLOOR;
		int _saveIndex;
		try { // debugging
			
			match("&rfloor;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRFLOOR");
		}
	}
	
	public final void mLANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLANG");
		_ttype = LANG;
		int _saveIndex;
		try { // debugging
			
			match("&lang;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLANG");
		}
	}
	
	public final void mRANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mRANG");
		_ttype = RANG;
		int _saveIndex;
		try { // debugging
			
			match("&rang;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mRANG");
		}
	}
	
	public final void mLOZ(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mLOZ");
		_ttype = LOZ;
		int _saveIndex;
		try { // debugging
			
			match("&loz;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mLOZ");
		}
	}
	
	public final void mSPADES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mSPADES");
		_ttype = SPADES;
		int _saveIndex;
		try { // debugging
			
			match("&spades;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mSPADES");
		}
	}
	
	public final void mCLUBS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mCLUBS");
		_ttype = CLUBS;
		int _saveIndex;
		try { // debugging
			
			match("&clubs;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mCLUBS");
		}
	}
	
	public final void mHEARTS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mHEARTS");
		_ttype = HEARTS;
		int _saveIndex;
		try { // debugging
			
			match("&hearts;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mHEARTS");
		}
	}
	
	public final void mDIAMS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mDIAMS");
		_ttype = DIAMS;
		int _saveIndex;
		try { // debugging
			
			match("&diams;");
			if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
				_token = makeToken(_ttype);
				_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
			}
			_returnToken = _token;
		} finally { // debugging
			traceOut("mDIAMS");
		}
	}
	
	public final void mANY_CHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		traceIn("mANY_CHAR");
		_ttype = ANY_CHAR;
		int _saveIndex;
		try { // debugging
			
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
		} finally { // debugging
			traceOut("mANY_CHAR");
		}
	}
	
	
	
	}
