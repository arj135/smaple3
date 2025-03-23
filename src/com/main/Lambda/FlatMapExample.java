package com.main.Lambda;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Arjun","Raju");
		List<String> list2=Arrays.asList("vishal","kiran");
		List<String> list3=Arrays.asList("ravi","vijay");
		List<List<String>> listofLists= Arrays.asList(list1,list2,list3);
		listofLists.stream().flatMap(x->x.stream()).forEach(System.out::println);
	}

}
