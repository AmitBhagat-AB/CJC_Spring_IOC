package annotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("APC.xml");
		Student stu=(Student)aps.getBean("s");
		
		System.out.println("RollNo:"+stu.getRollno());
		System.out.println("Name:"+stu.getName());
		System.out.println("Area Name:"+stu.getAddress().getAreaname());
		System.out.println("City Name:"+stu.getAddress().getCityname());
		
	}

}
