package Model;

import java.sql.ResultSet;

public class LoginLogic {
	private String username;
	private String password;
	private String queryString;
	private String role;
	private int value;

	public String getRole(String username, String password, ConnectionUtility connectionUtility) {
		username = this.username;
		password = this.password;

		if (!username.isEmpty() && !password.isEmpty()) {
			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT ROLE from ROLE where UNAME = " + username + " and PASSWORD = " + password;
					connectionUtility.setQuery(queryString);
					ResultSet resultSet = connectionUtility.RunQuery();
					while(resultSet.next()) {
						role = resultSet.getString("ROLE");
					}
				} catch (Exception e) {
					role = null;
				}
			}
		}
		return role;
	}

	public int validateLogin(String username, String password, String role2, ConnectionUtility connectionUtility) {
		username = this.username;
		password = this.password;
		String tableName = null;
		switch (role) {
		case "ADMIN":
			tableName = "ADMIN";
			break;
		case "CUSTOMER":
			tableName = "CUSTOMER";
		case "OPERATOR":
			tableName = "OPERATOR";

		}
		role = role2;

		if (!username.isEmpty() && !password.isEmpty() && !role2.isEmpty() && tableName != null) {

			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT count(*) from " + tableName + " where UNAME = " + username
							+ " and PASSWORD = " + password;
					connectionUtility.setQuery(queryString);
					ResultSet resultSet = connectionUtility.RunQuery();
					while(resultSet.next()) {
						value = resultSet.getInt(1);
					}
					
				} catch (Exception e) {
					value = 0;
				}
			}
		}
		return value;
	}
}
