import java.util.Scanner;

public class Main {

	public static long factorial (long n) {
		long fact = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int i = 1; i < n+1 ; i++) {
				fact *= i;
			}
			return fact;
		}
	}

	/* Do not change code below */
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = Integer.parseInt(scanner.nextLine().trim());
		System.out.println(factorial(n));
	}
}