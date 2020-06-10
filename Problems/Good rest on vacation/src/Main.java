import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        /*
        продолжительность в днях
        общая стоимость еды в день
        стоимость перелета в одну сторону
        стоимость одной ночи в отеле (количество ночей равно продолжительности минус один) */

        int dDay = scanner.nextInt( );
        int costOfFood = scanner.nextInt( );
        int costOneWayF = scanner.nextInt( );
        int costOneNight = scanner.nextInt( );

        int x = (costOfFood * dDay) + (costOneWayF * 2) + (costOneNight * (dDay - 1));
        System.out.println( x );

    }
}