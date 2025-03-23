package com.main.Lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class MutliComprision {

	public static void main(String[] args) {
		

	ArrayList<Emp> employeeList = getEmployeeList();
	Comparator<Emp> compareName=(o1,o2)->o1.firstName.compareTo(o2.firstName);
	Comparator<Emp> compareId=(o1,o2)->o1.id-o2.id;
	
	Comparator<Emp> CompareNameAndId=compareId.thenComparing(compareName);
	employeeList.sort(compareName);
	employeeList.forEach(x->System.out.println(x.lastName));
	
	
	}

	public static ArrayList<Emp> getEmployeeList() {
		ArrayList<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "Arjun", "peruri"));
		empList.add(new Emp(2, "Rick", "Icenbarg"));
		empList.add(new Emp(3, "Bradon", "Barrier"));
		return empList;
	}

}

class Emp {
	public int id;
	public String firstName;
	public String lastName;

	public Emp(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}