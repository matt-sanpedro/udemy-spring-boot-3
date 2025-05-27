package com.luv2code.spingcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
    /*
     * create a Constructor in the class for dependency injections
     * define a private field for the dependency
     */
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
}
