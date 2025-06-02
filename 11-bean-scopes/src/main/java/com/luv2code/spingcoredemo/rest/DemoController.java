package com.luv2code.spingcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.spingcoredemo.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
    /*
     * create a Constructor in the class for dependency injections
     * define a private field for the dependency
     */
    private Coach myCoach;

    private Coach anotherCoach;

    /*
     * create the setter method
     * can rename the method because of the @Autowired annotation
     */
    @Autowired
    public DemoController(
        @Qualifier("tennisCoach") Coach theCoach,
        @Qualifier("tennisCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans : myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
    
    
}
