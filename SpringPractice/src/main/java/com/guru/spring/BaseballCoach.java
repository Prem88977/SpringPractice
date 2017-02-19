package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 15/02/2017.
 */
public class BaseballCoach implements Coach {
    //private field for dependency
    private FortuneService fortuneService;

    // define contructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }


    public String getDailyWorkOut() {
        return "Spend 30 min on base ball batting practice";
    }

    public String getDailyFortune() {
        return "Baseball Coach: " + fortuneService.getFortune();
    }

}
