<%@page import="java.sql.*" %> 
<%
	String id=request.getParameter("ID");
	String bdate=request.getParameter("password");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from pid where Id='"+id+"' and Bdate='"+bdate+"' ");
if(rs.next())
{
	session.setAttribute("Name",rs.getString(2));
	session.setAttribute("Bdate",rs.getString(3));
	session.setAttribute("Id",rs.getString(1));
	response.sendRedirect("afterlogin.jsp");
}
else
{
%>
<script language="javascript">
window.alert('Invalid Login ID or Birth Date');
window.location="login.html";
</script>

<%
//response.sendRedirect("login.html");
}
%>



	
