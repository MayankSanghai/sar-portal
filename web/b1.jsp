<%@include file="validatesession.jsp" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="ob" %>
<%@page import="java.sql.*" %>
<%
String Id=(String)session.getAttribute("Id");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from pclubawards where Id='"+Id+"'");
if(rs.next())
{
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<title>Club Information</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <link rel='stylesheet' type='text/css' href='b1.css'/>
        <link rel="stylesheet" href="css/opensans.css"/>
        <link rel="stylesheet" href="jquery-ui.css">
	<script src="jquery-1.10.2.js"></script>
        <script src="jquery-ui.js"></script>
        <script type="text/javascript" src="login.js"></script>
        <script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="css/bootstrap-datepicker3.min.css"/>
        
        <script type="text/javascript">
        	$.fn.datepicker.defaults.format = "dd/mm/yyyy";
        </script>
       
    </head>

    <body>
	
        <div id="outer">
		<div id="upper_float">
                    <div id="logo">
			<a href = "http://manipal.edu/mu.html"><img src="logo2.jpg"/></a>
                        </div>
			<div class="container">
               <ul class="nav nav-tabs">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">My Info
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="afterlogin.jsp">Personal Info</a></li>
                        <li><a href="a2.jsp">Club</a></li>
                        <li><a href="a3.jsp">Startup</a></li> 
                        <li><a href="a4.jsp">Internship Information</a></li> 
                        <li><a href="placement.jsp">Off-Campus Placement Information</a></li> 
                        <li><a href="hstudies.jsp">Higher Studies Information</a></li> 
                    </ul>
                </li>
               <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Competitions
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="b1.jsp">Club</a></li>
                        <li><a href="b2.jsp">Inter-Institute</a></li>
                    </ul>
                </li>
                   <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Research
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="c1.jsp">Research Papers</a></li>
                        <li><a href="c2.jsp">Innovations</a></li> 
                        <li><a href="c4.jsp">Publications</a></li>
                    </ul>
                </li>
               </ul>
               </div>
                     <div id="logout"><a href="logout.jsp">Logout</a></div>
                </div>
        <div id="mid_float">
            <div id="infodiv">
                
        <form action="UpdateDatab1" method="post" autocomplete="off">
        <table id="tableid" width="500" height="150">
            <caption><h3>Club</h3></caption>
                <td></td>
          <tr>
           <td width="300" height="47">Name of club</td>
           <td width="300" height="47"><input type="text" name="ClubName" value="<%=rs.getString(2) %>"></td>
           </tr>
           <tr>
                <td width="300" height="47">Competition Description</td>
                <td width="300" height="47"><textarea rows="3" name="Description"><%=rs.getString(3) %></textarea></td>
            </tr>
            <tr>
           <td width="157" height="47">Position</td>
           <td width="157" height="47"><input type="text" name="Position" value="<%=rs.getString(4) %>"></td>
          </tr>
           <tr>
                <td width="300" height="47">Date</td>
                <td width="300" height="47">
                    <div class="input-group date" data-provide="datepicker">
                    <input type="text" class="form-control" autocomplete="off" name="Date" value="<%=rs.getString(5)%>">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-th"></span>
                    </div>    
                    </div>
                </td>
            </tr>
           <tr>
            <td width="157" height="47"><input type="submit" value="Submit"></td>
            <td></td>
           </tr> 
         </table>
        </form>
            </div>
        </div>
        </div>
                    
        <script type="text/javascript">
            var Msg ='<%=session.getAttribute("getAlert")%>';
            if (Msg != "null")
            {
                function alertName()
                {
                    alert("Information Saved.");
                } 
            }
        </script>          
        <script type="text/javascript"> window.onload = alertName; <%session.setAttribute("getAlert", "null"); %></script>  
                    
    </body>
</html>   
<%
}
%>