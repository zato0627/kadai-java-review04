package animal;

public class Review04 {

	public static void main(String[] args) {

		Animal tanaka01 = new Animal("田中　太郎", 25);
		Animal suzuki01 = new Animal("鈴木　次郎", 30);
		Animal sato01 = new Animal("佐藤　花子", 20);

		Human tanaka02 = new Human("田中　太郎", 25, "電車");
		Human suzuki02 = new Human("鈴木　次郎", 30, "野球");
		Human sato02 = new Human("佐藤　花子", 20, "映画");


		tanaka01.say();
		tanaka02.think();
		suzuki01.say();
		suzuki02.think();
		sato01.say();
		sato02.think();


	}

}
