package com.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		Student stu=(Student)aps.getBean("dev");
		
		stu.display();
		
	}

}
