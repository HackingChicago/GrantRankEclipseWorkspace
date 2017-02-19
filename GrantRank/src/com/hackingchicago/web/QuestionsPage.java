package com.hackingchicago.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuestionsPage
 */
@WebServlet("/questionsPage")
public class QuestionsPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionsPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<br><h3>Questions Page</h3>");
		out.println("<table><tr><td><form method=\"POST\" action=\"/GrantRank/orInfo\">");
		out.println("<input type=\"submit\" value=\"Organization Info\">");
		out.println("</form>");
		out.println("</td><td><form method=\"POST\" action=\"/GrantRank/searchGrant\">");
		out.println("<input type=\"submit\" value=\"Search Grant\">");
		out.println("</form></td></tr></table>");		
		out.println("<br><br>");
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
