package com.prowings.student;

import java.util.Objects;

public class Student{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

//	@Override
//	public int compareTo(Object o) {
	
	
	
//		Student s = (Student)o;
//		if(this.rollNo == s.rollNo)
//			return 0;
//		else if(this.rollNo > s.rollNo)
//			return -1;
//		else
//			return 1;
	
	
	//>>>>>>>>>>>>>>String Comparing<<<<<<<<<<<<<<
//		return -this.name.compareTo(s.name);
//		
	
	
	
	//********Desending String********
//		if(this.name.compareTo(s.name) == 0)
//			return 0;
//		else if(this.name.compareTo(s.name) > 0)
//			return -1;
//		else
//			return 1;
//	}
}
