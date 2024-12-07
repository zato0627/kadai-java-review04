package animal;

public class Animal {

	//名前を格納するフィールドと年齢を格納するフィールドを定義
	private String fullName;	//名前
	private int age;			//年齢

	public Animal() {

	}

	public Animal(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;

	}

	public String getAge() {
		return fullName;

	}
	public void setAge(int age) {
		this.age = age;
	}

	public void say() {
		System.out.println(fullName + "です。" + age + "歳です。");

	}

	/*
	コンストラクタに名前・年齢の情報を格納する引数を設定し、処理内容として名前・年齢の各フィールドを引数の情報で初期化するようにしてください
	引数の名前は自由とします

	say という名前のpublicなメソッドを定義してください。
	このメソッドを実行すると、フィールドに代入された名前と年齢を使って ○○です。△△歳です。
	 と画面に System.out.println() で表示するように処理を作りましょう（戻り値の指定は不要です）
*/
}
