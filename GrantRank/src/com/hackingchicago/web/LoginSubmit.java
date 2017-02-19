package com.hackingchicago.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSubmit
 */
@WebServlet("/loginSubmit")
public class LoginSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		if(username.equals("johndoe") && passwd.equals("1234")) {
			response.sendRedirect("/GrantRank/questionsPage");
		} else {			
			response.getWriter()			
			.append("<html>")
			.append("<body>")
			.append("<br><br><h3>Invalid Login</h3>")
			.append("<br><br>Password is invalid for this user: "+username)
			.append("<br><br><a href=\"/GrantRank/login\">Re-login</a>")
			.append("</body>")
			.append("</html>");				
			
		}
		
	}

}
