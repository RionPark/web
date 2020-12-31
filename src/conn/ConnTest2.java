package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest2 {

	public static void main(String[] args) {
		// 단위 테스트 
		// TDD 개발방법론 : Test Driven Development 테스트 주도 개발
/*
 * DDL : Data Definition Language 데이터의 구조를 정의하는 언어
 *   CREATE, DROP , ALTER, TRUNCATE
 * DML : Data Manipulation Language 데이터를 조작하는 언어
 *   INSERT, UPDATE, DELETE, SELECT
 * DCL : Data Control Language 데이터 제어하는 언어  
 *   GRANT, REVOKE, COMMIT, ROLLBACK  
 */
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con;
		try {
			con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			Statement stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	

		
	}
}
