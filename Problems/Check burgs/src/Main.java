import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine();
        if (site.endsWith("burg")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}