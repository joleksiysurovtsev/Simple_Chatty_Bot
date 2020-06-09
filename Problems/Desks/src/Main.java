import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		System.out.println(outPrint(x1,x2,x3));

	}

	public static int outPrint (int x, int y, int z) {
		int f1,f2,f3;
		if (x % 2 == 0) {
			f1 = x / 2;
		} else {
			 f1 = ((x / 2) + 1);
		}

		if (y % 2 == 0) {
			 f2 = y/2;
		} else {
			 f2 = ((y / 2) + 1);
		}

		if (z % 2 == 0) {
			 f3 = z/2;
		} else {
			 f3 = ((z / 2) + 1);
		}
		return f1 + f2 + f3;
	}
}