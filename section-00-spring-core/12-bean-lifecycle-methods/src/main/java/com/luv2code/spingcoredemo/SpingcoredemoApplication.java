package com.luv2code.spingcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * ENABLES:
 * 1. auto configuration [@EnableAutoConfiguration]
 * 2. component scanning [@ComponentScan]
 * 3. additional configuration [@Configuration]
 */
@SpringBootApplication
/*
 * The @SpringBootApplication annotation is a convenience annotation that combines:
 * 1. @Configuration: Indicates that the class can be used by the Spring IoC container as a source of bean definitions.
 * 2. @EnableAutoConfiguration: Enables Spring Boot's auto-configuration feature.
 * 3. @ComponentScan: Enables component scanning, allowing Spring to find and register beans in the specified package and its sub-packages.
 * 
 * To scan other packages not in the same package as the main class, must explicitly list them
 */
public class SpingcoredemoApplication {

	/*
	 * The main method is the entry point of the Spring Boot application.
	 * It uses SpringApplication.run() to launch the application.
	 * 
	 * BEHIND THE SCENES:
	 * 1. Creates application context and registers the beans
	 * 2. Starts the embedded server (etc. Tomcat, Jetty, Undertow)
	 * 3. component scans packages and sub-packages recursively, 
	 * 		ONLY packages of main class
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpingcoredemoApplication.class, args);
	}

}
