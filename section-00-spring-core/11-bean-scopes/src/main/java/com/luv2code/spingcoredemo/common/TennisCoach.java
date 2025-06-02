package com.luv2code.spingcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Default scope is singleton, so this is optional 
// @Primary // This annotation indicates that this class is a primary bean for dependency injection
public class TennisCoach implements Coach {

    // add a no argument constructor
    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes!";
    }

}
