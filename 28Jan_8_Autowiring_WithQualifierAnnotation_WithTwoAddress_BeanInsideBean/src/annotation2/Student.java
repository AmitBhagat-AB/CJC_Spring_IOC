package annotation2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int rollno;
	
	private String name;
	@Autowired
	private Address addr;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
