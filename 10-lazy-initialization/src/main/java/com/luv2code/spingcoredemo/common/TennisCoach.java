package com.luv2code.spingcoredemo.common;

import org.springframework.stereotype.Component;

@Component
// @Primary // This annotation indicates that this class is a primary bean for dependency injection
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes!";
    }

}
