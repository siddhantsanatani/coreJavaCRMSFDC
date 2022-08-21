//Write a Java program that reads a line of integers
//and then displays each integer and the sum of all integers.
//(Use StringTokenizer class)?
package strings.parsing;

import java.util.Scanner;
import java.util.StringTokenizer;

class StringTokenDemoIntegerAndSum {
	public static void main(String args[]) {
		int n;
		int sum = 0;
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		final String s = sc.nextLine();
		final StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			final String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}
}