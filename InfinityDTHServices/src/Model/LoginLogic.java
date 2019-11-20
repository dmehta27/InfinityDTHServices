package Model;

import java.sql.ResultSet;


public class LoginLogic {

	public String getRole(String username, String password, ConnectionUtility connectionUtility) {
		String queryString = null;
		String role = null;
		if (!username.isEmpty() && !password.isEmpty()) {
			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT ROLE from ROLE where UNAME  = '" + username + "' and PASSWORD = '" + password + "'";
//					System.out.println(queryString);
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
		System.out.println("tableName :"+tableName + " Role :"+role);
		int value = 0;
		if (!username.isEmpty() && !password.isEmpty() && !role.isEmpty() && tableName != null) {
			String queryString = null;
			if (connectionUtility.connectDB()) {
				try {
					queryString = "SELECT count(*) from " + tableName + " where EMAIL  = '" + username
							+ "' and PASSWORD = '" + password + "'";
//					System.out.println(queryString);
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
				queryString = "SELECT flag from " + tableName + " where EMAIL  = '" + username+ "'";
				System.out.println(queryString);
				connectionUtility.setQuery(queryString);
				ResultSet resultSet = connectionUtility.RunQuery();
				while(resultSet.next()) {
					status = resultSet.getInt(1);
				}
				if(status== 0) {
					flag = true;
				}
				else {
					flag = false;
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
				queryString = "Update " + tableName + " set Password = '" + newPassword + "' where EMAIL  = '"+username+ "'";
//				System.out.println(queryString);
				connectionUtility.setQuery(queryString);
				status = connectionUtility.UpdateQuery();
				
				System.out.println(status);
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
//		System.out.println("roleee :" + role);
		switch (role) {
		case "ADMIN":
			tableName = "ADMIN";
			break;
		case "Customer":
			tableName = "CUSTOMER";
			break;
		case "OPERATOR":
			tableName = "OPERATOR";
			break;

		}
		return tableName;
	}
}
