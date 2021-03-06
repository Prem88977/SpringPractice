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


        //Load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrive bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        BaseballCoach baseballCoach = context.getBean("myCoach", BaseballCoach.class);

        // Call method on the bean
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());

        System.out.println("**************************************");

        System.out.println(baseballCoach.getProp_emailId());
        System.out.println(baseballCoach.getProp_team());

        System.out.println("**************************************");

        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println("**************************************");

        System.out.println(cricketCoach.getEmailId());
        System.out.println(cricketCoach.getTeam());


        //Close the context
        context.close();
    }
}
