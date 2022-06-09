package com.connection;

public class Oracle implements Connection 
{

	@Override
	public void commit() {
		System.out.println("Oracle---Commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("Oracle----Rollback");
		
	}
	

}
