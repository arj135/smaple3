import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) throws ClassNotFoundException {
		List<Student> namesList = new ArrayList<Student>();
		namesList.add(new Student("Arjun",3));
		namesList.add(new Student("raju",4));
		namesList.add(new Student("vijay",2));
		namesList.add(new Student("vijay",2));
		Collections.sort(namesList,new NameComparator());;
	for(Student st:namesList) {
		//System.out.println(st.getName());
	}
	//Map<Object,Long> duplicatesCount=namesList.stream().collect(Collectors.groupingBy(Student::getNo, Collectors.counting()));
	//Map<Object,List<Student >> duplicatesCount=namesList.stream().collect(Collectors.groupingBy(x->x.getName()));
	List<Student> list=namesList.stream().sorted(Comparator.comparing(Student::getNo)).collect(Collectors.toList());
	System.out.println(list);
	}

}
class Student{
	
	private String name;
	private  int no;
	Student(String name,int no){
		this.name=name;
		this.no=no;
	}
	
		public String getName() {
			return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getNo()-o2.getNo();
	}
	
}
