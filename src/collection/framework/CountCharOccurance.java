package collection.framework;

import java.util.HashMap;
import java.util.Map;

class CountCharOccurance {
	static void countChars(char[] arr) {
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		final HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Converting given string to char array

		// char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (final char c : arr) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (final Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// Driver Code
	public static void main(String[] args) {
		final char[] str = { 'e', 't', 'e', 'a', 'c', 't' };
		countChars(str);
	}
}
