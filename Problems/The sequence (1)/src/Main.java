import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;


        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (count == n) {
                    break;
                }
                count++;
                System.out.print(i + " ");
            }
        }
    }
}
