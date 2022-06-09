package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 
{
	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("Bean2.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		Welcome w=(Welcome)bf.getBean("xyz");
		w.m1();
		w.m2();
	}

}
