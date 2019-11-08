package mavenwebproject;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */

@WebServlet("/hello")
public class SimpleServlet extends HttpServlet {

	   private static final long serialVersionUID = 1L;

	   @Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
	      resp.setContentType("text/plain");

<<<<<<< HEAD
	      resp.getWriter().write("Hello World!!! updates to Maven Web Project Example.");
=======
	      resp.getWriter().write("Hello World!! Maven Web Project Example.");
>>>>>>> 0a4418141d9f14ff2ea3ee44c9c34070b5858ec8



	   }
}
