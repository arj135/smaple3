import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountofrepeatedNames {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("Arjun","vijay","Arjun");
		Map<String,Integer> map = new HashMap<String,Integer>();
		list.forEach(x->{
			if(map.get(x)==null) {
				
				map.put(x, 1);
			}else {
				Integer i=map.get(x);
				map.put(x, i+1);
			}
		});;
		System.out.println(map);
	}

}
