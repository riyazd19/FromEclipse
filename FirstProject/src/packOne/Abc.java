package packOne;

public class Abc {

	public static void main(String[] args) {
	add();
	add(4,5);
	add(8,9);
	

	}

	private static void add(int i, int j) {
		int z=i+j;
		System.out.println("the secon function "+z);
		
	}

	private static void add() {
		int x=10, y=14;
		System.out.println("add the following numbers");
		int z=x+y;
		System.out.println("the addition of the above two no is " +z);
		
	}
	

}
