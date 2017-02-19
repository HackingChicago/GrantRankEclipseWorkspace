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
 * Servlet implementation class revenue
 */
@WebServlet("/search/revenue")
public class revenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public revenue() {
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
        out.println("<br><h3>Search for Grant - Revenue</h3>");
        out.println("<table><tr><td><form method=\"GET\" action=\"/GrantRank/search/amount\">");
        out.println("<input type=\"submit\" value=\"Level A\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/amount\">");
        out.println("<input type=\"submit\" value=\"Level B\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/amount\">");
        out.println("<input type=\"submit\" value=\"Level C\">");
        out.println("</form></td></tr></table>");     
        out.println("<br><br>");
        out.println("</body>");
        out.println("</html>");*/
		String content = Utils.readFile("3-form-revenue.html", StandardCharsets.UTF_8);
		response.getWriter().append(content);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
