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
 * Servlet implementation class cause
 */
@WebServlet("/search/cause")
public class cause extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cause() {
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
        out.println("<br><h3>Search for Grant - Cause</h3>");
        out.println("<table><tr><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Education\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Employment\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Gender Equality\">");
        out.println("</form></td></tr>"); 
        
        out.println("<tr><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Hunger\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Culture\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Tech Assitance\">");
        out.println("</form></td></tr>");     
        
        out.println("<tr><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Emergency\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"Startup\">");
        out.println("</form>");
        out.println("</td><td><form method=\"GET\" action=\"/GrantRank/search/revenue\">");
        out.println("<input type=\"submit\" value=\"etc...\">");
        out.println("</form></td></tr></table>");     
        out.println("<br><br>");
        out.println("</body>");
        out.println("</html>"); */
		String content = Utils.readFile("2-form-cause.html", StandardCharsets.UTF_8);
		response.getWriter().append(content);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
