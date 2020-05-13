package com.demo.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Spring.pojo.Coach;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Coach coach = context.getBean("mycoach",Coach.class);
        System.out.println(coach.getWorkoutDetails());
        
        context.close();
    }
}
