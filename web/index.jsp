<%@page import="java.sql.*" %>
<%
	String id=request.getParameter("ID");
	String bdate=request.getParameter("password");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from pid where id='"+id+"' and bdate='"+bdate+"' ");
if(rs.next())
{
  
		session.setAttribute("Idno",rs.getString(3));
		session.setAttribute("name",rs.getString(4));
		session.setAttribute("id",rs.getString(1));
		session.setAttribute("bdate",rs.getString(2));
		response.sendRedirect("Details.jsp");
	
}
else
{
}
%>

