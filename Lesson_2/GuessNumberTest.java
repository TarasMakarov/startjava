import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = null;
		System.out.println("Уважаемые игроки, представьтесь, пожалуйста.");

		Player player1 = new Player(input.nextLine());
		Player player2 = new Player(input.nextLine());

		System.out.println("Игрок под номером 1");
		System.out.println("Меня зовут " + player1.getName());
		System.out.println("Игрок под номером 2");
		System.out.println("Меня зовут " + player2.getName());
		System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");

		GuessNumber players = new GuessNumber(player1, player2);

		do {
			players.guessGame();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = input.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}