package com.guru.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hans on 15/02/2017.
 */
public class MyApp {

    public static void main(String[] args) {

        /*// create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkOut());*/


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkOut());
    }
}
