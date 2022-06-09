package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new FileSystemXmlApplicationContext("APC.xml");
			
		Student stu=(Student)aps.getBean("amit");
		System.out.println(stu);
		
		Student stu1=(Student)aps.getBean("amit");
		System.out.println(stu1);
		
	}

}
