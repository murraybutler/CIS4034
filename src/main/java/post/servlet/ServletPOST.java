package post.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPOST extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// set response headers
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		// create HTML form
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n")
			  .append("<html>\r\n")
			  .append("		<head>\r\n")
			  .append("			<title>Form input</title>\r\n")
			  .append("		</head>\r\n")
			  .append("		<body>\r\n")
			  .append("			<form action=\"servpost\" method=\"POST\">\r\n")
			  .append("				Enter: \r\n")
			  .append("				<input type=\"text\" name=\"entry\" />\r\n")
			  .append("				<input type=\"submit\" value=\"Submit\" />\r\n")
			  .append("			</form>\r\n")
			  .append("		</body>\r\n")
			  .append("</html>\r\n");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String entry = request.getParameter("entry");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		// create HTML response
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n")
			  .append("<html>\r\n")
			  .append("		<head>\r\n")
			  .append("			<title>POST RESPONSE</title>\r\n")
			  .append("		</head>\r\n")
			  .append("		<body>\r\n");
		if (entry != null && !entry.trim().isEmpty()) {
			writer.append("	You entered " + entry + ".\r\n");
		} else {
			writer.append("	Your entry was invalid.\r\n");
		}
		writer.append("		</body>\r\n")
			  .append("</html>\r\n");
	}	
	
}
