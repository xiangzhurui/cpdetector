/*
 * File   : $Source$
 * Date   : $Date$
 * Version: $Revision$
 *
 * This file is part of cpdetector -
 * the Open Source code page detection library.
 *
 * Copyright (c) 2008 - 2010 Achim Westermann
 */

History of changes for the cpdetector project.

Changes are chronologically ordered from top (most recent) 
to bottom (least recent).

Legend:
! New Feature
* Bug fixed
- General comment
o API change that requires refactoring.


cpdetector - 1.1.0 - <month>, <day>, <year>

! Added the possibility that each single detector may exclude charsets from being candidates. 
  This works by returning the charsets to exclude from method ICodepageDetector.getExcludedCharsets(). 
  Every detector may use the exclusions (of previous detectors that were invoked) by taking them via 
  ICodepageDetector.setCharsetCandidates(Set<Charset> candidates). From the proxy implementation this 
  works as well: 
  myCodepageDetectorProxy.setCharsetCandidates(myReducedSet). 
  This may help with files that have problems to be detected properly. 
* Fixed issue #15: Wrong detection result (UnknownCharset) in heavily multithreaded environment possible. All singleton 
  retrieval methods synchronized now. 

  
cpdetector - 1.0.10 - December, 4th, 2011

* Fixed bug #3440658: Crash at invalid declared charset (the "" charset). 
* Fixed return code of command line tool (CodepageProcessor) always being 0 even if there was an error. 
* Fixed bug #1997607: ParsingDetector.detectCodepage does not  use limit parameter. 
! Added end to end test cases for command line tool. 
o Now Java 1.5 at least is required. 

cpdetector - 1.0.9 - November, 16th, 2011

* Fixed bug #3426791: -m switch to skip moving documents with undetectable codepage was not working. 
* Fixed bug #3426791 (that was two bugs): Do not try to transcode documents with undetected codepage. 

cpdetector- 1.0.8 - June, 26th, 2010

! Feature request #1997513:  add the version number to the 3rd party jars. 
! A bit more documentation (in binary-release.txt).
* Fixed bug #2833073: Some cpDetector methods do not work with OpenJDK, contributed by Tarjei Huse.
* Fixed bug #2976347: The implementation of the ByteOrderMarkDetector was wrong.
- Moved htmlentitydecoder and latexencoder to separate project (JuniCoder, see at sourceforge).
o Renamed package info.monitorenter.cpdetector.util to info.monitorenter.util.
o This version requires java 1.5. For older java versions please use the preceding release. 

cpdetector- 1.0.7 - June, 17th, 2008

! Upgraded proguard shrinker from version 3.8 to 4.2.
* Changed release structure: cpdetetor.jar does not contain 3rd party library files any more.  
* Fixed issue #1995828: Missing public functions. 

cpdetector- 1.0.6 - June, 14th, 2008

! Started to use proguard shrinker: cpdetector jar is now more than ten times smaller. 
* Fixed issue #1989692:  Do not use System.out for logging in JChardetFacade. 
o Renamed all packages with prefix: info.monitorenter.

cpdetector- 1.0.5 - 04, 21, 2007

* Fixed issue with infinite loop for exhausted input stream in jchardet facade.
! Begin with checkstyle conventions. 
! Started history.txt for changelog. 
! Added Testcase for core API. 
* Fixed part of issue  #1570118: CodePageDetectorProxy.detectCodePage(java.net.URL) 
  does not close opened input stream which disallows deletion of file after detection. 
* Fixed issue in cpdetector.util.FileUtil.readRam(java.io.File): 
  Openend input stream was not closed. 
  
Version 1.04: Minor Bugfix

- Sync with new source release...

Version 1.03: 

- First start with FIT testing (ANTFIT). 
1.04:
- Bugfix for "missing fit task".
- Restructuring the archive: top-level folder is now project root. 

1.03: 
- Removal of java 1.5 sourcecode for consistency. 
- Rebuild of jchardet for jdk1.4.2. 
- Start of ANT - integrated FIT testing: see http://fit.c2.com/ 

FIT Howto: 
This testing framework produces human readable beautiful 
output and does not require programming skills. Just a html page  
has to be written. The first class that processes the data is 
provided in cpdetector. Even the programming of the test 
classes causes minimal effort. 

Please look at: cpdetector/test/fit/detectURL.html. In that file 
there is only one table row that runs a test. You could help by 
adding other rows that reference the files from the 
testdocuments that are available in the release
- Step back to jdk 1.4.2 (Test sources were 1.5). 
- Choosable guessing of charsets: If jchardet fails to narrow 
  down the set of possible charsets to one, it may (if chosen) 
  return a potential one. 
  See cpdetector.io.JChardetFacade.setGuessing(boolean). 


Version 1.02: 

Bugfix (unreported): 
Version 1.01 introduced a major bug that disabled html charset parsing. This has been verified to result from the behaviour of the parser generator and fixed. 

Bugfix (unreported): 
CodpageDetectorProxy iterated over the  ICodepageDetector implementations in an arbitrary order thus ignoring the precedence. 

Feature:
Support for XML external parsed entities (e.g.: dtd's) with optional version info. 

Feature:
Build automation. 

Feature: 
Start of quality assurance with integrations of junit in ANT.



Version 1.01: 

- ANTLR parsing now detects XML encoding 
(http://www.w3.org/TR/2004/REC-xml-20040204/#NT-EncodingDecl)
  This offers a performance speedup when handling 
  mainly xml, as the fallback guessing algorithm may 
  be skipped. 

- New interface method for InputStreams allows working with
  any data (even byte arrays or Strings). 

- Deprecated HTMLCharsetDetector due to a misleading name: 
  ANTLR parsing looks for xml encodin as well as html charset 
  and will possibly include more in future.  The new 
  implementation is called ParsingDetector. 
