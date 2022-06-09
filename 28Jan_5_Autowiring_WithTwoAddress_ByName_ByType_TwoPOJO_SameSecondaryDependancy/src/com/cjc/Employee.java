package com.cjc;

public class Employee 
{
	private int eid;
	private String ename;
	private Address eaddr;
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getEaddr() {
		return eaddr;
	}
	public void setEaddr(Address eaddr) {
		this.eaddr = eaddr;
	}
}