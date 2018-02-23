package sample;

public class sample_test {

	public static void main(String[] args) {
		System.out.println("テスト");
		System.out.println(tashi(5,5));
		System.out.println(hiki(5,5));
		System.out.println(kake(5,5));
		System.out.println(wari(5,5));
	}

	public static int tashi(int num1,int num2){
		return num1+num2;
	}
	public static int hiki(int num1,int num2){
		return num1-num2;
	}
	public static int kake(int num1,int num2){
		return num1*num2;
	}
	public static int wari(int num1,int num2){
		return num1/num2;
	}



}



