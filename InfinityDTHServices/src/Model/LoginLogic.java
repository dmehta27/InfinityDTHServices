package Model;

import java.sql.ResultSet;


public class LoginLogic {

	public String getRole(String username, String password, ConnectionUtility connectionUtility) {
		String queryString = null;
		String role = null;
		if (!username.isEmpty() && !password.isEmpty()) {
			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT ROLE from ROLE where UNAME = " + username + " and PASSWORD = " + password;
					connectionUtility.setQuery(queryString);
					ResultSet resultSet = connectionUtility.RunQuery();
					while (resultSet.next()) {
						role = resultSet.getString("ROLE");
					}
				} catch (Exception e) {
					role = null;
				}
			}
		}
		return role;
	}

	public int validateLogin(String username, String password, String role, ConnectionUtility connectionUtility) {
		String tableName = getTableName(role);
		
		int value = 0;
		if (!username.isEmpty() && !password.isEmpty() && !role.isEmpty() && tableName != null) {
			String queryString = null;
			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT count(*) from " + tableName + " where UNAME = " + username
							+ " and PASSWORD = " + password;
					connectionUtility.setQuery(queryString);
					ResultSet resultSet = connectionUtility.RunQuery();
					while (resultSet.next()) {
						value = resultSet.getInt(1);
					}

				} catch (Exception e) {
					value = 0;
				}
			}
		}
		return value;
	}

	

	public Boolean checkFirstLogin(String username, ConnectionUtility connectionUtility, String role) {
		// TODO Auto-generated method stub
		int status = 0;
		Boolean flag = false;
		String tableName = getTableName(role);
		if (connectionUtility.connectDB()) {
			String queryString = null;
			try {
				queryString = "SELECT flag from " + tableName + " where UNAME = " + username;
				connectionUtility.setQuery(queryString);
				ResultSet resultSet = connectionUtility.RunQuery();
				while(resultSet.next()) {
					status = resultSet.getInt(1);
				}
				if(status!= 0) {
					flag = true;
				}
				
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}

	public boolean updatePassword(String newPassword, String username, String role, ConnectionUtility connectionUtility) {
		int status = 0;
		Boolean flag = false;
		String tableName = getTableName(role);
		if (connectionUtility.connectDB()) {
			String queryString = null;
			try {
				queryString = "Update password from " + tableName + " set Password = " + newPassword + " where EMAIL  = "+username;
				connectionUtility.setQuery(queryString);
				ResultSet resultSet = connectionUtility.RunQuery();
				while(resultSet.next()) {
					status = resultSet.getInt(1);
				}
				if(status!= 0) {
					flag = true;
				}
				
			} catch (Exception e) {
				flag = false;
			}
		}
		return flag;
	}
	public String getTableName(String role) {
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
		return tableName;
	}
}
