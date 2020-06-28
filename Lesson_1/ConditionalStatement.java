public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20) {
			System.out.println("Пенсия близко, братан!");
		}

		boolean sexMale = true;
		if (sexMale) {
			System.out.println("Отдай ребро!");
		}

		if (!sexMale) {
			System.out.println("Хороша, чертовка!");
		}

		double height = 2.00;
		if (height < 1.8) {
			System.out.println("Привет, Фродо!");
		} else {
			System.out.println("Привет, Гэндальф!");
		}

		char firstLetterName = 'I';
		if (firstLetterName == 'M') {
			System.out.println("Не может быть!");
		} else if (firstLetterName == 'I') {
			System.out.println("Точно!!!");
		} else {
			System.out.println("Только не это...");
		}
	}
}