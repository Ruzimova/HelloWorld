package Lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteDatabaseDB {

	public static void main(String[] args) {

// /Users/shahnazaruzimova/mydatabase.db 

		String conUrl = "jdbc:sqlite:/Users/shahnazaruzimova/mydatabase.db";
		String selectall = "select * from contacts";
		String createOrdersTable = "create table if not exists orders(id İnteger, item text, amount int)";
		try {
			Connection conn = DriverManager.getConnection(conUrl);
			Statement statement = conn.createStatement();
			statement.execute(createOrdersTable);

			// statement.execute("insert into orders values(1, 'book', 3);");
			ResultSet contactsData = statement.executeQuery(selectall);
			while (contactsData.next()) {
				System.out.println("Name: " + contactsData.getString("name") +
						" phone: " + contactsData.getInt(2)
						+ " email: " + contactsData.getString(3));
			}

			// Clean up
			contactsData.close();
			statement.close();
			conn.close();
			System.out.println("Executed successfully");

		} catch (SQLException e) {
			System.out.println("Code crashed ");

			e.printStackTrace();
		}

	}

}
