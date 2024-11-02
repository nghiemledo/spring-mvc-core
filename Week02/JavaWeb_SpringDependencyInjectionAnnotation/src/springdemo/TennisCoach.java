package springdemo;

import org.springframework.context.annotation.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.*;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// define a default constructor
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside default constructor");
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
//
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Tennis Coach: Inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	

	@Autowired
	public void doSomeFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis Coach: Inside doSomeFortuneService");
		this.fortuneService = fortuneService;
	}
	
	// define my init method
	@PostConstruct
	public void doMyStart() {
		System.out.println("TennisCoach: Inside doMyStart");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("TennisCoach: Inside doMyDestroy");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}
	
}