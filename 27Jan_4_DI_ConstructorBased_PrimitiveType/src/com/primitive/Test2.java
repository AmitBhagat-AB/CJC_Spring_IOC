package com.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("APC.xml");
		Student stu=(Student)aps.getBean("abc");
		
		stu.display();
		
	}

}
