# cpdetector

Import sourcecode from https://sourceforge.net/projects/cpdetector/

cpDetector is a proxy for codepage detection of documents. It delegates to multiple instances that try to detect the codepage by different techinques. A command line executeable is shipped that allows to sort documents by codepage.


project version 2.0.0-SNAPSHOT sources is based 1.1.0  V-1_1_0-IVY-JDK-1_8:

1. use maven build instead ant ivy and eclipse  build classpath


```xml
<dependency>
 <groupId>info.monitorenter</groupId>
  <artifactId>cpdetector</artifactId>
  <version>2.0.0-SNAPSHOT</version>
</dependency>
```

```
mvn clena install -Dmaven.test.skip=true
```
