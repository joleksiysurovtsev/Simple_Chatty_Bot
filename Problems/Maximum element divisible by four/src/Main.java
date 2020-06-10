import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int max = 0;
        for (int x = 0, i = sc.nextInt( ); x < i; x++) {
            int k = sc.nextInt( );
            if (k % 4 == 0 && k > max) {
                max = k;
            }
        }
        System.out.println( max );
    }
}