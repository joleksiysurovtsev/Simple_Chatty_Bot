import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;

		int l = sc.nextInt();
		int lc = 0;
		while (lc < l) {
			int k = sc.nextInt();
			if (k % 4 == 0 && k > max) {
				max = k;
			}
			lc++;
		}


		System.out.println(max);
	}
}