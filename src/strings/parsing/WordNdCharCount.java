package strings.parsing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordNdCharCount {
	static void count(String line) {
		String[] wordsRegex = null;
		// final Matcher wordsRegexMatcher = Pattern.compile("([\\w])").matcher(line);
		final Matcher sentenceRegexMatcher = Pattern.compile("([\\w\\d\\s])+([!?.])").matcher(line);

		if (line != null) {
			if (line.equals("")) {
				System.out.println("Enter a valid input");
				System.exit(0);
			} else {
				wordsRegex = line.split("\\s");
			}
		}
		System.out.println("Total word count = " + wordsRegex.length);
		// System.out.println("Total Regex word count = " +
		// wordsRegexMatcher.groupCount());
		System.out.println("Total number of sentences = " + (sentenceRegexMatcher.groupCount() + 1)); // sentences.length);
		System.out.println("Total number of characters = " + line.length());
		// System.out.println("Number of paragraphs = " + paraCount);
	}

	public static void main(String[] args) {
		System.out.println("Enter the text");
		final Scanner sc = new Scanner(System.in);
		final String str = sc.nextLine();
		sc.close();
		count(str);
	}
}