package com.byname;
// bean id name and POJO class field name must be same. 
//if different it will throws null pointer Exception
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext apc=new ClassPathXmlApplicationContext("APC.xml");
//		Student stu=(Student) apc.getBean("stu");
		Student stu=apc.getBean( "stu",Student.class);
		
		System.out.println("RollNo:" 	+stu.getRollno());
		System.out.println("Name:"	+stu.getName());
		System.out.println("Area Name:"	+stu.getEx().getAreaname());
		System.out.println("City Name:"	+stu.getEx().getCityname());
		
	}
 
}
