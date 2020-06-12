package bot;

import java.util.Scanner;

public class SimpleBot {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! My name is Aid.");
		System.out.println("I was created in 2018.");
		System.out.println("Please, remind me your name.");

		String name = scanner.nextLine();

		System.out.println("What a great name you have, " + name + "!");
		System.out.println("Let me guess your age.");
		System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

		int rem3 = scanner.nextInt();
		int rem5 = scanner.nextInt();
		int rem7 = scanner.nextInt();

		int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

		System.out.println("Your age is " + age + "; that's a good time to start programming!");
		System.out.println("Now I will prove to you that I can count to any number you want.");

		// read a number and count to it here
		System.out.println("0!");
		System.out.println("1!");
		System.out.println("2!");
		System.out.println("3!");
		System.out.println("4!");
		System.out.println("5!");
		System.out.println("6!");
		System.out.println("7!");
		System.out.println("8!");
		System.out.println("9!");
		System.out.println("10!");
		System.out.println("Let's test your programming knowledge.");
		System.out.println("Why do we use methods?");
		System.out.println("1. To repeat a statement multiple times.");
		System.out.println("2. To decompose a program into several small subroutines.");
		System.out.println("3. To determine the execution time of a program.");
		System.out.println("4. To interrupt the execution of a program.");

		while (true) {
			if (scanner.nextInt() == 2) {
				System.out.println("super you go to the next round");
				break;
			} else System.out.println("Please, try again.");
		}


		System.out.println("What is the return type of a method that does not return a value?");
		System.out.println("1. none.");
		System.out.println("2. nothing.");
		System.out.println("3. null.");
		System.out.println("4. int.");
		System.out.println("5. void.");

		while (true) {
			if (scanner.nextInt() == 5) {
				System.out.println("Congratulations, have a nice day!");
				break;
			} else System.out.println("Please, try again.");
		}


	}
}
