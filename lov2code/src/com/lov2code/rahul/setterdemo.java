package com.lov2code.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterdemo 
{
	
	public static void main(String[]args)
	{
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("Thirdcoach",Coach.class);
		System.out.println(coach.getWorkout());
		System.out.println(coach.getDailyFartune());
		context.close();
	}

}
