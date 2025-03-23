
public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();	
		fb.displayfibonacci(7);
	}

	public void displayfibonacci(int n) {
		int num1=0;
		int num2=1;

		for(int i=1;i<=n;i++) {
		
		if(i==1) {
			System.out.println("0");
		}
		if(i==2) {
			System.out.println("1");
		}
		else if(i>2){
			int value=num1+num2;
			System.out.println(value);
			num1=num2;
			num2=value;
			
		}
		
		}
}
}
