package com.main.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ObjectComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Employee2> compare= Comparator.comparing(Employee2::getAge);
		
		List<Employee2> employees = new ArrayList<Employee2>();
		
		employees.add(new Employee2(1, "Lokesh", 36));
		employees.add(new Employee2(2, "Alex", 46));
		employees.add(new Employee2(3, "Brian", 52));
		
		System.out.println(employees.stream().max(compare).get().name);

	}
}
class Employee2{
	Integer empNo;
	String name;
	Integer age;
	Employee2(Integer empNo,String name,Integer age){
		this.empNo=empNo;
		this.age=age;
		this.name=name;
	}
	
	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}

