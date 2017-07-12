package demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach coach = ctx.getBean("myCoach",Coach.class);
		//call methods on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		//close the context
		ctx.close();
	}

}
