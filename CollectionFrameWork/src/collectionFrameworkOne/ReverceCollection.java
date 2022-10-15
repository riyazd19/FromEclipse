package collectionFrameworkOne;

import java.util.ArrayList;
import java.util.Collections;

public class ReverceCollection {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		System.out.println("list before revercing " +list1);
		Collections.reverse(list1);
		System.out.println(list1);

	}

}
