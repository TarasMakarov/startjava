package com.startjava.lesson_2_3.jaeger;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void move() {
		System.out.println("Движение - жизнь!");
	}

	public boolean findKaiju() {
		System.out.println("Вижу цель.");
		return true;
	}

	public void useStingBlades() {
	System.out.println("Порублю в салат!");
	}

	public void usePlasmaCannon() {
	System.out.println("Сейчас будет горячо...");
	}

	public String toString() {
		return
		"Наименование модели робота: " + modelName + '\n' +
		"Наименование серии робота: " + mark + '\n' +
		"Страна происхождения: " + origin + '\n' +
		"Высота: " + height + " футов" + '\n' +
		"Вес: " + weight + " тонн" + '\n' +
		"Скорость передвижения: " + speed + '\n' +
		"Сила: " + strength + '\n' +
		"Уровень защиты: " + armor;
	}
}

















