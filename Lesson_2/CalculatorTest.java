import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);
		String answer = "";

		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(input.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setMathOperation(input.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(input.nextInt());
			calculator.calculate();

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = input.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (answer.equals("yes"));
	}
}


