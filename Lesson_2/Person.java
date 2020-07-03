/*Создайте класс Person (без метода main)
Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
Проинициализируйте их какими-то значениями
Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
Покажите Д/З наставнику*/

public class Person {

	String sex = "female";
	String name = "Evdokiya";
	int height = 185;
	int weight = 65;
	int age = 24;

	void go() {

	}

	String sit() {
		return "I'll rest a bit";
	}

	void run() {

	}

	void speak() {
		System.out.println("I am " + name);
	}

	void learnJava() {

	}
}
