package com.luv2code.spingcoredemo.common;

public class SwimCoach implements Coach {

    // create a no-arg constructor for diagnositics
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up!";
    }

}
