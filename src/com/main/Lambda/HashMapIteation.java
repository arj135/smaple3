package com.main.Lambda;

import java.util.HashMap;

public class HashMapIteation {

	public static void main(String[] args) {
		HashMap<String,String> empList = new HashMap<String,String>();
		empList.put("1", "A");
		empList.put("2", "B");
		empList.forEach((k,v)->System.out.println("key "+k+"  value "+v));

	}

}
