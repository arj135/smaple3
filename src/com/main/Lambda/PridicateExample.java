package com.main.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PridicateExample {
	public static void main(String[] args) {
		
		
		/*
		 * List<Integer> list = Arrays.asList(1, 2, 3, 4); Predicate<Integer> p = x -> x
		 * > 2; list.stream().filter(p).forEach(System.out::println);
		 */
		 int [] arr= new int[] {2,3,5};
		 List<Integer> listArray=  Arrays.stream(arr).boxed().collect(Collectors.toList());
		 listArray.stream().forEach(System.out::println);
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(3,4,5),Arrays.asList(6,7,8));
		
		
		//List<Integer> flattenedList = list.stream().flatMap(List::stream) .collect(Collectors.toList());
		List<Integer> flList =list.stream().flatMap(List::stream).collect(Collectors.toList());
		flList.forEach(System.out::println);
	}

}
