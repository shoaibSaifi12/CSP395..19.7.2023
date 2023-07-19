import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistTest {
public static void main(String[] args) {
	List<Integer> List = new LinkedList();
	List.add(10);
	List.add(12);
	List.add(14);
	
	for(Integer O:List)
		{
		System.out.println(O+1);

		}				
}
}
