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

# DEPENDENCY INJECTION
def: a principle, client delegates to another object the responsibility of providing its dependencies

# Java Injection Types
- constructor injection
	> required dependencies
	> recommended by spring.io dev team
- setter injection
	> optional dependencies
	> if dependency not provided, app can provide reasonable default logic

# Spring AutoWiring
- used for dependency injection
	> Spring queries for class that matches by type: class or interface
	> automatically injects it, hence autowired - ex. Spring scans for @Components if "Coach" interface exists

# Constructor Injection 
bean: an instance of a class managed by the Spring container
- Development Process
	1) define dependency interface and class (annotate @Component)
		- marks the class as a Spring Bean
		- makes bean available for dependency injection
	2) create demo REST controller
	3) create constructor in your class for injections
		- @Autowired annotation tells Spring to inject a dependency
		- if you have only one constructor the @Autowired on constructor is optional
	4) add @GetMapping for /dailyworkout
