/*Модифицируйте программу Калькулятор:
реализуйте дополнительный класс CalculatorTest, перенеся в него метод main
класс Calculator будет отвечать за проверку знака и мат. вычисления
для проверки знака математической операции воспользуйтесь оператором switch
для ввода мат. выражения используйте клавиатуру (класс Scanner)
формат ввода математического выражения:
Введите первое число: 2
Введите знак математической операции: ^
Введите второе число: 10*/

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char mathOperation;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getMathOperation() {
		return mathOperation;
	}

	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}

	public void answerCalculator() {
		switch (mathOperation) {
			case '+':
				System.out.println("Сумма чисел равна: " + (firstNumber + secondNumber));
				break;
			case '-':
				System.out.println("Разность чисел равна: " + (firstNumber - secondNumber));
				break;
			case '*':
				System.out.println("Произведение чисел равно: " + (firstNumber * secondNumber));
				break;
			case '/':
				switch (secondNumber) {
					case 0:
						System.out.println("На ноль делить нельзя!");
						break;
					default:
						System.out.println("Частное чисел равно: " + (firstNumber / secondNumber));
				}
				break;
			case '^':
				switch (secondNumber) {
					case 0:
						System.out.println("Результат возведения первого числа в степень равную второму числу: 1");
						break;
					default:
						int numToPower = 1;
						for (int i = 0; i < secondNumber; i++) {
						numToPower *= firstNumber;
						}
						System.out.println("Результат возведения первого числа в степень равную второму числу: " + (numToPower));
				}
				break;
			case '%':
				switch (secondNumber) {
					case 0:
						System.out.println("На ноль делить нельзя!");
						break;
					default:
						System.out.println("Результат деления по модулю первого числа на второе число равен: " + (firstNumber % secondNumber));
				}
		}
	}
}

