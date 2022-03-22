package com.example;

public class Employee {
     private int empId;
	   private String Name;
	   public Employee()
	   {
		   System.out.println("Employee Contructor");
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

}
