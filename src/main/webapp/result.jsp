<%-- 
    Document   : result
    Created on : Sep 7, 2016, 3:11:18 PM
    Author     : Gladwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response Page</title>
         <link href="main.css" media="screen" rel="stylesheet" type="text/css" />
    label{ margin-right:20px;}
    input{ margin-top:5px;}
</style>
    </head>
    <body>
        <h1>Welcome Page</h1>
    </body>
</html>


<%
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            
        %>
<p>Hi <%=firstName%><%=lastName%>!,
</p>
</body>
</html>


<%
String val = request.getParameter("isSubmitted");
int isSubmitted = 0;
if (val != null) {
isSubmitted = Integer.parseInt(val);
if (isSubmitted == 1) {
                     firstName = request.getParameter("firstName");
                     lastName = request.getParameter("lastName");
                    
out.println("<p>Hi " + 
firstName + " "+  lastName);

        }
            }
        %>
<% if (isSubmitted == 0) {%>
<form action="index.jsp"method="post">
<fieldset>
<legend>User Information</legend>
<label for="fistName">First Name</label>
<input type="text"name="firstName"/><br/>
<label for="lastName">Last Name</label>
<input type="text"name="lastName"/><br/>
<input type="hidden"name="isSubmitted"value="1"/>
<input type="submit"value="submit">
</fieldset>
</form>
<%}%>
</body>
</html>