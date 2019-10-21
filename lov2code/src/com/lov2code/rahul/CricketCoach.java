package com.lov2code.rahul;

public class CricketCoach implements Coach {

	private FortuneService fortuneservice;
	
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getWorkout() {
		return "pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFartune() {
		return fortuneservice.getFortuneService();
	}

}
