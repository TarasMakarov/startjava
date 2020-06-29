public class GuessNumber {
	public static void main(String[] args) {
		int winNumber = 38;
		int attempt = 0;
		while (attempt != winNumber) {
			if (winNumber < attempt) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				attempt--;
			} 
			if (winNumber > attempt) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				attempt++;
			}
		}
		System.out.println("Вы угадали!");
	}
}

// 		attempt = attempt + 73;
// 		if (winNumber < attempt) {
// 			System.out.println("Введенное вами число больше того, что загадал компьютер");
// 		} 
// 		if (winNumber > attempt) {
// 			System.out.println("Введенное вами число меньше того, что загадал компьютер");
// 		}
// 		if (winNumber == attempt) {
// 			System.out.println("Вы угадали!");
// 		}

// 		attempt = attempt + 17;
// 		if (winNumber < attempt) {
// 			System.out.println("Введенное вами число больше того, что загадал компьютер");
// 		}
// 		if (winNumber > attempt) {
// 			System.out.println("Введенное вами число меньше того, что загадал компьютер");
// 		}
// 		if (winNumber == attempt) {
// 			System.out.println("Вы угадали!");
// 		}
// 	}
// }