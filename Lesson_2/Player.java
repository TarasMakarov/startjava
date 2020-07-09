public class Player {
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public void guessNumber() {
		System.out.println("Я думаю, это число: " + number);
	}

	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
