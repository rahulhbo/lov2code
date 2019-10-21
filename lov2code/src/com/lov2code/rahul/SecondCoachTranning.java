package com.lov2code.rahul;

public class SecondCoachTranning implements Coach {

	private FortuneService fortuneservice;

	public SecondCoachTranning(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getWorkout() {

		return " run daily 10 km at a time ";
	}

	@Override
	public String getDailyFartune() {
		// TODO Auto-generated method stub
		return "Just Do It :" + fortuneservice.getFortuneService();
	}

}
