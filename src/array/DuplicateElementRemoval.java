package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

class DuplicateElementRemoval {
	public static void removeDuplicates(int[] a) {
		final LinkedHashSet<Integer> set = new LinkedHashSet<>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		// Convert LinkedHashSet to an ArrayList
		final ArrayList<Integer> array = new ArrayList<>(set);

		// sort & reverse ArrayList
		Collections.sort(array);
		Collections.reverse(array);

		// Print the elements of LinkedHashSet
		System.out.print(array);
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
		// Function call
		removeDuplicates(arr);
		sc.close();
	}
}
