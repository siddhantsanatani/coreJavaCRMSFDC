package flowcontrol;

import java.util.Scanner;

class PowerOfTwo {
	static boolean isPowerOfTwo(int n) {
		return (int) Math.ceil(Math.log(n) / Math.log(2)) == (int) Math.floor(Math.log(n) / Math.log(2));
	}

	public static void main(String[] args) {
		System.out.print("Enter a number to check - ");
		final Scanner scan = new Scanner(System.in);
		final int num = scan.nextInt();
		if (isPowerOfTwo(num)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();

	}
}
