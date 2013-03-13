<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recommendations JSP</title>
</head>
<body>
<h1 align="center">Language Recommendation for <% out.print(request.getParameter("feature")); %></h1>
<%
	List languages = (List)request.getAttribute("languages");
	for(String s : (List<String>) languages) {
		out.print("<br/>"+s);
	}
%>

</body>
</html>