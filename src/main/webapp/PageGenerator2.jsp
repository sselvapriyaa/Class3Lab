<%-- 
    Document   : PageGenerator2
    Created on : Sep 4, 2016, 12:22:30 AM
    Author     : Gladwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
       <title>Activity 3:: JSP table </title>
        <%--<style type ='text/css'>;
             table, th, td{
            border: 1px solid black;
             }
            
            </style>; --%>
    </head>
    <body>              
        
          <%-- out.println("<!DOCTYPE html>");
            //out.println("<html>");
            //out.println("<div class='container'>");
            
            //out.println("<caption>My Reading List</caption>");
           
            //out.println("<style>My Reading List</style>");--%>
            <table>
            
                
              <%-- out.println("<!DOCTYPE html>");
            out.println("<html>");
           out.println("<head>");
            out.println("<div class='container'>");--%>
               <%
                    
            //out.println("<table>");
            //out.println("<caption>My Reading List</caption>");
            //out.println("<title>Activity 2:: Servlet Page Generator </title>");
            //out.println("<style>My Reading List</style>");
            out.println("<style type ='text/css'>");
            out.println(" table, th, td{");
            out.println(" border: 1px solid black;");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Activity 3:: JSP table</h1>");
            for(int row=1;row<4;row++){
                out.println("<tr>");
                for(int col=1;col<4;col++){
                  out.println("<td>R" + row + "C" + col + "</td>");   
                }
                out.println("</tr>");
            }
              out.println("</table>");
              out.println("</body>");
              out.println("</html>");
             
    
            out.println("<p><a href='index.html'> Back to Home</a></p>");
 %>
    
     
                
              
           <%--  out.println("<th>Author(s)</th>");
            out.println("<th>Book Title</th>");
            out.println("<th>Read?</th>");           
            out.println("<tr>");
            out.println("<td>John Steinbeck</td>");
            out.println("<td>The Grapes of Wrathk</td>");   
            out.println("<td>Yes</td>"); 
            out.println("</tr>");
            out.println("<tr>");            
            out.println("<td>Stacy Kaiser</td>");
            out.println("<td>How to Be a Grown Up</td>");   
            out.println("<td>Yes</td>"); 
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Bob Greene</td>");
            out.println("<td>20 Years Younger</td>");   
            out.println("<td>No</td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("</div> <!-- end .container -->");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Table Demo</title>");
            out.println("<style>");
            out.println(" table, th, td{");
            out.println(" border: 1px solid #333;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<p><a href='index.html'> Back to Home</a></p>");
                                  
        --%>
        
    
