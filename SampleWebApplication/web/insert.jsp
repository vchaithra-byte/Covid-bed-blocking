<%-- 
    Document   : insert
    Created on : 6 Jul, 2021, 4:54:50 PM
    Author     : Kavitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>JSP Page</title>
        <style type="text/css">
            *{
                margin: 0;
                padding: 0;
            }
            body{
                background-color: lightskyblue;
            }
            div.main{
                width: 950px;
                margin: 100px auto 0px auto;
            }
            h1{
                text-align: center;
                padding: 20px;
                font-family: sans-serif;
                font-size: 60px;
            }
            div.register{
                background-color: rgba(0,0,0,0.5);
                width: 100%;
                font-size: 18px;
                border-radius: 10px;
                border: 1px solid rgba(255,255,255,0.3);
                box-shadow: 2px 2px 2px 15px rgba(0,0,0,0.3);
                color: #fff;
            }
            form#register{
                margin: 40px;
            }
            label{
                font-family: sans-serif;
                font-size: 18px;
                font-style: bold;
            }
            input#name{
                width:300px;
                border: 1px solid #ddd;
                border-radius: 3px;
                outline: 0;
                padding: 7px;
                background-color: #fff;
                box-shadow: 1px 1px 5px rgba(0,0,0,0.3);
            }
            input#submit{
                width: 200px;
                padding: 7px;
                font-size: 16px;
                font-family: sans-serif;
                font-weight: 600;
                border: none;
                border-radius: 3px;
                background-color: rgba(250,100,0,0.8);
                color: #fff;
                cursor: pointer;
                border: 1px solid rgba(255,255,255,0.3);
                box-shadow: 1px 1px 5px rgba(0,0,0,0.3);
                margin-bottom: 20px;
            }
            label,span,h2{
                text-shadow: 1px 1px 5px rgba(0,0,0,0.3);
            }
            div.insertclass{
                text-align: center;
                margin: 150px;
                 width: 500px;
    margin: 100px auto 0px auto;
    height: 600px;
    text-align: center;
    padding: 30px;
    font-family: sans-serif;
    font-size: 20px;
    background-color: rgba(0,0,0,0.5);
    
    border-radius: 10px;
    border: 1px solid rgba(255,255,255,0.3);
    box-shadow: 2px 2px 2px 15px rgba(0,0,0,0.3);
    color: black;
    border: 1px solid grey;
            }
             .header
            {
                height: 100vh;

            }
            .navbar-style
            {
                box-shadow: 0 5px 10px #efefef;
                text-transform: uppercase;
                background: white;
            }
            .logo
            {
                height: 60px;
                padding: 5px 10px;
                margin-left: 0;
            }
            .icon-bar
            {
                background: darkorange;
            }
            li a
            {
                color: #333;
            }
      
        </style>
        <nav class="navbar navbar-style">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#micon">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    </button>

                
                </div>
                <div class="collapse navbar-collapse" id="micon">
                <ul class="nav navbar-nav navbar-right">
                <li><a href="navbar.html">Home</a></li>
                <li><a href="user.jsp">User Panel</a></li>
                <li><a href="admin.html">Admin Panel</a></li>
                </ul>
                </div>
            </div>
   </nav>

    </head>
    <body>
        <h1>Insert Hospital Details</h1>
        <div class="insertclass">
        <form action="Insert" >
            <input type="text" name="name" placeholder="Name" id="name"/><br> <br>   
            <input type="text" name="bed" placeholder="No. of beds Available" id="name" /><br><br>
            <input type="text" name="typeofbed" placeholder="Type of bed" id="name"/><br><br>
            <input type="text" name="Phoneno" placeholder="Phone no." id="name"/><br><br>
            <input type="text" name="Address" placeholder="Address" id="name" /><br>
            <br>
            <input type="submit"id="submit"/>
        </form>
           
        <%
            if(request.getAttribute("succ")!=null){
                out.print("<p>Successfully Inserted!!</p>");
            }
        %>
         </div>
    </body>
</html>
