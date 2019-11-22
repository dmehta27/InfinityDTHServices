package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.ConnectionUtility;
import Model.LoginLogic;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// TODO Auto-generated method stub
// System.out.print("IN post");
		HttpSession session = request.getSession();
		ConnectionUtility connectionUtility = new ConnectionUtility();
		String option = request.getParameter("operator");
		String role;
		int value;
		switch (option) {
		case "login":
			String username = request.getParameter("username").toLowerCase().trim();
			String password = request.getParameter("password");
			if (username.equalsIgnoreCase("admin@dth.com") && password.equalsIgnoreCase("admin")) {
				response.sendRedirect("adminLogin.jsp");
			} else {
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				LoginLogic loginLogic = new LoginLogic();
				role = loginLogic.getRole(username, password, connectionUtility);
				System.out.println(role);
				session.setAttribute("role", role);
				if (role != null) {
					value = loginLogic.validateLogin(username, password, role, connectionUtility);
					if (value == 1) {
						System.out.println("validated Login");
						if (loginLogic.checkFirstLogin(username, connectionUtility, role)) {
							response.sendRedirect("changePassword.jsp");
						} else {
							switch (role) {
							case "ADMIN":
								response.sendRedirect("admin.jsp");
								break;
							case "Operator":
								response.sendRedirect("operatorsuccess.jsp");
								break;
							case "Customer":
								response.sendRedirect("customersuccess.jsp");
								break;
							}
						}
					} else {
						session.invalidate();
						request.setAttribute("errorMessage", "Invalid user or password");
						RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
						rd.forward(request, response);
					}
				} else {
					session.invalidate();
					request.setAttribute("errorMessage", "Invalid user or password");
					RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
					rd.forward(request, response);
				}
			}

			break;
		case "passowrdManagement":
			String newPassword = request.getParameter("pwd1");
			LoginLogic loginLogic = new LoginLogic();
			if (loginLogic.updatePassword(newPassword, (String) session.getAttribute("username"),
					(String) session.getAttribute("role"), connectionUtility)) {
//				
				switch ((String) session.getAttribute("role")) {
				case "ADMIN":
					response.sendRedirect("admin.jsp");
					break;
				case "Operator":
					response.sendRedirect("operatorsuccess.jsp");
					break;
				case "Customer":
					response.sendRedirect("customersuccess.jsp");
					break;
				}
			} else {
				response.sendRedirect("customersuccess.jsp");
			}
			break;
		}

	}

}