import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt( );
        int b = sc.nextInt( );


        int min = 0, max = 0;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double rez = (double) sum / (double) count;
        System.out.println( rez );
    }
}