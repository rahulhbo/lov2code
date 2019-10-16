package com.lov2code.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach= context.getBean("firstcoach",Coach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getDailyFartune());
        
        Coach coach2= context.getBean("Secondcoach",Coach.class);
        System.out.println(coach2.getWorkout()+"\n"+coach2.getDailyFartune());
        context.close();
	}

}
