public class Cycle {
	public static void main(String[] args) {
		for (int i= 0; i <= 20; i++) {
			System.out.println(i);
		}

		int j = 6;
		while (j >= -6) {
			System.out.println(j);
			j = j - 2;
		}
		int number = 10;
		int sum = 0;
		do {
			if (number % 2 == 1) {
				sum = sum + number;
			} 
			number++;
		} while (number <= 20);

			System.out.println("Сумма нечетных чисел от 10 до 20 = " + sum);
	}
}