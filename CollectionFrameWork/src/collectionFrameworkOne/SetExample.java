package collectionFrameworkOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> a= new HashSet<Integer>();
		a.addAll(Arrays.asList( new Integer[]{1,3,4,5,2,34,44}));
		System.out.println(a);
		

	}

}
