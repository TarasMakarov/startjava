public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 4;
		char operation = '+';
		if (operation == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		} else {
			System.out.println("Разность a и b равна: " + (a - b));
		}
		
		operation = '-';
		if (operation == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		} else {
			System.out.println("Разность a и b равна: " + (a - b));
		}

		operation = '*';
		if (operation == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		} else {
			System.out.println("Частное a и b равно: " + (a / b));
		}

		operation = '/';
		if (operation == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		} else {
			System.out.println("Частное a и b равно: " + (a / b));
		}

		int numToPower = a;
		operation = '^';
		if (operation == '^') {
			for (int i = 1; i < b; i++) {
				numToPower = numToPower * a;
			}
			System.out.println("Результат возведения числа a в степень b равен: " + (numToPower));
		} else {
			System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
		}

		operation = '%';
		if (operation == '^') {
			for (int i = 0; i < b; i++) {
				numToPower = numToPower * a;
			}
			System.out.println("Результат возведения числа a в степень b равен: " + (numToPower));
		} else {
			System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
		}
	} 
}