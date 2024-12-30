# for running command line
- ensure maven and java is installed
- to build enter:
mvn package
- to run app enter:
java -jar target/myapp.jar
- test the code and endpoints

# SPRING BOOT PROPERTY CATEGORIES
- core
	> logging levels based on package names
	> log file name and file path
- web
	> server port and properties
	> http session timeout
- security
	> user name and password
- data
	> jdbc datasource url
- actuator
	> include or explude endpoints
	> set up base path
- integration
- devtools
- testing

# INVERSION OF CONTROL (IOC)
def: the approach of outsourcing the construction and management of objects
the spring container is an object factory for:
	> primary functions 
		- create and manage objects (inversion of control)
		- inject object dependencies (dependency injection)
configuring spring container:
	1) legacy - XML configuration file
	2) modern - Java annotations
	3) modern - Java source code


