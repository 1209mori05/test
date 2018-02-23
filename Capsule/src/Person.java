
public class Person {

	private String name=null;
	private int age=0;
	//↑フィールド(private)

	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	//↑コンストラクタ

	public String getName(){
		return this.name;
	}
	//↑getterメソッド(読む用)

	public void setName(String name){
		this.name=name;
	}
	//↑setterメソッド(書く用)

}



//	public class Person {

//		public String name=null;
//		public int age=0;
//	}


//	public class Capsule {
//
//			Person taro=new Person("山田太郎",20);
//			System.out.println(taro.name);
//		}
//	}
//
//	エラー↑
//	デフォルトコンストラクタは引数を持たないので、
//	引数を持つインスタンスを作成するには
//	それに合う引数のコンストラクタが必要。