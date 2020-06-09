import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		boolean second = scanner.nextBoolean();

		if (second) {
			if (first >= 15 && first <= 25) {
				System.out.println(true);
			} else System.out.println(false);
		} else {
			if (first >= 10 && first <= 20) {
				System.out.println(true);
			}else System.out.println(false);
		}



	}
}