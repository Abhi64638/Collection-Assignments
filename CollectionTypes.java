import java.util.*;

public class CollectionTypes 
{
	public static void main(String[] args) 
	{
		Queue<String> x = new LinkedList<>();
		x.add("one");
		x.add("two");
		x.add("one");
		
		System.out.println(x.poll());
	}
}

// Output = one