package com.guru.spring;

import com.guru.spring.helpers.FortuneService;

/**
 * Created by Hans on 19/02/2017.
 */
public class CricketCoach  implements Coach{
    private FortuneService fortuneService;
    private String emailId, team;

    public CricketCoach() {
        System.out.println("In CricketCoach default constructor");
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("In CricketCoach setFortuneService method");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkOut() {
        return "CricketCoach: Practise hitting sixes!";
    }

    public String getDailyFortune() {
        return "Cricket Coach: " + fortuneService.getFortune();
    }
}
