package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 15/02/2017.
 */
public class BaseballCoach implements Coach {
    //private field for dependency
    private FortuneService fortuneService;
    private String prop_emailId, prop_team;

    // define contructor for dependency injection
    public BaseballCoach(FortuneService fortuneService){
        System.out.println("In Baseball Coach arg constructor");
        this.fortuneService = fortuneService;
    }

    public String getProp_emailId() {
        return prop_emailId;
    }

    public void setProp_emailId(String prop_emailId) {
        this.prop_emailId = prop_emailId;
    }

    public String getProp_team() {
        return prop_team;
    }

    public void setProp_team(String prop_team) {
        this.prop_team = prop_team;
    }

    public String getDailyWorkOut() {
        System.out.println();
        return "Baseball Coach : Spend 30 min on base ball batting practice";
    }

    public String getDailyFortune() {
        return "Baseball Coach: " + fortuneService.getFortune();
    }

}
