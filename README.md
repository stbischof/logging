# logging

## exception java.lang.ArrayIndexOutOfBoundsException: -1
push the resolve button at `test.log/fail.bndrun`

push the resolve button at `test.log/works.bndrun`

the only diff is that there is one mor required bundle


Command: 
```
java -jar biz.aQute.bnd-4.1.0.jar clean
java -jar biz.aQute.bnd-4.1.0.jar _par
java -jar biz.aQute.bnd-4.2.0-20181213.001933-23.jar resolve resolve **/fail.bndrun
#java -jar biz.aQute.bnd-4.1.0.jar resolve resolve **/fail.bndrun
```

Sacktrace**

```
 java.lang.ArrayIndexOutOfBoundsException: -1

000: Exception: java.lang.ArrayIndexOutOfBoundsException: -1
	at java.util.ArrayList.elementData(ArrayList.java:422)
	at java.util.ArrayList.set(ArrayList.java:450)
	at org.apache.felix.resolver.util.ShadowList.replace(ShadowList.java:74)
	at org.apache.felix.resolver.Candidates.prepare(Candidates.java:939)
	at org.apache.felix.resolver.ResolverImpl.getInitialCandidates(ResolverImpl.java:547)
	at org.apache.felix.resolver.ResolverImpl.doResolve(ResolverImpl.java:432)
	at org.apache.felix.resolver.ResolverImpl.resolve(ResolverImpl.java:421)
	at org.apache.felix.resolver.ResolverImpl.resolve(ResolverImpl.java:375)
	at biz.aQute.resolve.BndResolver.resolve(BndResolver.java:32)
	at biz.aQute.resolve.ResolveProcess.resolveRequired(ResolveProcess.java:81)
	at biz.aQute.resolve.ProjectResolver.resolve(ProjectResolver.java:105)
	at biz.aQute.resolve.Bndrun.resolve(Bndrun.java:95)
	at aQute.bnd.main.ResolveCommand._resolve(ResolveCommand.java:275)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at aQute.lib.getopt.CommandLine.execute(CommandLine.java:150)
	at aQute.lib.getopt.CommandLine.subCmd(CommandLine.java:624)
	at aQute.bnd.main.bnd._resolve(bnd.java:4237)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at aQute.lib.getopt.CommandLine.execute(CommandLine.java:150)
	at aQute.bnd.main.bnd._bnd(bnd.java:444)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at aQute.lib.getopt.CommandLine.execute(CommandLine.java:150)
	at aQute.bnd.main.bnd.start(bnd.java:292)
	at aQute.bnd.main.bnd.main(bnd.java:269)
```


## project details
i tried so centralize all logging instructions 

cnf/ext/logging.bnd
```
-runproperties.logging: logback.configurationFile=file:${cnf}/logback.xml

-runrequires.logging: \
	bnd.identity;id='org.apache.felix.log.extension'

-runpath.logging: \
	ch.qos.logback.classic;version='[1.2.3,1.2.4)',\
	ch.qos.logback.core;version='[1.2.3,1.2.4)',\
	slf4j.api;version='[1.7.25,1.7.26)',\
	org.apache.felix.log;version='[1.2.0,1.2.1)',\
	org.apache.felix.logback;version='[1.0.0,1.0.1)'
  
  ```
