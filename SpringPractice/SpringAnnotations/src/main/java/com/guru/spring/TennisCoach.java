package com.guru.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component()
public class TennisCoach implements Coach{

    public String getDailyWorkout() {
        return "TennisCoach: Practise backhand";
    }

    public String getFortune() {
        return null;
    }
}
