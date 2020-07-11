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

	public void guessGame() {
			System.out.println("Игрок под номером 1");
			System.out.println("Меня зовут " + player1.getName());
			System.out.println("Игрок под номером 2");
			System.out.println("Меня зовут " + player2.getName());
			System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
			System.out.println("Игра начинается!");
			compNumber = (int) (Math.random() * 101);
			System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
			do {
				System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
				player1.setNumber(input.nextInt());
				System.out.println("Я думаю, это число: " + player1.getNumber());
				compareNums(player1.getNumber());
					if (compNumber != player1.getNumber()) {
						System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
						player2.setNumber(input.nextInt());
						System.out.println("Я думаю, это число: " + player2.getNumber());
						compareNums(player2.getNumber());
					} else {
						System.out.print("");
					}
			} while (compNumber != player1.getNumber() && compNumber != player2.getNumber());
	}

	private void compareNums(int playerNumber) {
		if (compNumber < playerNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (compNumber > playerNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else if (compNumber == player1.getNumber()) {
			System.out.println(player1.getName() + ", Вы угадали!");
			System.out.println("Игра окончена!");
		} else {
			System.out.println(player2.getName() + ", Вы угадали!");
			System.out.println("Игра окончена!");
		}
	}
}