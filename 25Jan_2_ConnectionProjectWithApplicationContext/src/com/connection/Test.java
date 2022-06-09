package com.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		
		Connection c=(Connection)aps.getBean("con");
		
		c.commit();
		c.rollback();
	}
}
	
