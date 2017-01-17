package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력을 받는다.
		// 입력을 받기 위해서는 Stream 이라는걸 이용해야 한다.
		// Stream 을 직접 이용하는건 나중에 다시하자
		// 좀 쉬운형태로 사용자로부터 입력 받기.
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력하세요 : ");
		String keyword = sc.nextLine();
		// JDBC(Java Database Connectivity)
		// 총 6단계 거쳐서 java program이 Database를 이용
		// 조심해야 하는건..Database 프로그램은 예외상황에 대한
		// 처리가 같이 나와야 해요!!
		try{
			// 이 안에 있는코드를 실행
			// 만약 에러가 없으면 상관없지만
			// 혹 수행하다가 Exception 이 발생되면
			// catch문 안에 있는 내용을 수행
			
			// 1. 드라이버 로딩
			// 자바가 특정 데이터베이스를 이용하기위해서는
			// 특수한 class의 instance가 필요
			// java ---- JDBC Driver ----> database
			// 파일을 찾았어요. 이 파일을 우리프로젝트에서 사용하기위해 경로를 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!!");
			// 2. 데이터베이스에 접속
			// 접속을 위해서는 크게 3가지가 필요
			// ID , PW , 어느데이터에 접속할건지에 대한 주소
			String id = "kms";
			String pw = "kms";
			String url = "jdbc:mysql://localhost:3306/library";
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공 !!!");
			// 3. 문장 생성(SQL 질의 작성)
			// SQL에서 사용할 수 있는  wildcard 중에 "%" => 0개 이상의 문자열
			// %java% -> java를 포함하는 0개이상의 모든 문자열
			String sql = 
	"select btitle, bauthor from book where btitle like ?";
			// SQL에서 IN parameter 인 "?"의 의미는 결정되지 않았다는 뜻
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			// 4. 실행
			// 실행시 조심해야 할건 어떤 종류의 sql을 사용하는지에 따라 실행하는 method가 달라짐
			// 데이터를 얻어오는 경우(select ~~)
			ResultSet rs = pstmt.executeQuery();
			// 5. 결과처리단계
			// 지금의 경우는 select를 이용해서 결과데이터의 집합을 DB로부터 가져온 경우
			// 첫번째 rs.next(); return true
			// 두번째 rs.next(); return false
			// rs 는 포인터 개념!!
			while(rs.next()){
				String title = rs.getString("btitle");
				String author = rs.getString("bauthor");
				System.out.println(title+", "+author);
			}
			// 6.사용한 resource를 해제
			rs.close();
			pstmt.close();
			con.close();
			// 나중에 만든 것 부터 먼저 close 시킴 -> 필수 Rule
		} catch(Exception e){
		System.out.println(e);
		}
	}

}
