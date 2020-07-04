public class WolfTest {
	
	public static void main(String[] args) {
		Wolf bigFang = new Wolf();
		bigFang.sex = "male";
		bigFang.nickname = "Big Fang";
		bigFang.weight = 58;
		bigFang.age = 12;
		bigFang.color = "Grey";

		System.out.println(bigFang.nickname);
		System.out.println(bigFang.sex);
		System.out.println(bigFang.age);
		System.out.println(bigFang.weight);
		System.out.println(bigFang.color);

		bigFang.go();
		System.out.println(bigFang.sit());
		bigFang.run();
		bigFang.howl();
		bigFang.hunt();
	}
}