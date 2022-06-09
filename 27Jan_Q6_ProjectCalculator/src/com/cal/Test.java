package com.cal;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new FileSystemXmlApplicationContext("Bean.xml");
		Calculator c=(Calculator)aps.getBean("abc");
		
		c.add(10,20);
		c.sub(20,10);
		c.mul(20,10);
		c.div(20,10);
		
	}

}
