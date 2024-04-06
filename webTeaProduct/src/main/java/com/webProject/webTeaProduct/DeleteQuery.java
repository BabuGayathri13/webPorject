package com.webProject.webTeaProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the ID of the record to delete
		System.out.print("Enter the tea_id  to delete: ");
		int tea_id = scanner.nextInt();

		// Construct the SQL query dynamically with user input
		String query = "DELETE FROM tea WHERE tea_id = " + tea_id;

		String url = "jdbc:mysql://localhost:3306/webtechtea";
		String username = "GayathriB";
		String password = "Sardhu@123";

		// Establish connection
		try (Connection con = DriverManager.getConnection(url, username, password);
				Statement st = con.createStatement()) {
			// Execute the query
			int count = st.executeUpdate(query);
			if (count == 0) {
				System.out.println("Record with tea_id " + tea_id + " not found or not deleted.");
			} else {
				System.out.println("Record with tea_id " + tea_id + " deleted successfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close scanner
			scanner.close();
		}
	}
}
