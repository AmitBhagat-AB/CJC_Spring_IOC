package com.cjc;

public class Student 
{
	public Student()
	{
		System.out.println("Constructor of Student");
	}

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
