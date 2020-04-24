package com.nitinshirale.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
public static void main(String args[])	{
	// load the spring configuration file
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
			CricketCoach thecoach=context.getBean("mycricketCoach",CricketCoach.class);
			
			System.out.println(thecoach.getDailyWorkout());
			System.out.println(thecoach.getDailyFortune());
			System.out.println(thecoach.getEmailAddress());
			System.out.println(thecoach.getTeam());
context.close();
}
}