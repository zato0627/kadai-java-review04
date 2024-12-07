package animal;

public class Review04 {

	public static void main(String[] args) {

		/*
		Animal tanaka01 = new Animal("田中　太郎", 25);
		Animal suzuki01 = new Animal("鈴木　次郎", 30);
		Animal sato01 = new Animal("佐藤　花子", 20);
		*/

		Human tanaka = new Human("田中　太郎", 25, "電車");
		Human suzuki = new Human("鈴木　次郎", 30, "野球");
		Human sato = new Human("佐藤　花子", 20, "映画");


		tanaka.say();
		tanaka.think();
		suzuki.say();
		suzuki.think();
		sato.say();
		sato.think();


	}

}
