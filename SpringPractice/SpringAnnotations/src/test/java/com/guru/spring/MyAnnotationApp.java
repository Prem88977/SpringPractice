package com.guru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hans on 21/02/2017.
 */
public class MyAnnotationApp {

    public static void main(String[] args){

        // read spring config file
         ClassPathXmlApplicationContext context =
                 new ClassPathXmlApplicationContext("applicationContext.xml");


        // get bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class) ;


        // call methods on the bean
        System.out.println(coach.getDailyWorkout());


        //close the context
        context.close();


    }


}