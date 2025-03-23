import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> dataMap = new LinkedHashMap<Integer,String>();
		dataMap.put(1,"Arjun");
		dataMap.put(2,"bhanu");
		dataMap.put(4,"krihsna");
		dataMap.put(3,"vishal");
		for(Map.Entry<Integer, String> entry:dataMap.entrySet()) {
			System.out.println("key "+entry.getKey()+"  value: "+entry.getValue());
		}
		
		

	}

}
