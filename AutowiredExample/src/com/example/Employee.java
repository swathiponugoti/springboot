package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
     private int empId;
	   private String Name;
	 @Autowired
	   private Address address;
	   public Employee()
	   {
		   System.out.println("Employee Contructor");
		   
	   }
	   public  Employee(int empId,String name)
	   {
		   super();
		   this.empId=empId;
		   this.Name=name;
		   System.out.println("Constructor with two parameter");
	   }
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
