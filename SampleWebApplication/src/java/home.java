/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

/**
 *
 * @author alekh
 */
public class home extends HttpServlet {

    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //action perform in doget method
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        
        //accept value from html
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String age=request.getParameter("age");
        String gender=request.getParameter("gender");
        String phone=request.getParameter("phone");
        String symptoms=request.getParameter("symptoms");
        String test=request.getParameter("test");
        String result=request.getParameter("result");
        String bed=request.getParameter("bed_type");
        String hospital=request.getParameter("hospital");
        FileWriter pf= new FileWriter(new File("C:/Users/Kavitha/Desktop/data/patient.txt"),true);
        
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
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
            out.println("<title>Servlet NewServlet</title>");
            out.println(" <meta charset=\"utf-8\">");
            out.println(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">");
            out.println(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">"); 
            out.println(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> ");
            out.println(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<div class=\"big-text\">");
            out.println("<h1>Patient Summary</h1>");
            out.println("</div>");
            out.println("<div class=\"small-text\">");
           out.println("<h3>Patient Name: "+ fname+" " +lname +"</h3>");
            out.println("<h3>Age: "+ age+"</h3>");
             out.println("<h3>Gender: "+gender+ "</h3>");
              out.println("<h3>Phone Number: "+ phone+"</h3>");
               out.println("<h3>Symtoms: "+ symptoms+"</h3>");
                out.println("<h3>Covid Test Done? "+test+"</h3>");
                out.println("<h3>Covid Test Result: "+result+"</h3>");
                 out.println("<h3>Required Bed type: "+ bed+"</h3>");
                 out.println("<h3> Your Bed is Confirmed in: "+ hospital+" Hospital</h3>");
                 pf.append("\n "+fname+","+lname+","+age+","+gender+","+phone+","+symptoms+","+test+","+result+","+bed+","+hospital);
                 pf.close();
                 out.println("</div>");
            out.println("</body>");
            out.println("</html>");
         
         
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
