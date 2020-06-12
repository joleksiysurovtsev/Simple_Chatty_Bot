import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		int cas = 0;
		int a,b;
		long x,y;
		String firstNumber,secondNumber;

		if (expression.contains("+")) {
			cas = 1;
		}

		if (expression.contains("-")) {
			cas = 2;
		}

		if (expression.contains("/")) {
			cas = 3;
		}

		if (expression.contains("*")) {
			cas = 4;
		}


		switch (cas) {
			case 1:
				 a = expression.indexOf("+");
				 b = expression.length();
				 firstNumber = expression.substring(0,a);
				 secondNumber = expression.substring(a+1,b);
				 x = Long.parseLong(firstNumber.trim());
				 y = Long.parseLong(secondNumber.trim());
				System.out.println(x+y);
				break;
			case 2:
				 a = expression.indexOf("-");
				 b = expression.length();
				 firstNumber = expression.substring(0,a);
				 secondNumber = expression.substring(a+1,b);
				 x = Long.parseLong(firstNumber.trim());
				 y = Long.parseLong(secondNumber.trim());
				System.out.println(x-y);
				break;
			case 3:
				a = expression.indexOf("/");
				b = expression.length();
				 firstNumber = expression.substring(0,a);
				 secondNumber = expression.substring(a+1,b);
				x = Long.parseLong(firstNumber.trim());
				y = Long.parseLong(secondNumber.trim());
				if (y==0){
					System.out.println("Division by 0!");
					break;
				}
				System.out.println(x/y);
				break;
			case 4:
				a = expression.indexOf("*");
				b = expression.length();
				firstNumber = expression.substring(0,a);
				secondNumber = expression.substring(a+1,b);
				x = Long.parseLong(firstNumber.trim());
				y = Long.parseLong(secondNumber.trim());
				System.out.println(x*y);
				break;
			default:
				System.out.println("Unknown operator");
		}


	}
}