package com.prowings.employee;

public class Employee {
	int empId;
	String empName;
	String empCity;
	
	public Employee(int empId, String empName, String empCity) {
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", Name=" + empName + ", City=" + empCity + "]";
	}
	

//	@Override
//	public int compareTo(Object o) {
//		
//		
//		Employee emp = (Employee)o;
//		
//		
//		//Compare using employee id---
////		if(this.empId == emp.empId)
////			return 0;
////		else if(this.empId > emp.empId)
////			return 1;
////		else
////			return -1;
//
//		//Compare using employee name---
////		return this.empName.compareTo(emp.empName);
//		
//		//Compare using employee city---
////		return this.empCity.compareTo(emp.empCity);
//		
//		//Compare using employee city by descending order---
//		if(this.empCity.compareTo(emp.empCity) == 0)
//			return 0;
//		else if(this.empCity.compareTo(emp.empCity) > 0)
//			return -1;
//		else 
//			return 1;
//	}
}
