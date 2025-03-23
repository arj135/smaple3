
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("arjun");

	}
	public static void reverseString(String value) {
		char [] dataArray = value.toCharArray();
		char [] outputArray = new char[dataArray.length];
		int j=0;
		for(int i=dataArray.length-1;i>=0;i--) {
			outputArray[j]=dataArray[i];
			j++;
		}
		String output= new String(outputArray);
		System.out.println(output);
	}

}
