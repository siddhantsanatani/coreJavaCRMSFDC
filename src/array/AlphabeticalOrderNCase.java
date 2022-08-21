package array;

import java.util.Arrays;
import java.util.Scanner;

// Main class
class AlphabeticalOrderNCase {

	// Main driver method
	public static void main(String[] args) {
		// Custom string input
		int n;
		final Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();

		final String[] arr = new String[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		print2Smallest(arr);
		sc.close();
	}

	private static void print2Smallest(String[] arr) {
		final int n = arr.length;
		int middle = 0;
		if (n % 2 == 0) {
			middle = n / 2;
		} else {
			middle = (n + 1) / 2;
		}

		// logic for sorting
		for (int i = 0; i < n; i++) // Holds each element
		{
			for (int j = i + 1; j < n; j++) // Check for remaining elements
			{
				// compares each elements of the array to all the remaining elements
				if (arr[i].compareTo(arr[j]) > 0) {
					// swapping array elements
					final String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i < middle) {
				arr[i] = arr[i].toUpperCase();
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}
		// prints the sorted array in alphabetical order
		System.out.println(Arrays.toString(arr));

	}
}
