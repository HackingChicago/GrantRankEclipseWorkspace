package com.hackingchicago.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hackingchicago.web.utils.Utils;

/**
 * Servlet implementation class TypeofGrant
 */
@WebServlet("/search/type")
public class TypeofGrant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeofGrant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<br><h1>Search for Grant - Type</h1>");
		out.println("<table><tr><td><form method=\"GET\" action=\"/GrantRank/search/gov\">");
		out.println("<input type=\"submit\" value=\"Government\">");
		out.println("</form>");
		out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/corporate\">");
		out.println("<input type=\"submit\" value=\"Corporate\">");
		out.println("</form></td>");	
		out.println("<td><form method=\"GET\" action=\"/GrantRank/search/cause\">");
		out.println("<input type=\"submit\" value=\"Private\">");
		out.println("</form></td></tr></table>");
		out.println("<br><br>");
		out.println("</body>");
		out.println("</html>");*/
		String content = Utils.readFile("1-form-type.html", StandardCharsets.UTF_8);
		response.getWriter().append(content);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
