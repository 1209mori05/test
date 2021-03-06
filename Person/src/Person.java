
	public class Person {
//Person型の設計書
		public String name= null;
		public int age = 0;
	//↓メソッドを追加
		public void talk(){
			System.out.println(this.name+"が話す");
		}
		public void walk(){
			System.out.println(this.name+"が歩く");
		}
		public void run(){
			System.out.println(this.name+"が走る");
		}
		public void run(int sec){
			System.out.println(this.name+"が"+sec+"分走る");
		}




	//デフォルトコンストラクタ
	//	(記述しなくても自動で作られてる)
		public Person(){}

	//コンストラクタ2
		public Person(String name,int age){
	//「this」は「この(インスタンス)自分自身の･･･」という意味
			this.name = name;
			this.age = age;
		}
	//コンストラクタ3
		public Person(String name){
			this.name = name;
			this.age = 0;
		}
	//コンストラクタ4
		public Person(int age){
			this.name = "名前なし";
			this.age = age;
		}
	//コンストラクタ5
		public Person(int age,String name){
			this.name = name;
			this.age = age;
		}
}
