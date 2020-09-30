package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {
	private static Statement stat;//需要给别人用
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver") ; 
		String url="jdbc:mysql://127.0.0.1:3306/paradise";
		String user="root";
		String password="123123";
		Connection con = DriverManager.getConnection(url,user,password);
		stat = con.createStatement();

	}
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if(stat==null)init();
		return stat;
	}
}
