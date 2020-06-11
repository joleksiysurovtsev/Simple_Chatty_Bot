import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        ArrayList<Integer> arr = new ArrayList<>( );

        //array filling
        while (sc.hasNextInt( )) {
            arr.add( sc.nextInt( ) );
            if (arr.get( arr.size( ) - 1 ) == 0) {
                break;
            }
        }

        boolean flag = true;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.size( ) - 2; i++) {
            if (arr.get( i ) <= arr.get( i + 1 )) {
                count1++;
                continue;
            }
            if (arr.get( i ) >= arr.get( i + 1 )) {
                count2++;
                continue;
            }
        }
        if (count1 > 0 && count2 > 0) {
            flag = false;
        }
        System.out.println( flag );
    }
}