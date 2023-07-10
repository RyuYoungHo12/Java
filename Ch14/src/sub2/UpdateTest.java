package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2023/07/10
 * 이름 : 류영호
 * 내용 : Update 실습하기
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		// DB정보
		String host ="jdbc:mysql://127.0.0.1:3306/userdb";
		String user ="root";
		String pass ="1234;";
		
		try {
			
			// 1단계 -
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 -
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 -
			Statement stmt = conn.createStatement();
			
			// 4단계 -
			String sql = "UPDATE `User1` SET ";
				   sql += "`hp`='010-1234-1111', ";
				   sql += "`age`=25 ";
				   sql += "WHERE `uid`='j101'";
			
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과처리(SELECT 경우)
			// 6단계 - 연결해제
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
	}
}
