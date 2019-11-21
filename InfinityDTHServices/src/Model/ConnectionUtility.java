package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionUtility {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private int value;
	private String jdbcDriver;
	private String url;
	private String query;
	private String username;
	private String password;

	public ConnectionUtility() {
	}

	public boolean connectDB() {

		boolean status = true;
		jdbcDriver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		username = "system";
		password = "tcs12345";
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(url, username, password);

			if (connection == null) {
				System.out.print("Connection was not established");

			} else {
				System.out.println("Connection is established");

			}

			statement = connection.createStatement();


		} catch (ClassNotFoundException ce) {
			System.out.println("Class not Found: " + ce);
			status = false;
		} catch (SQLException se) {
			System.out.println("SQLException: " + se);
			status = false;
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			status = false;
		}
		return status;
	}

	public void close() {
		try {
			if (resultSet != null) {

				resultSet.close();
			}
			if (statement != null) {

				statement.close();
			}
			if (connection != null) {

				connection.close();

			}

		} catch (SQLException e) {
			System.out.println("SQLException: " + e);
		}

	}

	public ResultSet RunQuery() {
		try {
			resultSet = statement.executeQuery(query);

		} catch (SQLException e) {
// TODO Auto-generated catch block
		}
		return resultSet;
	}
	
	public int UpdateQuery() {
		try {
			value = statement.executeUpdate(query);

		} catch (SQLException e) {
// TODO Auto-generated catch block
		}
		return value;
	}


	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}