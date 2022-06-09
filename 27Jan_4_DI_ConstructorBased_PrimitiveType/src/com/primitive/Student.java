package com.primitive;

public class Student 
{
	private int rollno;
	
	private String name;

	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}


	public void display()
	{
		System.out.println("Roll Number: " +rollno);
		System.out.println("Name:"+name);
		
		
	}
	
	

}
