package flowcontrol;

import java.util.Scanner;

/*
 * Exercise 4: Write a Java program that prompts the user for an integer and
 * then prints out all
 * the prime numbers up to that Integer?
 *
 */
public class PrimeNumberUptoN {

	static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

	// Function to print primes
	static void primeNums(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		System.out.println("Enter the number upto which you want prime numbers");
		final int n = in.nextInt();

		primeNums(n);
		in.close();
	}
}