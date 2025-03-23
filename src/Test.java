import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String args[]) {
		Map<String ,Integer> mapnames = new HashMap<String,Integer>();
		mapnames.put("a", 1);
		mapnames.put("b", 2);
		mapnames.put("c", 3);
		mapnames.put("d", 4);
		mapnames.put("e", 5);
		mapnames.put("f", 6);
		mapnames.put("g", 7);
		mapnames.put("h", 8);
		mapnames.put("i", 9);
		mapnames.put("j", 10);
		mapnames.put("k", 11);
		mapnames.put("l", 12);
		mapnames.put("m", 13);
		mapnames.put("n", 14);
		mapnames.put("o", 15);
		mapnames.put("p", 16);
		mapnames.put("q", 17);
		mapnames.put("r", 18);
		mapnames.put("s", 19);
		mapnames.put("t", 20);
		mapnames.put("u", 21);
		mapnames.put("v", 22);
		mapnames.put("w", 23);
		mapnames.put("x", 24);
		mapnames.put("y", 25);
		mapnames.put("z", 26);
	
		int count =0;
		char [] name ="Arjun".toCharArray();
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
			count =count+mapnames.get(String.valueOf(name[i]).toLowerCase());
		}
		System.out.println(count);
	}

}
