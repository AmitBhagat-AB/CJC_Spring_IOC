package com.bytype;
//Consider Student class with secondary dependency of Address class  as ‘address’ then:-
//Spring container will find secondary dependancy in Student class, 
//then it will take type of that dependancy (Address)
//& matches it with class in bean.
//If match found, it will inject property using 
//Setter Injection.
//If match not found, property remains unwired.


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("APC.xml");
		Student stu=(Student) aps.getBean("student");
		
		System.out.println("RollNo:" 	+stu.getRollno());
		System.out.println("Name:"	+stu.getName());
		System.out.println("Area Name:"	+stu.getAddress().getAreaname());
		System.out.println("City Name:"	+stu.getAddress().getCityname());
		
	}
 
}
