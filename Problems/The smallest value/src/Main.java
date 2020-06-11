import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		int count = 0;
		int umn = 0;
		long rez = 1;
		do {
			umn++;
			rez *= umn;
		}while (rez < m);
		System.out.println(rez);
		System.out.println(umn-1);

//
//		//System.out.println(m);
//		long rez = 1;
//
//		int schek = 0;
//		while (true) {
//			rez *= count++;
//			if (rez>=m){break;}
//			schek++;
//		}
//		System.out.println(schek);
	}
}