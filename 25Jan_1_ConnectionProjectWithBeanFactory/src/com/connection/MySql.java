package com.connection;

public class MySql implements Connection
{

	@Override
	public void commit()
	{
		System.out.println("MySql------Commit");
	}

	@Override
	public void rollback() 
	{
		System.out.println("MySql------Rollback");
	}

}
