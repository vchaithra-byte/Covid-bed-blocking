/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavitha
 */
public class Display extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
                             
            out.println("<title>Servlet display</title>");
            out.println(" <meta charset=\"utf-8\">");
            out.println(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        //  out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"display.css\">");
            out.println(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">"); 
            out.println(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> ");
            out.println(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
            
        out.println("<style>*{\n" +
"    margin:0;\n" +
"    padding: 0;\n" +
"}\n" +
"body{\n" +
"    text-align: center; \n" +

"}"+".header\n" +
"            {\n" +
"                height: 100vh;\n" +
"\n" +
"            }\n" +
"            .navbar-style\n" +
"            {\n" +
"                box-shadow: 0 5px 10px #efefef;\n" +
"                text-transform: uppercase;\n" +
"                background: white;\n" +
"            }\n" +
"            .logo\n" +
"            {\n" +
"                height: 60px;\n" +
"                padding: 5px 10px;\n" +
"                margin-left: 0;\n" +
"            }\n" +
"            .icon-bar\n" +
"            {\n" +
"                background: darkorange;\n" +
"            }\n" +
"            li a\n" +
"            {\n" +
"                color: #333;\n" +
"            }"+".table-container{\n" +
"          padding: 0 10%;\n" +
"          margin: 40px auto 0;\n" +
"      }\n" +
                ".heading{\n" +
"          font-size: 40px;\n" +
"          text-align: center;\n" +
"          color:black;\n" +
"          margin-bottom: 40px;\n" +
"      }"+
"      \n" +
"      .table{\n" +
"          width: 100%;\n" +
"          border-collapse: collapse;\n" +
"      }\n" +
"      .table thead{\n" +
"          background-color:lightskyblue;\n" +
"      }\n" +
"      .table thead tr th{\n" +
"          font-size: 14px;\n" +
"          font-weight: 600;\n" +
"          letter-spacing: 0.35;\n" +
"          color: #FFFFFF;\n" +
"          opacity: 1;\n" +
"          padding: 12px;\n" +
"          vertical-align: top;\n" +
"          border: 1px solid #dee2e685;\n" +
"      }\n" +
"      .table tbody tr td .btn{\n" +
"          width: 130px;\n" +
"          text-decoration: none;\n" +
"          line-height: 35px;\n" +
"          display: block;\n" +
"          background-color: buttonhighlight;\n" +
"      }"
                + "</style>");
        
        
            out.println(" <nav class=\"navbar navbar-style\">\n" +
"            <div class=\"container\">\n" +
"                <div class=\"navbar-header\">\n" +
"                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#micon\">\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    </button>\n" +
"\n" +
"                \n" +
"                </div>\n" +
"                <div class=\"collapse navbar-collapse\" id=\"micon\">\n" +
"                <ul class=\"nav navbar-nav navbar-right\">\n" +
"                <li><a href=\"navbar.html\">Home</a></li>\n" +
"                <li><a href=\"user.jsp\">User Panel</a></li>\n" +
"                <li><a href=\"admin.html\">Admin Panel</a></li>\n" +
"                \n" +
"                </ul>\n" +
"            </div>\n" +
"            </div>\n" +
"            </nav>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='table-container'>");
            out.println("<h1 class='heading'> No.of Bed Details And It's Hash Position </h1>");
            Scanner s =new Scanner(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
            out.println("<table class='table'>");
            out.println("<thead>\n" +
"                <tr>\n" +
"                    <th>#</th>\n" +
"                    <th>Hospital</th>\n" +
"                    <th>Bed Status</th>\n" +
                    "<th>Phone NO.</th>\n"+
                   "<th>Type of Bed</th>\n"+
                   "<th>Address</th>\n"+
                   
"                </tr>\n" +
"            </thead>");
            out.println("<tbody>");
            while(s.hasNext()){
                
                String t[]=s.nextLine().split(",");
                if(t.length!=0)
               
                out.println("<tr><td>"+t[0]+"</td><td>"+t[1]+"</td><td>"+t[2]+"</td><td>"+t[3]+"</td><td>"+t[4]+"</td><td>"+t[5]+"</td></tr>");
                
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
           // out.println("<a href='index.html'>indexpage</a>");
//            out.println("<h1>Servlet Display at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
