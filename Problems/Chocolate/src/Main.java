import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );
        int m = sc.nextInt( );
        int k = sc.nextInt( );

        if (k % n == 0 || k % m == 0) {
            if (n % 2 == 0 && m % 2 == 0) {
                if (k <= n * m && k % 2 == 0) {
                    System.out.println( "YES" );
                } else {
                    System.out.println( "NO" );
                }
            } else {
                if (k <= n * m && k % 2 != 0) {
                    System.out.println( "YES" );
                } else {
                    System.out.println( "NO" );
                }
            }
        } else {
            System.out.println( "NO" );
        }
    }
}