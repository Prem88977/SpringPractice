package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 18/02/2017.
 */
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkOut() {
        return "TennisCoach: Practise Service !!";
    }

    public String getDailyFortune() {
        return "Tennis Coach: " + fortuneService.getFortune();
    }
}
