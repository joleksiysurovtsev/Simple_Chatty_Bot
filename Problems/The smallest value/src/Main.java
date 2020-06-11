import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        long m = sc.nextLong( );
		long count = 0;
        long x = 1;
		long y = 1;
        while (m > x) {
            x *= y;
            ++y;
            ++count;
        }
		System.out.println( count );
    }
}