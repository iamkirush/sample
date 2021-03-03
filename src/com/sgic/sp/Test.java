package com.sgic.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		HelloPrinter obj = (HelloPrinter) context.getBean("hello");
		obj.print();
	}
}
