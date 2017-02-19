package com.hackingchicago.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpSubmit
 */
@WebServlet("/SignUpSubmit")
public class SignUpSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpSubmit() {
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
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		String org = request.getParameter("org");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		if(username.equals("") || pw.equals("") || org.equals("") || email.equals("") || phone.equals("") || address.equals("")) {
			response.getWriter()
			.append("<html>")
            .append("<body>")
            .append("<br><br><h3>Invalid Fields</h3>")
            .append("Please go back and check your fields.")
            .append("<br><br><a href=\"/GrantRank/SignUp\">Sign-Up</a>")
            .append("</body>")
            .append("</html>");
		}
		else {
			response.sendRedirect("/GrantRank/login");
		}
		
	}

}
