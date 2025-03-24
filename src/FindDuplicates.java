import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
      // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 8);
    	List<Integer> numbers1 =Arrays.asList(3,4,5);
    	List<String> numbers = Arrays.asList( "arjun", "Raju", "Raju","vijay", "kiran");

     Map<String,Long> numbersMap= numbers.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
               // .entrySet().stream().collect(Collectors.toMap(Integer::intValue, Collectors.counting()));
                //.filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(java.util.Map.Entry::getKey, java.util.Map.Entry::getKey))
                //.map(java.util.Map.Entry::getKey)
                //.collect(Collectors.toSet());

       // System.out.println("Duplicates: " + duplicates); // Output: Duplicates: [1, 2, 8]
     System.out.println(numbersMap);
    }
}