package com.hackingchicago.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Sign-Up</h1>");
		out.println("<br><br><form method=\"POST\" action=\"/GrantRank/SignUpSubmit\">");
		out.println("Username: <input type=\"text\" name=\"username\"> <br><br>");
		out.println("Password: <input type=\"password\" name=\"pw\"> <br><br>");
		out.println("<br><br>");
		out.println("Organization: <input type=\text\" name =\"org\"> <br><br>");
		out.println("Email: <input type=\text\" name =\"email\"> <br><br>");
		out.println("Phone: <input type=\text\" name = \"phone\"> <br><br>");
		out.println("Address: <input type = \"text\" name=\"address\"> <br><br>");
		out.println("<input type =\"submit\">");
		out.println("<input type =\"reset\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
