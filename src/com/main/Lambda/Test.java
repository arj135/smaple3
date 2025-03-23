package com.main.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Emp1  e1 = new Emp1("Arjun",2345);
//Emp1  e2 = new Emp1("Raju",2347);
//Emp1  e3 = new Emp1("Kiran",2246);

Map<Integer, Emp1> map = new HashMap<>();
map.put(1, new Emp1("Arjun",2345));
map.put(2,new Emp1("Raju",2347));
map.put(3, new Emp1("Kiran",2246));
List<Entry<Integer, Emp1>> employeeList = new ArrayList<>(map.entrySet());
//Collections.sort(employeeList,Comparator.comparing(x->x.getValue().getName()));

map.entrySet().stream().sorted(Comparator.comparing(x->x.getValue().getId())).forEach(x->System.out.println(x.getValue()));

	}
	

} 
class Emp1 {
    private String name;
    private int id;
    // ... other attributes

    public Emp1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}