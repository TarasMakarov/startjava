public class GuessNumber {
	public static void main(String[] args) {
		int win = 38;
		int attempt = 21;
		if (win < attempt) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} 
		if (win > attempt) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		}
		if (win == attempt) {
			System.out.println("Вы угадали!");
		}

		attempt = 89;
		if (win < attempt) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} 
		if (win > attempt) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		}
		if (win == attempt) {
			System.out.println("Вы угадали!");
		}

		attempt = 38;
		if (win < attempt) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		}
		if (win > attempt) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		}
		if (win == attempt) {
			System.out.println("Вы угадали!");
		}
	}
}