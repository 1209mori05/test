
public class Capsule {

	public static void main(String[] args) {
		Person taro = new Person("山田太郎",20);

	//System.out.println(taro.name);
	//↑「フィールド Person.name は不可視です」でエラーになる

		System.out.println(taro.getName());
	}

}
