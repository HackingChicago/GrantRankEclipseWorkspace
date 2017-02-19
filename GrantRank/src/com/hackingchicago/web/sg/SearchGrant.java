package com.hackingchicago.web.sg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchGrant
 */
@WebServlet("/searchGrant")
public class SearchGrant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGrant() {
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
		out.println("<br><h3>Are you a 501(c)(3) organization?</h3>");
		out.println("<form action=\"/GrantRank/searchGrantSubmit\" method=\"POST\" enctype=\"multipart/form-data\">");
		out.println("<input type=\"file\" name=\"file\" size=\"50\" /><br>");
		out.println("<br><input type=\"submit\" value=\"Yes, please upload doc\">");
		out.println("</form>");
		out.println("<br><form method=\"GET\" action=\"/GrantRank/searchGrantSubmit\">");
		out.println("<input type=\"submit\" value=\"No, nothing to upload\">");
		out.println("</form>");		
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
