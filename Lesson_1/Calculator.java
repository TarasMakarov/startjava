public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 0;
		char operation = '+';

		if (operation == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		}
		
		operation = '-';
		if (operation == '-') {
			System.out.println("Разность a и b равна: " + (a - b));
		}

		operation = '*';
		if (operation == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		}

		operation = '/';
		if (b != 0 && operation == '/') {
			System.out.println("Частное a и b равно: " + (a / b));
		}
		if (b == 0) {
			System.out.println("На ноль делить нельзя!");
		}

		int numToPower = 1;
		operation = '^';
		if (operation == '^') {
			for (int i = 0; i < b; i++) {
				numToPower *= a;
			}
			System.out.println("Результат возведения числа a в степень b равен: " + (numToPower));
		}

		operation = '%';
		if (b != 0 && operation == '%') {
			System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
		}
		if (b == 0) {
			System.out.println("На ноль делить нельзя!");
		}
	} 
}