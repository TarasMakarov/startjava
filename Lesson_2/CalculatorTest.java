/*Модифицируйте программу Калькулятор:
реализуйте дополнительный класс CalculatorTest, перенеся в него метод main
класс Calculator будет отвечать за проверку знака и мат. вычисления
для проверки знака математической операции воспользуйтесь оператором switch
для ввода мат. выражения используйте клавиатуру (класс Scanner)
формат ввода математического выражения:
Введите первое число: 2
Введите знак математической операции: ^
Введите второе число: 10*/

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.print("Введите первое число: ");
		Scanner scanNumberOne = new Scanner(System.in);
		calculator.setFirstNumber(scanNumberOne.nextInt());
		System.out.print("Введите знак математической операции: ");
		Scanner scanMatnOperation = new Scanner(System.in);
		calculator.setMathOperation(scanMatnOperation.next().charAt(0));
		System.out.print("Введите второе число: ");
		Scanner scanNumberTwo = new Scanner(System.in);
		calculator.setSecondNumber(scanNumberTwo.nextInt());

		calculator.answer();
	}
}