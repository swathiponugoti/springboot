package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee)context.getBean("emp");
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
	}

}