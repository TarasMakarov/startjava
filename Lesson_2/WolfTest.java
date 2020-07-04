public class WolfTest {
	
	public static void main(String[] args) {
		Wolf bigFang = new Wolf();
		bigFang.sex = "male";
		bigFang.nickname = "Big Fang";
		bigFang.weight = 58;
		bigFang.age = 12;
		bigFang.color = "Grey";

		System.out.println("nickname " + bigFang.nickname);
		System.out.println("sex " + bigFang.sex);
		System.out.println("age " + bigFang.age);
		System.out.println("weight " + bigFang.weight);
		System.out.println("color " + bigFang.color);

		bigFang.go();
		System.out.println(bigFang.sit());
		bigFang.run();
		bigFang.howl();
		bigFang.hunt();
	}
}