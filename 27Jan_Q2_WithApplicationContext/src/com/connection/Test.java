package com.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext apc=new FileSystemXmlApplicationContext("Bean.xml");
		Welcome w=(Welcome)apc.getBean("a");
		w.m1();
		w.m2();
	}

}
