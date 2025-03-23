import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(2,3,4),Arrays.asList(6,8,9));
		List<Integer> flatMapList= list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(flatMapList);
	}

}
