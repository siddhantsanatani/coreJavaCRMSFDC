package collection.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumSquare {

	public static Map<Integer, Integer> getSquares(int[] array) {
		final Map<Integer, Integer> map = new HashMap<>();

		for (final int n : array) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		final ArrayList<Integer> numList = new ArrayList<>();
		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with a comma separated:");
		final String st = sc.nextLine();
		final StringTokenizer numToken = new StringTokenizer(st, ",");
		while (numToken.hasMoreTokens()) {
			final String temp = numToken.nextToken();
			final int i = Integer.parseInt(temp);
			numList.add(i);
		}
		final int[] array = numList.stream().mapToInt(Integer::intValue).toArray();
		final Map<Integer, Integer> map = getSquares(array);

		final Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			final Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		sc.close();
	}
}