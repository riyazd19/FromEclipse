package collectionFrameworkOne;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(List.of(22,33,1,2,3,3,1));
		ArrayList<Integer> al2= new ArrayList<Integer>(List.of(33,4,3,1,2,444,122));
		System.out.println(al2);
		System.out.println(al2.addAll(al1));
		//al1.add(2,23);
		//al1.addAll(al2);
		//System.out.println(al1);
		//al2.retainAll(al2);
		//System.out.println(al2);
	}

}
