package net.javaguides.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	private int rollNo;
	private String Name;
	private String Address;
	
	public Students() {
	
	}
	public Students(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.Name = name;
		this.Address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", Name=" + Name + ", Address=" + Address + "]";
	}
	public Students get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
