public class WolfTest {
	
	public static void main(String[] args) {
		Wolf bigFang = new Wolf();
		bigFang.setSex("male");
		bigFang.setNickname("Big Fang");
		bigFang.setWeight(58);
		bigFang.setAge(9);
		bigFang.setColor("Grey");

		System.out.println("nickname " + bigFang.getNickname());
		System.out.println("sex " + bigFang.getSex());
		
		if (bigFang.getAge() > 8) {
			System.out.print("");
		} else {
			System.out.println("age " + bigFang.getAge());
		}

		System.out.println("weight " + bigFang.getWeight());
		System.out.println("color " + bigFang.getColor());

		bigFang.go();
		System.out.println(bigFang.sit());
		bigFang.run();
		bigFang.howl();
		bigFang.hunt();
	}
}