package com.lov2code.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp {

	public static void main(String[] args) {
		// load spring configration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrive bean from spring contsiner
		Coach thecoach = context.getBean("firstcoach", Coach.class);
		/* Coach alphacoach=context.getBean("firstcoach",Coach.class); */
		System.out.println(thecoach.getWorkout());
		context.close();

	}

}
