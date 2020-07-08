import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		GuessNumber game = new GuessNumber();
		Scanner input = new Scanner(System.in);
		Player player1 = new Player();
		Player player2 = new Player();
		String answer = "";
		
		System.out.println("Уважаемые игроки, представьтесь, пожалуйста.");
		System.out.println("Игрок под номером 1");
		player1.setName(input.nextLine());
		player1.sayHello();
		System.out.println("Игрок под номером 2");
		player2.setName(input.nextLine());
		player2.sayHello();
		System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");

		do {
			int c = (int) ( Math.random() * 100);
			System.out.println("Компьютер загадал свое число. И это число: " + c);
			game.setCompNumber(c);
			do {
				System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
				player1.setNumber(input.nextInt());
				player1.guessNumber();
				game.giveHint(player1.getNumber());
					if (game.getCompNumber() != player1.getNumber()) {
						System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
						player2.setNumber(input.nextInt());
						player2.guessNumber();
						game.giveHint(player2.getNumber());
					} else {
						System.out.print("");
					}
			} while (game.getCompNumber() != player1.getNumber() && game.getCompNumber() != player2.getNumber());

			game.gameOver();

			do {
					System.out.print("Хотите продолжить? [да/нет]: ");
					answer = input.next();
				} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}