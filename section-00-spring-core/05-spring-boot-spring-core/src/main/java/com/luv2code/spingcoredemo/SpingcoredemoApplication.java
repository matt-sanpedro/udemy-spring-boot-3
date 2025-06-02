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
