package springdemo;

public class MyApp {
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new BaseballCoach(); //using the interface
		// use the object
		System.out.print(theCoach.getDailyWorkout());
		
		theCoach = new TrackCoach();
		System.out.print(theCoach.getDailyWorkout());
		
		// Chuyen qua Spring Inversion of control: dung XML Configuration
		// Co 3 buoc
		// Configure your Spring Beans
		// Create a Spring Container
		// Retrieve Beans from Spring Container
	}
}