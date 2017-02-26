package com.guru.spring;

import com.guru.spring.helpers.FortuneService;
import com.guru.spring.helpers.HappyFortuneService;
import com.guru.spring.helpers.WealthyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component()
public class FootballCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Autowired
    private HappyFortuneService happyFortuneService;

    @Autowired
    private WealthyFortuneService wealthyFortuneService;

    public String getDailyWorkout() {
        return "FootballCoach: Practise Goal";
    }

    public String getFortune() {
        return "FootballCoach: " + wealthyFortuneService.getFortune()
                + " ******** " + happyFortuneService.getFortune() + "************* "
                + fortuneService.getFortune();

    }
}
