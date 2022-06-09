package annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext aps=new ClassPathXmlApplicationContext("APC.xml");
		
		Student stu=aps.getBean("s",Student.class);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr().getAreaName());
		System.out.println(stu.getAddr().getCityName());
		
		
		Employee emp=aps.getBean("e",Employee.class);
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getAddr().getAreaName());
		System.out.println(emp.getAddr().getCityName());
	
	}

}
