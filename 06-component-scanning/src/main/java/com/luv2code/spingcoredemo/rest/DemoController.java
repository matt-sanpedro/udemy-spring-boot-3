package com.luv2code.spingcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.util.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    /*
     * create a Constructor in the class for dependency injections
     * define a private field for the dependency
     */
    private Coach myCoach;

    // define a constructor for dependency injection
    /*
     * define a constructor for dependency injection
     * "theCoach" is:
     *     1. injected into the DemoController class
     *     2. used to initialize the myCoach field
     *     3. a dependency or "helper" for the controller
     */
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
}
