package constructor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext aps=new ClassPathXmlApplicationContext("AC.xml");
	 Student stu=(Student) aps.getBean("stud");
	 
	 System.out.println(stu);
 }
}
