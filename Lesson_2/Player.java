public class Player {
	private String name;
	private int number;

	public void sayHello() {
		System.out.println("Меня зовут: " + name);
	}

	public void guessNumber() {
		System.out.println("Я думаю, это число: " + number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
