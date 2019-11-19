package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;

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
//		System.out.print("IN post");
		ConnectionUtility connectionUtility = new ConnectionUtility();
		String option = request.getParameter("operator");
		String role;
		int value;
		switch (option) {
		case "login":
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			LoginLogic loginLogic = new LoginLogic();
			role = loginLogic.getRole(username, password, connectionUtility);
			if (role != null) {
				value = loginLogic.validateLogin(username, password, role, connectionUtility);
				if (value == 1) {
					switch (role) {
					case "ADMIN":
						response.sendRedirect("admin.jsp");
						break;
					case "OPERATOR":
						response.sendRedirect("operator.jsp");
						break;
					case "CUSTOMER":
						response.sendRedirect("customer.jsp");
						break;
					}

				} else {
					response.sendRedirect("index.jsp");
				}
			} else {
				response.sendRedirect("index.jsp");
			}

			break;
		}

	}

}
