
public class Test {

	public static void main(String[] args) {

		TestUserDAO dao = new TestUserDAO();

		dao.insert(8, "yoshiko", "234");
		dao.selectAll();

	}

}
