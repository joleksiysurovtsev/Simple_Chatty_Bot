import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(changeStr(input));

	}

	public static String changeStr (String x) {
		String z = x.replace('a', 'b');
		return z;
	}
}

