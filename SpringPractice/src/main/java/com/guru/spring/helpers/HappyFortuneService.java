package com.guru.spring.helpers;

/**
 * Created by Hans on 18/02/2017.
 */
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "HappyFortuneService" + "You will have a Happy Day!";
    }
}
