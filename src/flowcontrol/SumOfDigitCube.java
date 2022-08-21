package flowcontrol;

import java.util.Scanner;

class SumOfDigitCube {
	public static void main(String[] args) {
		int input = 0;

		System.out.println("Enter a Number");
		final Scanner console = new Scanner(System.in);
		input = Integer.parseInt(console.nextLine());
		int number = input; // number is a temp variable
		int sum = 0;
		while (number > 0) {
			final int digit = number % 10;
			sum += digit * digit * digit;
			number /= 10;
		}
		System.out.println(sum);
		console.close();

	}
}