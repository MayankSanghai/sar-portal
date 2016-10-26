<%
session.removeAttribute("Id");
session.removeAttribute("Name");
session.invalidate();

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0); // Proxies.
response.sendRedirect("login.html");
%>
