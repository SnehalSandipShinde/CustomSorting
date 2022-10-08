package com.prowings.employee;

import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {

		Employee emp1 = new Employee(8, "Sunil", "Pune");
		Employee emp2 = new Employee(3, "Manasi", "Sangli");
		Employee emp3 = new Employee(2, "Vijay", "Kolhapur");
		Employee emp4 = new Employee(9, "Renu", "Mumbai");
		Employee emp5 = new Employee(5, "Anil", "Thane");
		Employee emp6 = new Employee(6, "Anil", "Thane");

		CustomEmpIdComparator eIdCom = new CustomEmpIdComparator();

		CustomEmpNameComparator eNameCom = new CustomEmpNameComparator();

		CustomEmpCityComparator eCityCom = new CustomEmpCityComparator();

//		TreeSet ts = new TreeSet<>(eIdCom);
		
//		TreeSet ts = new TreeSet<>(eNameCom);
		
		TreeSet ts = new TreeSet<>(eCityCom);

		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp5);
		ts.add(emp1);
		ts.add(emp4);
		ts.add(emp6);

		System.out.println(ts);

	}

}
