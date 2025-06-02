package com.luv2code.spingcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
// @Primary // This annotation indicates that this class is a primary bean for dependency injection
public class TennisCoach implements Coach {

    // add a no argument constructor
    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff() for: " + getClass().getSimpleName());
    }

    // define detroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff() for: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes!";
    }

}
