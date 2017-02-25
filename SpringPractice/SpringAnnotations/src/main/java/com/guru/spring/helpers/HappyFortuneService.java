package com.guru.spring.helpers;

import org.springframework.stereotype.Component;

/**
 * Created by Hans on 21/02/2017.
 */

@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "HappyFortuneService: You will have a Happy Day!";
    }
}
