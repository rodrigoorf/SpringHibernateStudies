package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// Application covering IoC (Inversion of Control) and Dependency Injection concepts from Spring Framework
public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// calling method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();
	}
}
