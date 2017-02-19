package com.hackingchicago.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.*;
import java.util.*;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.hackingchicago.web.utils.Utils;

/**
 * Servlet implementation class OrgInfoSubmit
 */
@WebServlet("/orInfoSubmit")
public class OrgInfoSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrgInfoSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 250 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file ;

    public void init( ){
       // Get the file location where it would be stored.
//       filePath = 
//              getServletContext().getInitParameter("file-upload"); 
       
       filePath = Utils.TEMP_DATA_FOLDER;
    }
    public void doPost(HttpServletRequest request, 
                HttpServletResponse response)
               throws ServletException, java.io.IOException {
       // Check that we have a file upload request
       isMultipart = ServletFileUpload.isMultipartContent(request);
       response.setContentType("text/html");
       java.io.PrintWriter out = response.getWriter( );
       if( !isMultipart ){
          out.println("<html>");
          out.println("<head>");
          out.println("<title>Servlet upload</title>");  
          out.println("</head>");
          out.println("<body>");
          out.println("<p>No file uploaded</p>"); 
          out.println("</body>");
          out.println("</html>");
          return;
       }
       DiskFileItemFactory factory = new DiskFileItemFactory();
       // maximum size that will be stored in memory
       factory.setSizeThreshold(maxMemSize);
       // Location to save data that is larger than maxMemSize.
       factory.setRepository(new File(Utils.TEMP_FOLDER));

       // Create a new file upload handler
       ServletFileUpload upload = new ServletFileUpload(factory);
       // maximum file size to be uploaded.
       upload.setSizeMax( maxFileSize );

       try{ 
       // Parse the request to get file items.
       List fileItems = upload.parseRequest(request);
 	
       // Process the uploaded file items
       Iterator i = fileItems.iterator();

       out.println("<html>");
       out.println("<head>");
       out.println("<title>Servlet upload</title>");  
       out.println("</head>");
       out.println("<body>");
       out.println("<h1>Organization Info</h1>");
       out.println("<br>");
       while ( i.hasNext () ) 
       {
          FileItem fi = (FileItem)i.next();
          if ( !fi.isFormField () )	
          {
             // Get the uploaded file parameters
             String fieldName = fi.getFieldName();
             String fileName = fi.getName();
             String contentType = fi.getContentType();
             boolean isInMemory = fi.isInMemory();
             long sizeInBytes = fi.getSize();
             // Write the file
             if( fileName.lastIndexOf("\\") >= 0 ){
                file = new File( filePath + 
                fileName.substring( fileName.lastIndexOf("\\"))) ;
             }else{
                file = new File( filePath + 
                fileName.substring(fileName.lastIndexOf("\\")+1)) ;
             }
             fi.write( file ) ;
             if(!fileName.isEmpty()) {
            	 out.println("Uploaded Filename: " + fileName + "<br>");
             }     
          }
       }
		out.println("<br><form method=\"POST\" action=\"/GrantRank/questionsPage\">");
		out.println("Proceed to pages. <input type=\"submit\" value=\"Questions Pages\">");
		out.println("</form>");
       out.println("</body>");
       out.println("</html>");
    }catch(Exception ex) {
        System.out.println(ex);
    }
    }   
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
}
