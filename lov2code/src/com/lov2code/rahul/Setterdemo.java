package com.lov2code.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setterdemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ThirdCoachTranning coach = context.getBean("Thirdcoach", ThirdCoachTranning.class);
		// ThirdCoachTranning t1=new ThirdCoachTranning();
		System.out.println(coach.getWorkout());
		System.out.println(coach.getDailyFartune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());

		context.close();
	}

}
