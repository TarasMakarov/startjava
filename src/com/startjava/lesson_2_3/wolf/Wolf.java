package com.startjava.lesson_2_3.wolf;

public class Wolf {
	
	private String sex;
	private String nickname;
	private int weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			this.age = age;
			System.out.println("Некорректный возраст.");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("It's my terrain.");
	}

	public String sit() {
		return "I sit high, I look far";
	}

	public void run() {
		if (weight > 70) {
			System.out.println("Eat less((");
		} else if (weight > 40) {
			System.out.println("I am in shape!");
		} else {
			System.out.println("Urgently need a hare!!!");
		}
	}

	public void howl() {
		char c = 85;
		for(int i = 0; i < age; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	public void hunt() {
		if (sex == "female") {
			System.out.println("I'm not a hunter. I'm a housewife.");
		} else {
			System.out.println("Hare! I'll get you!!!");
		}
	}
}
