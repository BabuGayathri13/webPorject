package com.webProject.webTeaProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConDeleteUpdateInsert {

	public static void main(String[] args) {
		try {
			Connection est = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtechtea", "GayathriB",
					"Sardhu@123");

			Statement upData = est.createStatement();// update data to database
			String Query = "Insert into Tea Values('6','Kannan Devan', 'Regular','6','6','25.00','12.99','50','A famous Ooty green tea with a smooth, sweetflavor and a hint of chestnut aroma.')";
			// String Query = "delete from tea where tea_id=7";

			upData.executeUpdate(Query);
			est.close();
			System.out.println("Records updated");

		}

		catch (Exception e) {

		}
	}

}
