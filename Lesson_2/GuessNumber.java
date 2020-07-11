import java.util.Scanner;

public class GuessNumber {

	private int compNumber;
	Scanner input = new Scanner(System.in);

	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	private void setCompNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public void guessGame() {
			System.out.println("Игра начинается!");
			int c = (int) (Math.random() * 100);
			setCompNumber(c);
			System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
			do {
				System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
				player1.setNumber(input.nextInt());
				player1.guessNumber();
				giveHint(player1.getNumber());
					if (compNumber != player1.getNumber()) {
						System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
						player2.setNumber(input.nextInt());
						player2.guessNumber();
						giveHint(player2.getNumber());
					} else {
						System.out.print("");
					}
			} while (compNumber != player1.getNumber() && compNumber != player2.getNumber());
	}

	private void giveHint(int playerNumber) {
		if (compNumber < playerNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (compNumber > playerNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
			System.out.println("Игра окончена!");
		}
	}
}