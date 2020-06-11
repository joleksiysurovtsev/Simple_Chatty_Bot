import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int newAdd;
		do {
			newAdd = sc.nextInt();
			sum += newAdd;

		} while (newAdd != 0);
		System.out.println(sum);
	}
}