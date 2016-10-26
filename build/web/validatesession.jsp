<%
if (session.getAttribute("Name") == null) {
    // Not logged in. Redirect to login page.
    response.sendRedirect("login.html");
} else {

}
%>