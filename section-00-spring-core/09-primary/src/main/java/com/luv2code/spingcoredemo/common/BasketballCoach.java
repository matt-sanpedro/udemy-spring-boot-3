package com.luv2code.spingcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling and shooting 3-pointers for 30 minutes baller!";
    }

}
