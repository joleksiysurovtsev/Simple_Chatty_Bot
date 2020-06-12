import java.util.Scanner;

public class Main {

	public static boolean isVowel (char ch) {
		boolean x = false;
		char[] masch = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
		for (int i = 0; i < masch.length - 1; i++) {
			if (masch[i] == ch){x = true;}
		}return x;
	}

	/* Do not change code below */
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		System.out.println(isVowel(letter) ? "YES" : "NO");
	}
}