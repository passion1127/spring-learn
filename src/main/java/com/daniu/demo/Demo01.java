package com.daniu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
	
	private String name ;
	
	/*public Demo01(OutputStream out) {
		this.out = out;
	}*/
	
	
	public static void main(String[] args) {
		System.out.println("test spring ........");
		
		ApplicationContext application = new ClassPathXmlApplicationContext("classpath:application.xml"); 
		Demo01 demo = (Demo01) application.getBean("demo01");
		System.out.println("name : " + demo.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
