package bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bank.controller.BankController;
import bank.dto.BankDTO;
import booksearch.dto.BookDTO;

public class BankDAO {
	public BankDAO(){
		
	}	

	public BankDTO deposit(String name1){
		BankDTO dto = new BankDTO();
		try{
			//database 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//database 접속
			String id = "kms";
			String pw = "kms";
			String url = "jdbc:mysql://localhost:3306/library";
			Connection con = DriverManager.getConnection(url,id,pw);
			//transaction 설정
			con.setAutoCommit(false);
			//sql 명령 실행
			String sql1 = "select name,balance from bank where name = ?";
			PreparedStatement psmt = con.prepareStatement(sql1);
			psmt.setString(1, name1);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				String name = rs.getString("name");
				int money = rs.getInt("balance");
				
				String sql2 = "update bank set balance= ? where name = ?";
				PreparedStatement psmt2 = con.prepareStatement(sql2);
				psmt2.setInt(1, money);
				psmt2.setString(2, name);
				int tmp = psmt2.executeUpdate();
				if(tmp==1){
				dto.setName(name);
				dto.setBalance(money);
				con.commit();
			}
			else{
			con.rollback();
			}
			psmt2.close();
			}
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return dto;
		
	}
	public BankDTO withdraw(String name2){
		BankDTO dto = new BankDTO();
			try{
				//database 로딩
				Class.forName("com.mysql.jdbc.Driver");
				//database 접속
				String id = "kms";
				String pw = "kms";
				String url = "jdbc:mysql://localhost:3306/library";
				Connection con = DriverManager.getConnection(url,id,pw);
				//transaction 설정
				con.setAutoCommit(false);
				//sql 명령 실행
				String sql1 = "select name,balance from bank where name = ?";
				PreparedStatement psmt = con.prepareStatement(sql1);
				psmt.setString(1, name2);
				ResultSet rs = psmt.executeQuery();
			if(rs.next()){
				String name = rs.getString("name");
				int money = rs.getInt("balance");				
				String sql2 = "update bank set balance= ? where name = ?";
				PreparedStatement psmt2 = con.prepareStatement(sql2);
				psmt2.setInt(1, money);
				psmt2.setString(2, name);
				int tmp = psmt2.executeUpdate();
				if(tmp==1){
				dto.setName(name);
				dto.setBalance(money);
				con.commit();
			}
			else{
			con.rollback();
			}
			psmt2.close();
			}
			rs.close();
			psmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return dto;
		
	}
}
