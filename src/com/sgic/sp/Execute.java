package com.sgic.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		School obj = (School) context.getBean("school");
		((AbstractApplicationContext)context).registerShutdownHook();
		FruitList ob1 = (FruitList) context.getBean("fruit");
		// Array list using here
//		FruitList ob2 = (FruitList) context.getBean("fruit");
//		obj.getName();
//		ob2.getName();
		ob1.getName();
		ob1.getName();
		
		
	}
}
