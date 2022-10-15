package packOne;

import java.util.Scanner;

public class Febo {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("enter the value for x");
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		for(int i=1;i<=x;i++) {
			fact=fact*i;
			System.out.println(x);
		}
		System.out.println();
		

	}

}
