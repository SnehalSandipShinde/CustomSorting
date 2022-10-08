package com.prowings.student;

import java.util.Comparator;

public class CustomRollComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		if(std1.rollNo == std2.rollNo)
			return 0;
		else if (std1.rollNo > std2.rollNo)
			return 1;
		else
			return -1;
	}
}
