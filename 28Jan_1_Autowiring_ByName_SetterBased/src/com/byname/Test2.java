package com.byname;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
// bean id name and POJO class field name must be same. 
//if different it will throws null pointer Exception
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 
{
	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource ("Bean.xml");
		BeanFactory bf= new XmlBeanFactory(rs);
			
		Student stu=bf.getBean( "stu",Student.class);
		
		System.out.println("RollNo:" 	+stu.getRollno());
		System.out.println("Name:"	+stu.getName());
		System.out.println("Area Name:"	+stu.getEx().getAreaname());
		System.out.println("City Name:"	+stu.getEx().getCityname());
		
	}
 
}
