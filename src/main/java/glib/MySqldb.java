package glib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Listeners;

@Listeners(Listner.class)
public class MySqldb {
	Connection conn = null;

	public void connectdb() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog_l2wish", "root", "pass");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		// conn.close();
	}

	Statement stmt = null;

	public void writebd(String query) {
		try {

			// String sql = "SELECT id, first, last, age FROM Registration";
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			/*
			 * ResultSet rs = stmt.executeQuery(query); // STEP 5: Extract data
			 * from result set while (rs.next()) { // Retrieve by column name
			 * int id = rs.getInt("id"); int age = rs.getInt("age"); String
			 * first = rs.getString("first"); String last =
			 * rs.getString("last");
			 *
			 * // Display values System.out.print("ID: " + id);
			 * System.out.print(", Age: " + age); System.out.print(", First: " +
			 * first); System.out.println(", Last: " + last); } rs.close();
			 */

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
