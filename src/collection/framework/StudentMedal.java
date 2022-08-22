package collection.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMedal {
	public static Map<String, String> getStudent(Map<String, Integer> stu) {
		final HashMap<String, String> medal = new HashMap<>();
		final Set<String> set = stu.keySet();
		for (final String s : set) {
			final Integer marks = stu.get(s);
			if (marks >= 90) {
				medal.put(s, "Gold");
			} else if (marks >= 80) {
				medal.put(s, "Silver");
			} else if (marks >= 70) {
				medal.put(s, "Bronze");
			}
		}
		return medal;
	}

	public static void main(String[] ar) {
		final HashMap<String, Integer> stu = new HashMap<>();
		System.out.println("Enter the number of students");
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter roll number of the student: ");
			final String roll = in.next();
			System.out.print("Enter mark of the student: ");
			final Integer mark = in.nextInt();

			stu.put(roll, mark);
		}

		System.out.println(getStudent(stu));
		in.close();
	}
}