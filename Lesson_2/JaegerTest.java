public class JaegerTest {

	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger();
		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("Mark-5");
		strikerEureka.setOrigin("Australia");
		strikerEureka.setHeight(76.2f);
		strikerEureka.setWeight(1.85f);
		strikerEureka.setSpeed(10);
		strikerEureka.setStrength(10);
		strikerEureka.setArmor(9);

		System.out.println("Наименование модели робота: " + strikerEureka.getModelName());
		System.out.println("Наименование серии робота: " + strikerEureka.getMark());
		System.out.println("Страна происхождения: " + strikerEureka.getOrigin());
		System.out.println("Высота: " + strikerEureka.getHeight() + " футов");
		System.out.println("Вес: " + strikerEureka.getWeight() + " тонн");
		System.out.println("Скорость передвижения: " + strikerEureka.getSpeed());
		System.out.println("Сила: " + strikerEureka.getStrength());
		System.out.println("Уровень защиты: " + strikerEureka.getArmor());

		strikerEureka.move();
		strikerEureka.findKaiju();
		strikerEureka.useStingBlades();
		System.out.println();

		Jaeger gipsyDanger = new Jaeger();
		gipsyDanger.setModelName("Gipsy Danger");
		gipsyDanger.setMark("Mark-3");
		gipsyDanger.setOrigin("USA");
		gipsyDanger.setHeight(260f);
		gipsyDanger.setWeight(1.98f);
		gipsyDanger.setSpeed(7);
		gipsyDanger.setStrength(8);
		gipsyDanger.setArmor(6);

		System.out.println("Наименование модели робота: " + gipsyDanger.getModelName());
		System.out.println("Наименование серии робота: " + gipsyDanger.getMark());
		System.out.println("Страна происхождения: " + gipsyDanger.getOrigin());
		System.out.println("Высота: " + gipsyDanger.getHeight() + " футов");
		System.out.println("Вес: " + gipsyDanger.getWeight() + " тонны");
		System.out.println("Скорость передвижения: " + gipsyDanger.getSpeed());
		System.out.println("Сила: " + gipsyDanger.getStrength());
		System.out.println("Уровень защиты: " + gipsyDanger.getArmor());

		gipsyDanger.move();
		gipsyDanger.findKaiju();
		gipsyDanger.usePlasmaCannon();
		System.out.println();

		strikerEureka.setOrigin("Spain");
		strikerEureka.setSpeed(14);
		System.out.println("Появилась другая модель робота " + strikerEureka.getModelName());
		System.out.println("Страна происхождения: " + strikerEureka.getOrigin());
		System.out.println("Cкорость передвижения " + strikerEureka.getSpeed());
		System.out.println();

		gipsyDanger.setArmor(11);
		gipsyDanger.setWeight(1.67f);
		System.out.println("Появилась другая модель робота " + gipsyDanger.getModelName());
		System.out.println("Уровень защиты составляет: " + gipsyDanger.getArmor());
		System.out.println("Вес снизился и равен " + gipsyDanger.getWeight() + " тонны");
	}
}



