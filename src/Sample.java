import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		
		
		List<Integer> integerList = Arrays.asList(1,4,5,6,9,15);
		
	integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

	}

}
