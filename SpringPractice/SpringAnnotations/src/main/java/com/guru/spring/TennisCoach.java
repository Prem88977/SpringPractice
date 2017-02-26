package com.guru.spring;

import com.guru.spring.helpers.FortuneService;
import com.guru.spring.helpers.WealthyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component()
public class TennisCoach implements Coach{

    private WealthyFortuneService wealthyFortuneService;

    @Autowired
    public TennisCoach(WealthyFortuneService wealthyFortuneService) {
        this.wealthyFortuneService = wealthyFortuneService;
    }

    public String getDailyWorkout() {
        return "TennisCoach: Practise backhand";
    }

    public String getFortune() {
        return "TennisCoach: " + wealthyFortuneService.getFortune();

    }
}
