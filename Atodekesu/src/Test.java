
public class Test {

	public static void main(String[] args) {


	Person taro = new Person();
	taro.name="太郎";
	taro.age=20;

	Person hanako = new Person();
	hanako.name="花子";


	System.out.println(taro.name);
	System.out.println(taro.age);
	taro.talk();
	taro.run();
	System.out.println(taro.name+"が話す");

	hanako.talk();
	hanako.run();
	System.out.println(hanako.age);


	}

}