import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int nat = 1;
		int kv = 1;
		while (kv <= max) {
			nat++;
			System.out.println(kv);
			kv = nat * nat;
			if (kv> max) {
				break;
			}

		}
	}
}