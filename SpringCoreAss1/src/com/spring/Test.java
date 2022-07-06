package com.spring;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Customers cus=(Customers) context.getBean("customer");
		cus.printCustomersDetail();
	}

}
