import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListManager2 {
	
	public static List getArrayList(String[] arr) {
		
		List<String> lst=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			lst.add(arr[i]);
		}
		
		Collections.sort(lst);
		return lst;
	}
	public static void main(String[] args) {
		
		String [] str= {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
		
		List list1=getArrayList(str);
		System.out.println(list1);

	}

}

//Output = [Apr, Aug, Dec, Feb, Jan, July, Jun, Mar, May, Nov, Oct, Sept]
