import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        ArrayList<Integer> arr = new ArrayList<>( );
        while (sc.hasNextInt( )) {
            arr.add( sc.nextInt( ) );
            if (arr.get( arr.size( ) - 1 ) == 0) {
                break;
            }
        }

        for (int i = 0; i < arr.size( ) - 1; i++) {
            if (arr.get( i ) % 2 == 0) {
                System.out.println( "even" );
            } else {
                System.out.println( "odd" );
            }
        }
    }
}