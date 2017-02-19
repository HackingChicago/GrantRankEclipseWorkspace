package com.hackingchicago.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrgInfo
 */
@WebServlet("/orInfo")
public class OrgInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrgInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Organization Info</h1>");
        out.println("<br><br>");
        out.println("<form action=\"/GrantRank/orInfoSubmit\" method=\"post\" enctype=\"multipart/form-data\">");
        out.println("<table><tr><td>Description of the organization");
        out.println("</td><td>");
        out.println("<input type=\"file\" name=\"file\" size=\"50\" />");
        out.println("</td></tr>");
        out.println("<tr><td>List of board members");
        out.println("</td><td><input type=\"file\" name=\"file\" size=\"50\" />");
        out.println("</td></tr>");
        out.println("<tr><td>Audited financial statements");
        out.println("</td><td><input type=\"file\" name=\"file\" size=\"50\" />");
        out.println("</td></tr>");
        out.println("<tr><td>Internal Revenue Service verification");
        out.println("</td><td><input type=\"file\" name=\"file\" size=\"50\" />");
        out.println("</td></tr><tr><td>");
        out.println("<input type=\"submit\" value=\"Upload File\" />");
        out.println("</td><td></td><tr>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
	
	
}
