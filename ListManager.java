import java.util.List;
import java.util.ArrayList;

public class ListManager{
	
	public static List removeElement(List list1, List list2) {
		list1.retainAll(list2);
		return list1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList<>();
		
		list1.add("Java");
		list1.add("Python");
		list1.add("Android");
		list1.add("PHp");
		list1.add("Ruby");
		list1.add("Perl");
		
		List<String> list2=new ArrayList<>();
		
		list2.add("Java");
		list2.add("Python");
		list2.add("Ruby");
		list2.add("Perl");
		
		list1=removeElement(list1,list2);
		System.out.println("After removal: "+ list1);
		
		
	}

}

// Output = After removal: [Java, Python, Ruby, Perl]
