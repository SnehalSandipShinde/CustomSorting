package com.prowings.employee;

import java.util.Comparator;

public class CustomEmpCityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empCity.compareTo(e2.empCity);
	}

}
