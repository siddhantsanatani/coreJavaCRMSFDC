package flowcontrol;

class Fibonacci {
	static int fibRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibRecursive(n - 1) + fibRecursive(n - 2);
	}

	static int fibNonRecursive(int n) {
		final int[] f = new int[n + 2];
		int i;

		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public static void main(String[] args) {
		final int n = 9;
		System.out.println("Ans by recursive method " + fibRecursive(n));
		System.out.println("Ans by non recursive method " + fibNonRecursive(n));
	}
}