package com.lov2code.rahul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// load spring configration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// retrive bean from spring contsiner
		Coach thecoach = context.getBean("firstcoach", Coach.class);
		Coach alphacoach = context.getBean("firstcoach", Coach.class);

// check if there are same object 
		boolean result = (thecoach == alphacoach);
		System.out.println("Point the Same Objcet :" + result);
		System.out.println("Memory loaction of  thecoach:" + thecoach);
		System.out.println("Memory loaction of  alphacoach:" + alphacoach);

		context.close();

	}

}
