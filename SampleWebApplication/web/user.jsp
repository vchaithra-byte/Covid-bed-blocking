<%@page import="java.util.Scanner"%>
<%@page import="java.io.File"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
  <title>Covid Details</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
      *{
          margine: 0;
          padding: 0;
          box-sizing: border-box;
      }
      .header
        {
            height: 100vh;

        }
        .navbar-style
        {
            box-shadow: 0 5px 10px #efefef;
            text-transform: uppercase;
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
    
        .btn{
            
            width: 130px;
          text-decoration: none;
          line-height: 35px;
          display: block;
          background-color: buttonhighlight;
        }
      body{
          background-color:white;
          font-family: sans-serif;
      }
      .table-container{
          padding: 0 10%;
          margin: 40px auto 0;
      }
      .heading{
          font-size: 40px;
          text-align: center;
          color:black;
          margin-bottom: 40px;
      }
      .table{
          width: 100%;
          border-collapse: collapse;
      }
      .table thead{
          background-color:lightskyblue;
      }
      .table thead tr th{
          font-size: 14px;
          font-weight: 600;
          letter-spacing: 0.35;
          color: #FFFFFF;
          opacity: 1;
          padding: 12px;
          vertical-align: top;
          border: 1px solid #dee2e685;
      }
      .table tbody tr td .btn{
          width: 130px;
          text-decoration: none;
          line-height: 35px;
          display: block;
          background-color: buttonhighlight;
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
    <div class = "table-container">
        <h1 class="heading">Covid Treatment Hospitals in Bangalore</h1>
        <!--<div class="search">-->
        <a href="search.jsp" class="btn" > Search</a><br>
        <!--</div>-->
        <table class ="table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Hospital</th>
                    <th>Bed Status</th>
                    <th>Phone Number</th>
                    <th>Address</th>
                    <th>Register</th>
                </tr>
            </thead>
            <tbody>
              
                <%
              Scanner s =new Scanner(new File("C:\\Users\\Kavitha\\Desktop\\data\\data.txt"));
              while(s.hasNext()){
                
                String t[]=s.nextLine().split(",");
                if(t.length!=0)
               
               out.print("<tr><td data-label='#'>"+t[0]+"</td><td data-label='Hospital'>"+t[1]+"</td><td data-label='Bed Status'>"+t[2]+"</td><td data-label='Phone Number'>"+t[3]+"</td><td data-label='Address'>"+t[5]+"</td><td data-label='Reister'><a href='Register.html' class='btn'>Register Now</a></td></tr>");
                
            }
                %>
             
               
            </tbody>
        </table>
    </div>

</body>
</html>