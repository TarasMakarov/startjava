import java.util.Scanner;

public class GuessNumber {

	private int compNumber;
	Scanner input = new Scanner(System.in);
	boolean numberWin;
	private int countPlayers = 1;
	private int count = 1;

	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void guessGame() {
		if (countPlayers == count) {
			sayHello(player1);
			sayHello(player2);
			System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
		}
			numberWin =true;
			while (numberWin) {
				System.out.println("Игра начинается!");
				compNumber = (int) (Math.random() * 101);
				System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
				numberWin = true;
				while(numberWin) {
					System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
					player1.setNumber(input.nextInt());
					System.out.println("Я думаю, это число: " + player1.getNumber());
					compareNums(player1);
						if (numberWin) {
							System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
							player2.setNumber(input.nextInt());
							System.out.println("Я думаю, это число: " + player2.getNumber());
							compareNums(player2);
						}
				}
			}
	}

	private void sayHello(Player player) {
		System.out.println("Игрок под номером " + count);
		System.out.println("Меня зовут " + player.getName());
		count++;
	}

	private void compareNums(Player player) {
		if (compNumber < player.getNumber()) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			//return true;
		} else if (compNumber > player.getNumber()) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
			//return true;
		} else {
			System.out.println(player.getName() + ", Вы угадали!");
			System.out.println("Игра окончена!");
			numberWin = false;
			//return false;
		}
	}
}