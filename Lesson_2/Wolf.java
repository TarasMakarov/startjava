/*Создайте класс Wolf
напишите в нем поля: пол, кличка, вес, возраст, окрас
напишите в нем методы: идти, сидеть, бежать, выть, охотиться
Создайте класс WolfTest с методом main
создайте объект типа Wolf
присвойте в нем полям экземпляра класса Wolf какие-то значения
считайте эти значения из полей и отобразите в консоли
вызовите методы объекта*/

public class Wolf {
	
	String sex;
	String nickname;
	int weight;
	int age;
	String color;

	void go() {
		System.out.println("It's my terrain.");
	}

	String sit() {
		return "I sit high, I look far";
	}

	void run() {
		if (weight > 70) {
			System.out.println("Eat less((");
		} else if (weight > 40) {
			System.out.println("I am in shape!");
		} else {
			System.out.println("Urgently need a hare!!!");
		}
	}

	void howl() {
		char c = 85;
		for(int i = 0; i < age; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	void hunt() {
		if (sex == "female") {
			System.out.println("I'm not a hunter. I'm a housewife.");
		} else {
			System.out.println("Hare! I'll get you!!!");
		}
	}
}
