package collectionFrameworkOne;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("auqib");
		student.add("ded");
		student.add("ddcc");
		student.add("ddccdcccd");
		student.add("ddcccdcsa");
		student.add("ddccaaa");
		student.add("ddcqqswc");
		for(int i=0;i<student.size();i++) {
			System.out.println("elements in array are " + student.get(i));
		}
		fun(student);
		

	}

	private static void fun(ArrayList<String> student) {
		System.out.println("check for the palendrome");
		
	}

}
