package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext apc=new ClassPathXmlApplicationContext("Bean.xml");
		
		Student stu=(Student)apc.getBean("s");
		
		System.out.println(stu);
		

		
	}

}
