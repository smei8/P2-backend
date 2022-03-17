package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection obtainConnection() {
//		String connectionURL = "jdbc:postgresql://localhost:5432/ers";
//		String userName = "postgres";
//		String password = "Aug211997!";
		
		//new connection - aws
		String connectionURL = "jdbc:postgresql://ip-172-31-86-161.ec2.internal:8888/ers";
		
		String userName = "postgres";
		String password = "mysecretpassword";

		if (conn == null) {
			try {
				conn = DriverManager.getConnection(connectionURL, userName, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;

	}
}