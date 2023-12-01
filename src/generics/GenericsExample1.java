package generics;
import java.util.*;
public class GenericsExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(100);
		//list1.add("abc"); This will throw error
		int i=list1.get(1);
		System.out.println("Value is "+i);
		
//		Iterator<Integer> itr = list1.iterator();
//		while(itr.hasNext()) {
//			System.out.println("list1[0] is "+itr.next());
//			System.out.println("list1[1] is "+itr.next());
//		}
		
		for(int j=0;j<list1.size();j++)
		{
			System.out.println("list1[0] is "+list1.get(j));
			
		}

	}

}
