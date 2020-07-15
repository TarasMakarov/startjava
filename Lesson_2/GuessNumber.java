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
		sayHello();
		compNumber = (int) (Math.random() * 101);
		System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
		do {
			System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
			player1.setNumber(input.nextInt());
			System.out.println("Я думаю, это число: " + player1.getNumber());
			if (!compareNums(player1)) {
				System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
				player2.setNumber(input.nextInt());
				System.out.println("Я думаю, это число: " + player2.getNumber());
				if (compareNums(player2)) {
					break;
				}
			} else {
				break;
			}
		} while (true);
	}

	private void sayHello() {
		System.out.println("Игрок под номером 1");
		System.out.println("Меня зовут " + player1.getName());
		System.out.println("Игрок под номером 2");
		System.out.println("Меня зовут " + player2.getName());
		System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
		System.out.println("Игра начинается!");
	}

	private boolean compareNums(Player player) {
		if (compNumber == player.getNumber()) {
			System.out.println(player.getName() + ", Вы угадали!");
			System.out.println("Игра окончена!");
			return true;
		} else {
			String answerCompareNum = compNumber < player.getNumber()? "Введенное вами число больше того, что загадал компьютер" : 
			"Введенное вами число меньше того, что загадал компьютер";
			System.out.println(answerCompareNum);
		} return false;
	}
}