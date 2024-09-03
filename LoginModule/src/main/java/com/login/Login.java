package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
private static final long serialVersionUID =1L;

public Login() {
	super();
}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
         String pass = request.getParameter("pass");
        
         //for login print message
         System.out.println("Received username:"+ uname);
         System.out.println("Reeived Password:"+ pass);
         
         LoginDao dao = new LoginDao();
         
         if(dao.check(uname, pass))  
         {
        	 System.out.println("Login successfully for user:"+ uname);
        	 HttpSession session = request.getSession();
        	 session.setAttribute("username", uname);
        	 response.sendRedirect("welcome.jsp");
         }
         
         else {
        	 System.out.println("Login failed for user:"+ uname);
        	 response.sendRedirect("login.jsp");
         }
	}

 

}
