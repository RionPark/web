package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BhcMenuController {
	/*
	 *  사용자한테 bm_num, bm_name, bm_type, bm_price, bm_desc를 입력받아서
	 *  즉 메뉴번호, 메뉴명, 메뉴타입, 가격, 메뉴설명을 입력받아서
	 *  bhc_menu table에 insert하는 프로그램을 완성해주세요.
	 */
	public static void main(String[] args) {
		System.out.println("추가할 메뉴번호, 메뉴명, 메뉴타입, 가격, 메뉴설명을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴번호 : ");
		int bmNum = Integer.parseInt(scan.nextLine());
		System.out.print("메뉴명 : ");
		String bmName = "'" + scan.nextLine() + "'";
		System.out.print("메뉴타입 : ");
		String bmType = "'" + scan.nextLine() + "'";
		System.out.print("가격 : ");
		int bmPrice = Integer.parseInt(scan.nextLine());
		System.out.print("메뉴설명 : ");
		String bmDesc = "'" + scan.nextLine() + "'";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");
			Statement stmt = con.createStatement();
			String sql = "insert into bhc_menu(bm_num, bm_name, bm_type, bm_price, bm_desc)";
			sql += " values(" + bmNum + "," + bmName + "," + bmType + "," + bmPrice + "," + bmDesc + ")";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
