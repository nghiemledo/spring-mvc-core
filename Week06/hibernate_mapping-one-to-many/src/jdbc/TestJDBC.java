package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

class TestJDBC {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate-one-to-many?useSSL=false";
		String user = "root";
		String pass = "12345678";
		
		try {
			System.out.println("Connecting to the database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful!");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}