package com.luv2code.spingcoredemo.common;

import org.springframework.stereotype.Component;

/*
 * define the class that implements the Coach interface
 * the @Component annotation marks the class as a Spring Bean
 */
@Component
public class CricketCoach implements Coach {

    /*
     * the @Override annotation indicates that this method overrides a method in the interface
     * "Overriding" in Java occurs when a subclass or child class implements a method already defined in the superclass or base class
     */
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!";
    }

}
