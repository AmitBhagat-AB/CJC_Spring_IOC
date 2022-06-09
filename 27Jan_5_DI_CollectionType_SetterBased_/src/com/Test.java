package com;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		Student stu=(Student)aps.getBean("s");
		
		List<String>list=stu.getMyList();
		for(String l:list)
		{
			System.out.println(l);
		}
		
		Set<String> set=stu.getMySet();
		for(String s:set)
		{
			System.out.println(s);
		}
		
		Map<String,String>map=stu.getMyMap();
		
		Set keys=map.keySet();
		
		for(Object key:keys)
		{
			System.out.println(key);
			String s=map.get(key);
			System.out.println(s);
		}
		
		
		
	}

}
