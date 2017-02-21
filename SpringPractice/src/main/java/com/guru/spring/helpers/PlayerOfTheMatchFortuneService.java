package com.guru.spring.helpers;

/**
 * Created by Hans on 19/02/2017.
 */
public class PlayerOfTheMatchFortuneService implements FortuneService {
    public String getFortune() {
        return "PlayerOfTheMatchFortuneService" + "You will be the player of the match today!!!";
    }
}
