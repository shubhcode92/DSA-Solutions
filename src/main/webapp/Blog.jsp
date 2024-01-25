<html>
   <head>
   <title>Blog Page</title>
   </head>
   <%@ page import="com.shubh.Servlet" %>
   <body>
      Hello World! <br/>
      <%= new Servlet().demo() %> <br/>
      It is the Blog page <br/>
      <ul>
        <li> <a href="index.jsp"> Home Page</a> </li>
        <li> <a href="Network.jsp"> Network Page </a> </li>

      </ul>


   </body>
</html>