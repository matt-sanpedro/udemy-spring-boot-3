package com.luv2code.spingcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.spingcoredemo.common.Coach;
import com.luv2code.spingcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
