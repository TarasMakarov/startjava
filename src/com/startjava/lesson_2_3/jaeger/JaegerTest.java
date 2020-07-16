package com.startjava.lesson_2_3.jaeger;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.85f, 10, 10, 9);

		System.out.println(strikerEureka);

		strikerEureka.move();
		strikerEureka.findKaiju();
		strikerEureka.useStingBlades();
		System.out.println();

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 260f, 1.98f, 7, 8, 6);
		System.out.println(gipsyDanger);

		gipsyDanger.move();
		gipsyDanger.findKaiju();
		gipsyDanger.usePlasmaCannon();
		System.out.println();

		strikerEureka.setOrigin("Spain");
		strikerEureka.setSpeed(14);
		System.out.println(strikerEureka);
		System.out.println();

		gipsyDanger.setArmor(11);
		gipsyDanger.setWeight(1.67f);
		System.out.println(gipsyDanger);
	}
}



