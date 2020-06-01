package com.example.demo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach() {
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Penalties shootouts for an hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
