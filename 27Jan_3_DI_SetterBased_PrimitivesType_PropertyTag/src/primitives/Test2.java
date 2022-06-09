package primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
	public static void main(String[] args) 
	{
		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		
		Student stu=(Student)aps.getBean("xyz");

//		Student stu=aps.getBean("narsi",Student.class);
		
		
		System.out.println("Roll Number:"+stu.getRollno());
		System.out.println("Name:"	+stu.getName());
		
		System.out.println(stu.getRollno()+" "+stu.getName());
		System.out.println(stu);
		
		stu.display();
		
	}

}
