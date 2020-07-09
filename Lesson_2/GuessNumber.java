import java.util.Scanner;

public class GuessNumber {

	Player player1 = new Player("Андрей");
	Player player2 = new Player("Виктория");
	Scanner input = new Scanner(System.in);

	private int compNumber;
	private String answer = "";

	public void setCompNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public void beginGame() {
		System.out.println("Уважаемые игроки, представьтесь, пожалуйста.");
		System.out.println("Игрок под номером 1");
		System.out.println("Меня зовут " + player1.getName());
		System.out.println("Игрок под номером 2");
		System.out.println("Меня зовут " + player2.getName());
		System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
	}


	public void guessGame() {
		do {
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
			do {
					System.out.print("Хотите продолжить? [да/нет]: ");
					answer = input.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}


	private void giveHint(int a) {
		if (compNumber < a) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (compNumber > a) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
			System.out.println("Игра окончена!");
		}
	}
}