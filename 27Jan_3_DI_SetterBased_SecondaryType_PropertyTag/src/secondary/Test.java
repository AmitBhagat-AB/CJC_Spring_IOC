package secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("APC.xml");
		
		Student stu=(Student)aps.getBean("zzz");
		
		System.out.println("Rollno:-"+stu.getRollno());
		System.out.println("Name:-"+stu.getName());
		System.out.println("Area:-"+stu.getAdr().getAreaname());
		System.out.println("City:-"+stu.getAdr().getCityname());
	}
}

