header{
package cpdetector.io.parser;
}
options{
//		language="java";	 
}



class HTMLCharsetParser extends Parser;
options{
		k=2;
		/*
		If omitted, a RecognitionException of rule section will 
		be caught, reported (System.err) and advanced to the next 
		section... . If something is wrong, it makes no sense still 
		trying to parse (my opinion).
		*/
		
		defaultErrorHandler=false; 
		
}

htmlDocument returns[String charset] 
	:
		(token:META_CONTENT_TYPE)  {charset=token.getText();}
		| {charset=null;}
	;


class HTMLCharsetLexer extends Lexer;
options{
	codeGenDebug=false; 
	k=2;
	charVocabulary='\u0000'..'\uFFFE';
	genHashLines=true;
	caseSensitive= false;
	filter = true;
}

// Clever: SPACINT is newline or whitespaces and ignored here.
META_CONTENT_TYPE options{ignore=SPACING;} 
	:
	"meta"! 
	"http-equiv"! 
	'='! 
	('\"'!)? 
	"content-type"! 
	('\"'!)? 
	
	"content"! 
	'='! 
	('\"'!)? 
	(LETTER!|DIGIT!|'/'!)* 
	';'! 
	
	"charset"! 
	'='! 
	(LETTER|DIGIT|'-'|'_')* 
	('\"'!)? 
	;
	

protected 	
SPACING
	: 
	NEWLINE
	| SPACE
	;
// UNIX and Windows
protected
NEWLINE
	: '\n' { newline(); }
	| '\r' '\n' { newline(); }
	; 

protected
SPACE: 
	' '
	;

protected
DIGIT
	: '0'..'9'
	;
	
protected 
LETTER 
	: 'a'..'z'
	;

