<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%

   String username =(String) session.getAttribute("username");
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1


     response.setHeader("Pragma", "no-cache"); //HTTP 1.0

     response.setHeader("Expires", "0");  //Proxies
     
   if(session.getAttribute("username")!= null)
   {
	  out.println("Welcome: " + username);
   }
   else{
	   response.sendRedirect("login.jsp");
   }

%>

	<br />
	<a href="videos.jsp">Videos here</a>

	<form action="Logout">

		<input type="submit" value="Logout" />
	</form>
</body>
</html>