import java.util.Scanner;

class Main {

	public static long factorial (long n) {
		long fact = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int i = 1; i < n + 1; i++) {
				fact *= i;
			}
			return fact;
		}
	}


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		int count = 0;
		if (m == 0) {
			count = 1;
		} else {
			for (int i = 0; i > -1; i++) {
				if (factorial(i) <= m) {
					//System.out.println(i);
					count++;
				} else break;
			}
		}
		System.out.println(count);
	}
}