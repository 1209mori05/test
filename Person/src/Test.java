
public class Test {
	public static void main(String[] ages){

		Person taro=new Person();
//taroはPerson型の新しいインスタンス

//「.(ドット)」は「～の」という意味
//		↓「taroのnameは"山田太郎"」
//		初期値が入っていた部分にtaroの情報を入れていく
		taro.name = "山田太郎";
		taro.age = 20;

		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();
		taro.run(5);

	//コンストラクタ2を使用
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

	//コンストラクタ3を使用
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

	//コンストラクタ4を使用
		Person nanashi = new Person(25);
		System.out.println(nanashi.name);
		System.out.println(nanashi.age);

	//コンストラクタ5を使用
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}