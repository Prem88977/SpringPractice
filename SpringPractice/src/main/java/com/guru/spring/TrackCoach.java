package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 15/02/2017.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkOut() {
        return "TrackCoach: Run 10K !!!";
    }

    public String getDailyFortune() {
        return "Track Coach: " + fortuneService.getFortune();
    }
}
