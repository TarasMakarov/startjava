public class GuessNumber {

	private int compNumber;

	public int getCompNumber() {
		return compNumber;
	}

	public void setCompNumber(int compNumber) {
		this.compNumber = compNumber;
	}

	public void gameOver() {
		System.out.println("Игра окончена!");
	}

	public void giveHint(int a) {
		if (compNumber < a) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (compNumber > a) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
		}
	}
}