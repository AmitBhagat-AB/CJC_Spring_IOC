package com.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	
	public static void main(String[] args) 
	{
		ApplicationContext apc=new ClassPathXmlApplicationContext("APC.xml");
		
		Student stu=(Student)apc.getBean("sharon");
		
		System.out.println(stu);
		

		
	}

}
