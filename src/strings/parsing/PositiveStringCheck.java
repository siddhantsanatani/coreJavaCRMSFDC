package strings.parsing;

import java.util.Scanner;

public class PositiveStringCheck {
	static boolean alphabeticalOrder(String str) {
		final int strLength = str.length();
		for (int i = 1; i < strLength; i++) {
			if (str.charAt(i) < str.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	static public void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		final String str = sc.next();
		if (alphabeticalOrder(str)) {
			System.out.println("String is an Incease string");
		} else {
			System.out.println("String is not an Incease string\"");
		}
		sc.close();
	}
}