package com.cal;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

	public class Test
	{
			public static void main(String args[])
		    {
			        int num;
			        double a,b,c; 
			        Scanner sc = new Scanner(System.in);
			 
			        System.out.print("Enter The Number :\n\n");
			        num = sc.nextInt();
	
			        a=Math.pow(num,1);
					b=Math.pow(num,2);
				    c=Math.pow(num,3);  

		             System.out.println("\nOutput Is = " + a + " ,"+ b +" ,"+ c +"\n\n"); 
		    }
	}

