package com.prowings.student;

import java.util.Comparator;

public class CustomNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		
		return std1.name.compareTo(std2.name);
		
//		if(std1.name.compareTo(std2.name)==0)
//			return 0;
//		else if(std1.name.compareTo(std2.name)>0)
//			return -1;
//		else
//			return 1;
	}

}
