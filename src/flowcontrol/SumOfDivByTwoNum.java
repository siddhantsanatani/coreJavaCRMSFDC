package flowcontrol;

import java.util.Scanner;

class SumOfDivByTwoNum {

	static int sumOfDivByTwoNum(int N) {
		int S1, S2, S3;

		S1 = N / 3 * (2 * 3 + (N / 3 - 1) * 3) / 2;
		S2 = N / 5 * (2 * 5 + (N / 5 - 1) * 5) / 2;
		S3 = N / 15 * (2 * 15 + (N / 15 - 1) * 15) / 2;

		return S1 + S2 - S3;
	}

	public static void main(String[] args) {
		int input = 0;

		final Scanner in = new Scanner(System.in);
		input = Integer.parseInt(in.nextLine());

		System.out.print(sumOfDivByTwoNum(input));
		in.close();
	}

}
