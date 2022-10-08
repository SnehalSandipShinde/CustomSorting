package com.prowings.student;

import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(01,"Sachin");
		Student s2 = new Student(02,"Radha");
		Student s3 = new Student(06,"Avani");
		Student s4 = new Student(10,"Vijay");
		
//		CustomRollComparator rollCom = new CustomRollComparator();
		CustomNameComparator nameCom = new CustomNameComparator();
		
//		TreeSet ts = new TreeSet<>(rollCom);
		TreeSet ts = new TreeSet<>(nameCom);
		
		ts.add(s3);
		ts.add(s4);
		ts.add(s2);
		ts.add(s1);
		
		System.out.println(ts);
		
		
		
	}

}
