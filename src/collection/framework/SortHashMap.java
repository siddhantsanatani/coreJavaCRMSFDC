package collection.framework;

//Java program to sort hashmap by values
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortHashMap {

	// function to sort hashmap by values
	public static List<Map.Entry<String, Integer>> sortByValue(Map<String, Integer> hm) {
		// Create a list from elements of HashMap
		final List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());

		// Sort the list
		Collections.sort(list, Comparator.comparing(Entry::getValue));

		// put data from sorted list to hashmap
		final HashMap<String, Integer> temp = new LinkedHashMap<>();
		for (final Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return list;
	}

	// Driver Code
	public static void main(String[] args) {

		final HashMap<String, Integer> hm = new HashMap<>();
		final Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			final Integer a = in.nextInt();
			final String b = in.next();

			hm.put(b, a);
		}

		for (final Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		final List<Entry<String, Integer>> hm1 = sortByValue(hm);

//		// print the sorted hashmap
		for (final Entry<String, Integer> en : hm1) {
			System.out.println("Key = " + en.getKey() + " Value = " + en.getValue());
		}
		in.close();
	}
}
