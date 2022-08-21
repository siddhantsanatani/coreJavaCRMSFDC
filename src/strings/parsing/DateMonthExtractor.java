package strings.parsing;

import java.time.LocalDate;
import java.time.Month;

class DateMonthExtractor {

	// Function to get day, month, and
	// year from date
	public static void getDayMonthYear(String date) {

		// Get an instance of LocalTime
		// from date
		final LocalDate currentDate = LocalDate.parse(date);

		// Get day from date
		final int day = currentDate.getDayOfMonth();

		// Get month from date
		final Month month = currentDate.getMonth();

		// Get year from date
		final int year = currentDate.getYear();

		// Print the day, month, and year
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}

	// Driver Code
	public static void main(String args[]) {
		// Given Date
		final String date = "2020-07-18";

		// Function Call
		getDayMonthYear(date);
	}
}
