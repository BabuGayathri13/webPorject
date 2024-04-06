package com.webProject.webTeaProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateJDBCCon {

	public static void main(String[] args) throws Exception {

		String query = "Update tea set name ='Narasush' where tea_id=6";

		String url = "jdbc:mysql://localhost:3306/webtechtea";
		String username = "GayathriB";
		String password = "Sardhu@123";

		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();

		int count = st.executeUpdate(query);
		if (count == 0) {
			System.out.println("Record Not Updated");
		} else {
			System.out.println("Record Updated");
		}

	}

}
