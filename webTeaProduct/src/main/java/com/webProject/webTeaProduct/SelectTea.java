package com.webProject.webTeaProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class SelectTea {

	public ArrayList<Entities> getAllItems() throws SQLException { // creating a mthod to convert the eachrow (types) to
																	// object.

		ResultSet rst = getResultSet();

		// JdbcJava[] a = new JdbcJava[15];
		final ArrayList<Entities> arr = new ArrayList<>();// Storing the retrived object

		while (rst.next()) {
			final Entities row1 = new Entities();// for each row i am creating object
			row1.setTea_id(rst.getString(1)); // and setting the values to the object
			row1.setName(rst.getString(2));
			row1.setType(rst.getString(3));
			row1.setOrigin_id(rst.getString(4));
			row1.setFlavor_id(rst.getString(5));
			row1.setCaffeine_content(rst.getString(6));
			row1.setPrice(rst.getDouble(7));
			row1.setStock_quantity(rst.getDouble(8));
			row1.setDescription(rst.getString(9));
			row1.setFlavor_name(rst.getString(10));
			row1.setOrigin_name(rst.getString(11));

			arr.add(row1);
		}
		return arr;
	}

	protected ResultSet getResultSet() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webtechtea", "GayathriB",
				"Sardhu@123");// this is for connection
		Statement stmt = con.createStatement();

		ResultSet rst = stmt.executeQuery("{CALL SelectTeaDetails()}");

		return rst;

	}

}
