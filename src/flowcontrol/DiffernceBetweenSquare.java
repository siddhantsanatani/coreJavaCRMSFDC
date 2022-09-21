package flowcontrol;

import java.util.Scanner;

public class DiffernceBetweenSquare {

	static int sqrOfSumFirstN(int n) {
		final int sumN = n * (n + 1) / 2;
		final int sumNSqr = sumN * sumN;
		System.out.println("Sum of first " + n + " number: " + sumN);
		System.out.println("Square of sum of first " + n + " number: " + sumNSqr);
		return sumNSqr;
	}

	static int sumFirstNsquares(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		System.out.println("Sum of squares of first " + n + " numbers: " + sum);
		return sum;
	}

	public static int sumDifference(int n) {

		return sumFirstNsquares(n) - sqrOfSumFirstN(n);
	}

	public static void main(String[] args) {

		System.out.println("Enter the number");
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		final int ans = sumDifference(n);
		System.out.println(ans);
		in.close();
	}
}