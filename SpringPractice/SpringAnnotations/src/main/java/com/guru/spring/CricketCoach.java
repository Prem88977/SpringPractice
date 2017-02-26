package com.guru.spring;

import com.guru.spring.helpers.FortuneService;
import com.guru.spring.helpers.HappyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hans on 25/02/2017.
 */
@Component
public class CricketCoach implements Coach {

    private HappyFortuneService happyFortuneService;

    public CricketCoach() {
        System.out.println("Cricket Coach : Default Constructor");
    }

    @Autowired
    public void setFortuneService(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    public String getDailyWorkout() {
        return "Cric Coach: Practise Spin Bowling";
    }

    public String getFortune() {
        return happyFortuneService.getFortune();
    }
}
