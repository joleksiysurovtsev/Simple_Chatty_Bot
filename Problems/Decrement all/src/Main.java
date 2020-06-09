import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x1 = scanner.next();
        String x2 = scanner.next();
        String x3 = scanner.next();
        String x4 = scanner.next();
        int f1 = Integer.parseInt(x1);
        int f2 = Integer.parseInt(x2);
        int f3 = Integer.parseInt(x3);
        int f4 = Integer.parseInt(x4);
        f1 = --f1;
        f2 = --f2;
        f3 = --f3;
        f4 = --f4;
        System.out.println(f1 +" "+f2 +" "+f3 +" "+f4 );
    }
}