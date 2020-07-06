import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		solveExample();
	}

	public static void solveExample() {
	Calculator calculator = new Calculator();
	Scanner input = new Scanner(System.in);
	System.out.print("Введите первое число: ");
	calculator.setFirstNumber(input.nextInt());
	System.out.print("Введите знак математической операции: ");
	calculator.setMathOperation(input.next().charAt(0));
	System.out.print("Введите второе число: ");
	calculator.setSecondNumber(input.nextInt());

	calculator.calculate();

	askUser();
	}

	public static void askUser() {
		System.out.print("Хотите продолжить? [да/нет]: ");
		Scanner input = new Scanner(System.in);
		switch (input.nextLine()) {
			case "да":
				solveExample();
			case "нет":
				break;
			default:
				askUser();
		}
	}
}



/*CalculatorTest
а зачем тебе еще один класс CalculatorSolution? Какую задачу он решает? Делай все в CalculatorTest

достаточно создать один экземпляр класса Scanner на весь класс
*/

