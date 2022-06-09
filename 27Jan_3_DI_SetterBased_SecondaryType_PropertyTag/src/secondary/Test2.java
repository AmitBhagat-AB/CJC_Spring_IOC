package secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		
		Student stu=(Student)aps.getBean("stu");
		
		System.out.println("Rollno:-"+stu.getRollno());
		System.out.println("Name:-"+stu.getName());
		System.out.println("Area:-"+stu.getAdr().getAreaname());
		System.out.println("City:-"+stu.getAdr().getCityname());
	}
}

