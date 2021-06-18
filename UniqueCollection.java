import java.util.Set;
import java.util.TreeSet;

public class UniqueCollection {
	
	public static Set getCollection(String[] arr)
	{
		Set<String> str=new TreeSet<>();
		
		for(int i=0; i<arr.length;i++)
		{
			str.add(arr[i]);
		}
		return str;
	}

	public static void main(String[] args) {
		
		String[] arr= {"Jan","Feb","Mar","Dec","May","Jan","Mar","Nov","Dec"};
		
		Set st=getCollection(arr);
		System.out.println(st);

	}

}

//Output = [Dec, Feb, Jan, Mar, May, Nov]