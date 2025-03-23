import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
	private void add() {
	System.out.println("add method");
	}
	
	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Pattern  pattren = Pattern.compile("d[0-9]");
//		Matcher matcher =pattren.matcher("This is Arjun A A A");
//		int i=0;
//		while(matcher.find()) {
//			i++;
//		
//		}
//		System.out.println("count"+i);
		RegularExpressionExample regularExpressionExample = new RegularExpressionExample();
		
	Method methodarray[]=RegularExpressionExample.class.getDeclaredMethods();
	for(Method method:methodarray ) {
		
		String s = method.toString(); 
		if(s.startsWith("private")) {
	  
			int a = s.indexOf("."); 
            int b = s.indexOf("(");; 
    
		System.out.println("method name***********"+method);
		
		System.out.println("   ");
		method.setAccessible(true);
		method.invoke(regularExpressionExample);
	}
	}
	}
}
