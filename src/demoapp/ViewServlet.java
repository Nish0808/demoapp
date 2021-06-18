/**
 * @author Nishant.Mohan
 */

package demoapp;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getDetails")

public class ViewServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		out.println("<h1>This is a hello world application....</h1>");
		out.println("");
		out.println("Fetching information from Kubernetes Secret");
		String dbUser = System.getenv("DB_USER");
		String dbPass = System.getenv("DB_PASS");
		out.println("</br>");
		out.println("DB USER is :"+dbUser);
		out.println("</br>");
		out.println("DB PASSWORD is :"+dbPass);
		out.println("</br>");
		
		out.println("Reading the content of Kubernetes Configmap mounted inside Pod at /opt/cmap");
		out.println("</br>");
		File file = new File("/opt/cmap/sample.properties"); 
	    Scanner sc = new Scanner(file); 
	    
	    while (sc.hasNextLine()) {
	    	out.println(sc.nextLine()+"</br>");
	    }
	    sc.close();
		out.close();
		
	}
}
