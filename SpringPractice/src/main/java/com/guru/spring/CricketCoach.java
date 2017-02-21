package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 19/02/2017.
 */
public class CricketCoach  implements Coach{
    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public CricketCoach() {
        System.out.println("In CricketCoach default constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("In CricketCoach setFortuneService method");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkOut() {
        return "Practise hitting sixes!";
    }

    public String getDailyFortune() {
        return "Cricket Coach: " + fortuneService.getFortune();
    }
}
