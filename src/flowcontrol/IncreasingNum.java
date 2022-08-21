package flowcontrol;

import java.util.Scanner;

public class IncreasingNum {
	static boolean increasingNum(int n) {
		int temp = n;
		int dig = temp % 10;
		temp = temp / 10;
		boolean flag = true;

		while (temp > 0) {
			if (dig <= temp % 10) {
				flag = false;
				break;
			}
			dig = temp % 10;
			temp = temp / 10;
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.print("Enter a number to check - ");
		final Scanner scan = new Scanner(System.in);// Taking input from user
		final int num = scan.nextInt();

		if (increasingNum(num)) {
			System.out.println(num + " digits are in ascending order.");
		} else {
			System.out.println(num + " digits are not in ascending order");
		}
		scan.close();
	}
}