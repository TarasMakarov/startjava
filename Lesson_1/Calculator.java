public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 5;
		char operation = '%';

		if (operation == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		} else if (operation == '-') {
			System.out.println("Разность a и b равна: " + (a - b));
		} else if (operation == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		} else if (operation == '/') {
			if (b != 0) {
				System.out.println("Частное a и b равно: " + (a / b));
			} else {
				System.out.println("На ноль делить нельзя!");
			}
		} else if (operation == '^') {
			int numToPower = 1;
			for (int i = 0; i < b; i++) {
				numToPower *= a;
			}
			System.out.println("Результат возведения числа a в степень b равен: " + (numToPower));
		} else if (operation == '%') {
			if (b != 0) {
				System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
			} else {
				System.out.println("На ноль делить нельзя!");
			}
		}
	} 
}