/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gladwin
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PageGenerator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PageGenerator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
          /* a table with three rows and three
            columns, and a headline above the table*/
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<div class='container'>");
            out.println("<table>");
            out.println("<caption>My Reading List</caption>");
            out.println("<th>Author(s)</th>");
            out.println("<th>Book Title</th>");
            out.println("<th>Read?</th>");
            /*out.println("<tr>");
            out.println("<th>Author(s)</th>");
            out.println("<th>Book Title</th>");
            out.println("<th>Read?</th>");
            out.println("</tr>");*/
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
            out.println("<table>");
            out.println("<p><a href='index.html'> Back to Home</a></p>");
            
                        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
