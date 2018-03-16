
public class Person {

//フィールド(private)
	private String name=null;
	private int age=0;

//コンストラクタ
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

//getterメソッド(読む用)
//	呼び出し元にthis.name(そのインスタンスのname)を返す(戻す)
	public String getName(){
		return this.name;

	}

//setterメソッド(書く用)
//「void」戻り値なし(何も返さなくていい)

//	呼び出し元がsetterで値を送って寄越したいだけなら、
//	こちら側はなにも返す必要がない
	public void setName(String name){
		this.name=name;
	}
}