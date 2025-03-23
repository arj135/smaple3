package com.main.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterData {

	public static void main(String[] args) {
  List<String> namesList =Arrays.asList("vishal","viajy","Raju");
  List<String> outputList =namesList.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
//namesList.stream().filter(x->!x.startsWith("R")).sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
  //namesList.parallelStream().forEachOrdered(System.out::println);
//outputList.forEach(x->System.out.println(x));
//namesList.stream().forEach(System.out::println);
  //namesList.stream().filter(x->!x.startsWith("R")).sorted().forEach(System.out::println);
  
	/*
	 * Stream<String> st= Stream.of("raj","vivek"); st.forEach(System.out::println);
	 */
  
  List<Integer> numberList = Arrays.asList(2,5,7,8,4,10);
	/*
	 * Integer [] a=numberList.stream().filter(i->i%2==0).toArray(Integer[]::new);
	 * for(int i:a) { System.out.println(i); }
	 */
  
 // namesList.stream().filter(x->x.startsWith("v")).map(String::toUpperCase).forEach(System.out::println);
  
	/*
	 * System.out.println(namesList.stream().anyMatch(x->x.startsWith("v")));
	 * System.out.println(namesList.stream().allMatch(x->x.startsWith("v")));
	 * System.out.println(namesList.stream().noneMatch(x->x.startsWith("s")));
	 */
  
	/*
	 * Optional<String> namesStiring= namesList.stream().reduce((x,y)->x+""+y);
	 * namesStiring.ifPresent(System.out::println);
	 */
  //System.out.println(namesList.stream().filter(x->x.startsWith("v")).findFirst().get());
  
  List<Employee> employeesList = Arrays.asList(
          new Employee(1, "Alex", 100),
          new Employee(2, "Brian", 100),
          new Employee(3, "Charles", 200),
          new Employee(4, "David", 200),
          new Employee(5, "Edward", 300),
          new Employee(6, "Frank", 300)
      );

//employeesList.stream().map(x->x.getSal()).distinct().forEach(System.out::println);
 // employeesList.stream().map(x->x.getSal()).peek(System.out::println);
  //IntStream.iterate(0, i->i+2).limit(10).forEach(System.out::println);
 // Stream.generate(()->(new Random().nextInt(2))).limit(5).forEach(System.out::println);
 // Map<Object,Long> mapList=employeesList.stream().collect(Collectors.groupingBy(x->x.getSal(),Collectors.counting()));
  
 // System.out.println(mapList);
  
  List<Employee> list=employeesList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
  System.out.println(list);
	}
	

}

class Employee{
	int empno;
	String name;
	Double sal;
	
	Employee(int empno,String name,double sal){
		this.empno=empno;
		this.name=name;
		this.sal=sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}
	
}