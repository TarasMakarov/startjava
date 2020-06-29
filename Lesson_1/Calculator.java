public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 4;
		int result = 0;
		char mark = '+';
		if (mark == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		} else {
			System.out.println("Разность a и b равна: " + (a - b));
		}
		
		mark = '-';
		if (mark == '+') {
			System.out.println("Сумма a и b равна: " + (a + b));
		} else {
			System.out.println("Разность a и b равна: " + (a - b));
		}

		mark = '*';
		if (mark == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		} else {
			System.out.println("Частное a и b равно: " + (a / b));
		}

		mark = '/';
		if (mark == '*') {
			System.out.println("Произведение a и b равно: " + (a * b));
		} else {
			System.out.println("Частное a и b равно: " + (a / b));
		}

		mark = '^';
		if (mark == '^') {
			System.out.println("Результат возведения числа a в степень b равен: " + (a * a * a * a));
		} else {
			System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
		}

		mark = '%';
		if (mark == '^') {
			System.out.println("Результат возведения числа a в степень b равен: " + (a * a * a * a));
		} else {
			System.out.println("Результат деления по модулю числа a на число b равен: " + (a % b));
		}
	} 
}