
package com.cal;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
//		String yn=" ";
//		do
//		{
//			System.out.println("Do you want to Continue..");
			
		
		ApplicationContext aps=new FileSystemXmlApplicationContext("Bean.xml");
		Calculator c=(Calculator)aps.getBean("abc");
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");
			int ch= Integer.parseInt(sc.next());
			System.out.println("Enter First No \n");
			int x= Integer.parseInt(sc.next());
			System.out.println("Enter Second No \n");
			int y = Integer.parseInt(sc.next());
			
			switch(ch) 
			{
			case 1:
				c.add(x, y);
				break;
			case 2:
				c.sub(x, y);
				break;
			case 3:
				c.mul(x, y);
				break;
			case 4:
				c.div(x, y);
				break;
			case 5:
				System.out.println("EXIT");
			default :
				System.out.println("Enter Valid No \n");
				
			}
		}
			
//		}while(yn.equals("y")||yn.equals("Y"));
			
		
		
		
	}

}
