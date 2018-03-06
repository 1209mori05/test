import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class DBConnector {

	private static String driverName="com.mysql.jdbc.Driver";
		//ドライバ名
	private static String url="jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
		//データベース接続URL
	private static String user="root";
		//データベース接続ユーザ名
	private static String password="mysql";
		//データベース接続パスワード

	public Connection getConnection(){
			Connection con=null;
			try{
				Class.forName(driverName);
				con=(Connection)DriverManager.getConnection(url,user,password);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}return con;
	}


}
