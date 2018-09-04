import java.util.*;

public class Calculation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int addition = add(number1, number2);
		int subtraction = subtract(number1, number2);
		int multiplication = multiply(number1, number2);
		System.out.println("Result =" + addition);
		System.out.println("Result =" + subtraction);
		System.out.println("Result =" + multiplication);

	}

	static int add(int num1, int num2) {
		int addition = num1 + num2;
		return addition;

	}

	static int subtract(int num1, int num2) {
		int subtraction = num1 - num2;
		return subtraction;
	}

	static int multiply(int num1, int num2) {
		int multiplication = num1 * num2;
		return multiplication;

	}

}
