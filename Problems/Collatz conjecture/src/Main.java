import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		do {
//			System.out.print(n+" ");
//			if (n % 2 == 0) {
//				n /= 2;
//			} else {
//				n = (n * 3) + 1;
//			}
//
//		} while (n != 1);
//		System.out.println(n);


		while (n != 1) {
			System.out.print(n + " ");
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (n * 3) + 1;
			}
		}
		System.out.print(n + " ");
	}
}