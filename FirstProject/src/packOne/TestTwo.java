package packOne;

import java.util.Scanner;

public class TestTwo {
	public static void main(String[] args) {
		System.out.println("enter the value for array");
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		int[] arr = new int[n];
		fun(arr);
		fun2(arr);
		fun3(arr);
		scan.close();
	}

	private static void fun3(int[] arr) {
		System.out.println("this method returns the higest value in Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					System.out.println(arr[i]);
				}
				//System.out.println();
			}
		}
		
	}

	private static void fun2(int[] arr) {
		System.out.println("displaying the value of array in this method");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
	}

	private static void fun(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("now in this function we are entering the value in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();		
			}
		scan.close();
	}
}
