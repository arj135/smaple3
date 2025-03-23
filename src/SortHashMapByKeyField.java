import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByKeyField {

	public static void main(String[] args) {
		Map<Person, String> personMap = new HashMap<>();
        personMap.put(new Person("Alice", 30), "Value1");
        personMap.put(new Person("Bob", 25), "Value2");
        personMap.put(new Person("Charlie", 35), "Value3");
        personMap.put(new Person("David", 28), "Value4");
   //  Map<Person,String> sortedHashMapvalue=   personMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	//Map<Person,String> sortedHashMapkey = personMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Person::getAge))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
  
        Map<Person,String> sortedHashMapvalue =personMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(sortedHashMapvalue);
	}

}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
