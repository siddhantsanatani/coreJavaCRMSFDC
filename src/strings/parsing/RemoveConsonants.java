//Create a method which accepts a String and replaces all the consonants in the String with the next alphabet.
package strings.parsing;

import java.util.Scanner;

public class RemoveConsonants {
	public static boolean isEqualIngoreCase(char one, char two) {
		return Character.toLowerCase(one) == Character.toLowerCase(two);
	}

	public static String replaceConsonants(String str) {
		final StringBuilder sbr = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			final Character c = sbr.charAt(i);
			if (!(isEqualIngoreCase(c, 'A') || isEqualIngoreCase(c, 'I') || isEqualIngoreCase(c, 'O')
					|| isEqualIngoreCase(c, 'U') || isEqualIngoreCase(c, 'E'))) {
				sbr.replace(i, i + 1, String.valueOf((char) (c + 1)));
			}
		}
		return sbr.toString();
	}

	public static void main(String[] ar) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		final String str = sc.next();
		System.out.println(replaceConsonants(str));
		sc.close();
	}
}