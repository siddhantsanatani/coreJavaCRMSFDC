//Create a method that accepts a number and modifies it such that the each of the digit
//in the newly formed number is equal to the difference between two consecutive digits
//in the original number. The digit in the units place can be left as it is.
package strings.parsing;

import java.util.Scanner;

public class NumberModify {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		final int input = sc.nextInt();
		System.out.println("Modifyied number is :" + modifyNumber(input));
		sc.close();
	}

	public static int modifyNumber(int number1) {

		final String str = Integer.toString(number1);
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char c, c1;
			int num, num1 = 0, diff = 0;
			c = str.charAt(i);
			num = Character.getNumericValue(c);

			if (i < str.length() - 1) {
				c1 = str.charAt(i + 1);
				num1 = Character.getNumericValue(c1);
				diff = Math.abs(num1 - num);
			} else {
				diff = num;
			}

			sb = sb.append(diff);
			final String s = sb.toString();
			number1 = Integer.parseInt(s);
		}
		return number1;
	}
}