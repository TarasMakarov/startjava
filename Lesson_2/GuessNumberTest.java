import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = null;
		System.out.println("Уважаемые игроки, представьтесь, пожалуйста.");

		Player player1 = new Player(input.nextLine());
		Player player2 = new Player(input.nextLine());

		GuessNumber game = new GuessNumber(player1, player2);

		game.sayHello();

		do {
			game.guessGame();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = input.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}