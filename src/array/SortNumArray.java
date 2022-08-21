package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortNumArray {

	// Function to return the
	// reverse of n
	static int reversDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	// Function to sort the array according
	// to the reverse of elements
	static void sortArr(int arr[], int n) {

		// Vector to store the reverse
		// with respective elements
		final ArrayList<int[]> vp = new ArrayList<>();

		// Inserting reverse with elements
		// in the vector pair
		for (int i = 0; i < n; i++) {
			vp.add(new int[] { reversDigits(arr[i]), arr[i] });
		}

		// Sort the vector, this will sort the pair
		// according to the reverse of elements
		Collections.sort(vp, (a, b) -> a[0] - b[0]);

		// Print the sorted vector content
		for (int i = 0; i < vp.size(); i++) {
			System.out.print(vp.get(i)[0] + " ");
		}
	}

	// Driver code
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
		sc.close();

		sortArr(arr, n);
	}

}
