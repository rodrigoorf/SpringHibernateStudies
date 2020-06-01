package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		SoccerCoach theCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call new methods to get literal values - cricketcoach only
		// System.out.println(theCoach.getEmailAddress());
		// System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
