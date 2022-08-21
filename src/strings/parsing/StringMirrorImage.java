//Create a class containing a method to create the mirror image of a String.
//The method should return the two Strings separated with a pipe(|) symbol .
package strings.parsing;

import java.util.Scanner;

public class StringMirrorImage {

	public static String getImage(String str) {
		final StringBuilder sbr = new StringBuilder(str);
		sbr.append('|');
		final StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] ar) {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		final String str = sc.next();
		System.out.println(getImage(str));
		sc.close();
	}
}