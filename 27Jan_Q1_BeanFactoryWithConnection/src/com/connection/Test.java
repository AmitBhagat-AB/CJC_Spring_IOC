package com.connection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("Bean2.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		Connection c=(Connection)bf.getBean("a");
		c.m1();
		c.m2();
	}

}
