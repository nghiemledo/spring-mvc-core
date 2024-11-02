package springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	public CricketCoach() {
		System.out.print("CricketCoach: inside no-args constructor");
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// our setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.print("CricketCoach: inside setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your luckey day";
	}
	
}