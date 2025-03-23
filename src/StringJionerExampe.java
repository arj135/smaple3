

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJionerExampe {

	public static void main(String[] args) {
   List<String> list = new ArrayList<String>();
//   list.add("Ajun");
//   list.add("viaj");
//   list.add("kirshna");
//  list.stream().filter(a->a.contains("a")).forEach(a->System.out.println(a));;
  // System.out.println(fiterList);
   //System.out.println(list);
 List<Integer> integerList = new ArrayList<Integer>();
 integerList.add(2);
 integerList.add(6);
 integerList.add(4);
 integerList.add(1);
 integerList.add(1);
 integerList.forEach(i->System.out.println(i));
 Set<Integer> s = new LinkedHashSet<Integer>(integerList);
 //s.forEach(a->System.out.println(a));
 //System.out.println(integerList.stream().min((a,b)->a.compareTo(b)));
//List<Integer> sortedIntegerList =integerList.stream().sorted().collect(Collectors.toList());
//System.out.println(sortedIntegerList);

	}

}
