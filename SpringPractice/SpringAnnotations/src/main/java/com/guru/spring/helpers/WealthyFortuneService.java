package com.guru.spring.helpers;

import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component
public class WealthyFortuneService implements FortuneService {

    public String getFortune() {
        return "WealthyFortuneService: You will win lot of money today!";
    }
}
