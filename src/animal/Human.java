package animal;


public class Human extends Animal implements Thinkable {

	private String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public Human() {

		}

	public Human(String fullName, int age, String hobby) {

		super(fullName, age);
		this.hobby = hobby;

	}

	@Override
	public void think() {
		System.out.println("私は" + hobby + "について考えています。");

	}




		/*
		Javaではスーパークラスの継承とインターフェイスの実装を両方同時に指定できます。
		Humanクラスは、Animal クラスを継承し、Thinkable インターフェイスを実装するようにしてください
		趣味の情報を保管するフィールドを定義してください
		変数名は自由とします
		カプセル化を使ってください

		コンストラクタで名前・年齢・趣味の情報を格納する引数を設定し、
		処理内容として名前・年齢・趣味の各変数を引数の情報で初期化するようにしてください
		引数の名前は自由とします
		名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用するようにしてください
*/

	//趣味のフィールドに入っている文字列の中身を利用して、[私は□□について考えています。]表示する



}
