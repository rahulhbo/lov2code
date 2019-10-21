package com.lov2code.rahul;

public class ThirdCoachTranning implements Coach {

	private FortuneService fortueservice;
	private String EmailAddress;
	private String team;

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// no -arg Constructor
	public ThirdCoachTranning() {
		System.out.println("CricketCoach: inside Constructor-arg method");

	}

	// Setter injection
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

		return fortueservice.getFortuneService();
	}

}
