
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int number =5455456; int temp=number; int sum=0,r=0; while(number>0) {
		 * r=number%10; sum=(sum*10)+r; number=number/10;
		 * 
		 * } if(sum==temp) { System.out.println("Palindrome"); }
		 */
		
		
		String a="aba";
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		String b=sb.toString();
		System.out.println(b);
		if(a.equalsIgnoreCase(b)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}

	}

}
