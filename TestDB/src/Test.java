
public class Test {

	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();


		dao.select("taro","123");
		dao.select("jiro", "456");
			System.out.println();
		dao.selectAll();
			System.out.println();
		dao.selectByName("taro");
		dao.selectByPassword("789");
			System.out.println();
		dao.updateUserNameByUserName("Kotaro","Hanako");
			System.out.println();
		dao.delete("Saburo");
	}

}
