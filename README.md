spring-camel
============

This is a simple example of how to integrate and use:

1. Spring
1. Camel
1. Camel routes
1. Spring Remoting
1. SLF4J


## Spring/Camel wirings Step By step:

1. [src/main/resources/spring/camelWiring.xml](src/main/resources/spring/camelWiring.xml) defines a simple route that the messages will traverse
1. [src/main/resources/spring/cientProxyWiring.xml](src/main/resources/spring/cientProxyWiring.xml) defines the client proxy side that creates a proxy of type RemoteService using spring remoting
1. [src/main/resources/spring/serviceExportWiring.xml](src/main/resources/spring/serviceExportWiring.xml) defines the export of the service that will execute the messages which the client proxy sends
1. [src/main/resources/spring/common.xml](src/main/resources/spring/common.xml) basic spring wiring definitions


## Execution
1. The main block of ```Launcher.java``` is executed 
1. It creates a context and loads up all the wirings
1. The run method of the Launcher is executed
1. It invokes a method on the spring remoted bean
1. The execution of the method causes a messages to be sent on ```direct://message-out```
1. The established route, sends the message to ```direct://message-in```
1. A service is listening on that route which responds back with a specificed result
1. Results come back to the client invocation via the route
1. Client echoes the output




