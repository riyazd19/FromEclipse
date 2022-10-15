package collectionFrameworkOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnteringFromForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> al1= new ArrayList(List.of(3,5,2,3,5,7,45,6,78,4,5,753,2,4,67,2,35));
		System.out.println("before Sorting");
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("after sorting");
		System.out.println(al1);

	}

}
