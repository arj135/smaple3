package com.main.Lambda;

/*package whatever //do not write package name here */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class GFG {
	public static void main(String args[]) {

		{
			Map<Integer,Student> studentMap= new HashMap<>();
			studentMap.put(1, new Student(1,"viay"));
			studentMap.put(3, new Student(3,"Raju"));
			studentMap.put(2, new Student(2,"Ajay"));
		//Map<Integer,Student> sortedMap=	studentMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		//sortedMap.forEach((x,y)->System.out.println(x+"  "+y));
			
			Map<Integer,Student> sortedMap = studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
			sortedMap.forEach((x,y)->System.out.println(x+"  "+y));
		}
	}

}
class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}