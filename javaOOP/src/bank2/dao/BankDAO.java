package bank2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bank2.dto.BankDTO;

public class BankDAO {
	
	public BankDAO() {
		// TODO Auto-generated constructor stub
	}

	public BankDTO select(BankDTO dto) {
		BankDTO result = null;
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String id = "kms";
		String pw = "kms";
		String url = "jdbc:mysql://localhost:3306/library";
		con = DriverManager.getConnection(url,id,pw);
		String sql = "select name, balance from bank where name = ?";
		psmt = con.prepareStatement(sql);
		psmt.setString(1, dto.getName());
		rs = psmt.executeQuery();
		if(rs.next()){
			result = new BankDTO();
			result.setName(rs.getString("name"));
			result.setBalance(rs.getInt("balance"));
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		try{
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	}
	return result;
	}

	public BankDTO updateDeposit(BankDTO dto) {
		BankDTO result = null;
		Connection con = null;
		PreparedStatement psmt = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String id = "kms";
		String pw = "kms";
		String url = "jdbc:mysql://localhost:3306/library";
		con = DriverManager.getConnection(url,id,pw);
		String sql = "update bank set balance = balance + ? where name = ?";
		psmt = con.prepareStatement(sql);
		psmt.setInt(1, dto.getBalance());
		psmt.setString(2, dto.getName());
		int count = psmt.executeUpdate();
		if(count==1){
			result = select(dto);
			
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		try{
			psmt.close();
			con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	}
	return result;
	}

	public BankDTO updateWithdraw(BankDTO dto) {
		BankDTO result = null;
		Connection con = null;
		PreparedStatement psmt = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String id = "kms";
		String pw = "kms";
		String url = "jdbc:mysql://localhost:3306/library";
		con = DriverManager.getConnection(url,id,pw);
		String sql = "update bank set balance = balance - ? where name = ?";
		psmt = con.prepareStatement(sql);
		psmt.setInt(1, dto.getBalance());
		psmt.setString(2, dto.getName());
		int count = psmt.executeUpdate();
		if(count==1){
			result = select(dto);
			
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		try{
			psmt.close();
			con.close();
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	}
	return result;
	}

}
