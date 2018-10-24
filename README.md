# logging

## exception java.lang.ArrayIndexOutOfBoundsException: -1
push the resolve button at `test.log/fail.bndrun`

push the resolve button at `test.log/works.bndrun`

the only diff is that there is one mor required bundle


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
