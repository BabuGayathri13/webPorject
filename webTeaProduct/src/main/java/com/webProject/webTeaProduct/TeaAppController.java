package com.webProject.webTeaProduct;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tea")
public class TeaAppController {
	@Autowired
	private SelectTea select;// Instance of the Selecttea Class.

	/*
	 * @Autowired private Select select;
	 * 
	 * @GetMapping("allItems") public ArrayList<JdbcJava> getAllItems() throws
	 * SQLException { return select.getAllItems(); }
	 */

	@GetMapping("ping")
	public String ping() {
		System.out.println("ping");
		return "pong!";
	}

	@GetMapping("allItems")
	public ArrayList<Entities> allItems() throws SQLException {
		return select.getAllItems();
	}
}
