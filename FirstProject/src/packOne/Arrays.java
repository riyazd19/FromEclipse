package packOne;

public class Arrays {

	public static void main(String[] args) {
		int[] numbers= {10,0,-43,89,67,8,12,-14};
		System.out.println(numbers.length);
		int sum=0;
		for(int number: numbers) {
			sum +=number;
		}
		System.out.println(sum);

	}

}
