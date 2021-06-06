<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello This is First Page Using Jsp!</h1>
        <hr>
        
        <%
            int num = 50;
        %>
        
        <b> <% out.write(num+""); %> </b>
            
    </body>
</html>
