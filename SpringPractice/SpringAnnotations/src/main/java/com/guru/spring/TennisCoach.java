package com.guru.spring;

import com.guru.spring.helpers.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component()
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "TennisCoach: Practise backhand";
    }

    public String getFortune() {
        return "TennisCoach: " + fortuneService.getFortune();

    }
}
