
public class AddTwonumbersgetTarget {
	public static void main(String[] args) {
		Integer[]  arryintegers = new Integer[]{2,3,6,9};
		
		Integer target =12;
		for(int i=0;i<arryintegers.length;i++) {
			for(int j=i+1;j<arryintegers.length;j++) {
				Integer value=arryintegers[i]+arryintegers[j];
				if(value==target) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}

}
