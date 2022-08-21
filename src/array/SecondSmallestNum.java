package array;

import java.util.Scanner;

class SecondSmallestNum {
	/*
	 * Function to print first smallest and second smallest elements
	 */
	static void secondSmallest(int[] arr) {
		int first = arr[0];
		int second = 0;
		final int arr_size = arr.length;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		for (int i = 0; i < arr_size; i++) {
			if (arr[i] <= first) {
				second = first;
				first = arr[i];
			}

//			If arr[i] is in between first and second then update second
			else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == 0) {
			System.out.println("There is no second" + "smallest element");
		} else {
			System.out.println("The second Smallest element is " + second);
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int n;
		final Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();

		final int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		secondSmallest(arr);
		sc.close();
	}
}
