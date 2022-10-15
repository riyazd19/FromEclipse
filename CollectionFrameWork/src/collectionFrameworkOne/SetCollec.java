package collectionFrameworkOne;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollec {

	public static void main(String[] args) {
		Set<Integer> data= new LinkedHashSet<>();
		data.add(13);
		data.add(12);
		System.out.println(data);
		data.remove(12);
		System.out.println(data);
		data.add(22);
		System.out.println(data);
	}

}
