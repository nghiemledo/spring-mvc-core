package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("The result is " + result);
		System.out.println("Memmory location of theCoach " + theCoach);
		System.out.println("Memmory location of alphaCoach " + alphaCoach);
		
		context.close();
	}
}