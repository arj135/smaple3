package com.main.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_SummingInt {
 public static void main(String[] args) {
  List < Employee3 > Employee3s = Arrays.asList(new Employee3(1, 1000, "Chandra Shekhar", 6000),
   new Employee3(1, 1000, "Rajesh", 8000),
   new Employee3(1, 1004, "Rahul", 9000),
   new Employee3(1, 1001, "Suresh", 12000),
   new Employee3(1, 1004, "Satosh", 8500)
  );

  int total = Employee3s.stream()
   .collect(Collectors.summingInt(Employee3::getSalary));

  int totalSalByDept = Employee3s.stream().
  filter(name -> 1000 == name.getDeptId())
   .collect(Collectors.summingInt(Employee3::getSalary));

  System.out.println("Total Employee3s Salary : " + total);
  System.out.println("Total Employee3s Salary of 1000 Dept : " + totalSalByDept);
 }

}

class Employee3 {
	 private int id;
	 private int deptId;
	 private String name;
	 private int salary;

	 public Employee3(int id, int deptId, String name, int salary) {
	  super();
	  this.id = id;
	  this.deptId = deptId;
	  this.name = name;
	  this.salary = salary;
	 }
	 public int getId() {
	  return id;
	 }
	 public String getName() {
	  return name;
	 }
	 public int getSalary() {
	  return salary;
	 }
	 public int getDeptId() {
	  return deptId;
	 }

	}