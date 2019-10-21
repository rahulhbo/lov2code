package com.lov2code.rahul;

public class FirstCoachTranning implements Coach {

	private FortuneService fortuneservice;

	public FirstCoachTranning(FortuneService thisfartuneservice) {
		fortuneservice = thisfartuneservice;
	}

	@Override
	public String getWorkout() {

		return "run 10 km meater perday";
	}

	@Override
	public String getDailyFartune() {

		return fortuneservice.getFortuneService();
	}

	// add an init methord

	public void doMyStartupStuff() {

		System.out.println("FirstCoachTranning :inside methord doMyStartup methord");
	}
	// add a destroy methord

	public void doMyCleanupStuff() {

		System.out.println("FirstCoachTranning :inside methord doMyCleanupStuff methord");
	}

}
