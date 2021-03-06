package com.fedorov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        System.out.println(coach == alphaCoach);
        System.out.println(coach.equals(alphaCoach));
        System.out.println(coach);
        System.out.println(alphaCoach);

        context.close();



    }

}
