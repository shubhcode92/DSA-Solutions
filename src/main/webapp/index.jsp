

<html>
   <head>
   <title>Index Page</title>
   </head>
   <%@ page import="com.shubh.Servlet" %>
   <body>
      Hello World! <br/>
      <%= new Servlet().demo() %> <br/>
      It is the Index page <br/>
      <ul>
        <li> <a href="Contact.jsp"> Contact Page</a> </li>
        <li> <a href="Network.jsp"> Network Page </a> </li>
        <li> <a href="Blog.jsp"> Blog Page </a> </li>

      </ul>


   </body>
</html>
