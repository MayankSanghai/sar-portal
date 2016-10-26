<%@page import="java.sql.*"%>
<%@page import="java.util.StringTokenizer"%>
<%
boolean connect;
String file=request.getParameter("file");
String Id=(String)session.getAttribute("Id");
	 	Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	PreparedStatement update,insert=null;
	update=con.prepareStatement("update pid set Image=? where Id=?");
	update.setString(1,Image);
	update.setString(2,Id);
	update.executeUpdate();
	response.sendRedirect("UploadImageServlet");

%>
