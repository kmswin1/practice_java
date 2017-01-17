package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class NaverBookDAO implements daoInterface{
	public NaverBookDAO() {
		// TODO Auto-generated constructor stub
	}
	Connection con = null;
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String id = "java";
			String pw = "java";
			String url = "jdbc:mysql://localhost:3306/library";
			con = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
