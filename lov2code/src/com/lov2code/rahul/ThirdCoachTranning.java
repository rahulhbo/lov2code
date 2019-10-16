package com.lov2code.rahul;

public class ThirdCoachTranning implements Coach {

	private FortuneService fortueservice;
	
	public ThirdCoachTranning() {
		System.out.println("CricketCoach: inside Constructor-arg method");
		
	}
	
	
	public void setFortueservice(FortuneService fortueservice) {
		System.out.println("CricketCoach: inside setter method");
		this.fortueservice = fortueservice;
	}

	@Override
	public String getWorkout() {
		
		return "pratice one our for fast bolling";
	}

	@Override
	public String getDailyFartune() {
		
		return fortueservice.getFortuneService() ;
	}

}
