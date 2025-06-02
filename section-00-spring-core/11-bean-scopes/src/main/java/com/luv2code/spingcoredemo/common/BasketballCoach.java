package com.luv2code.spingcoredemo.common;

// import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// @Lazy
public class BasketballCoach implements Coach {

    // add a no argument constructor
    public BasketballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling and shooting 3-pointers for 30 minutes baller!";
    }

}
