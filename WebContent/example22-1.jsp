<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>example22-1</title>
</head>
<body>
	<jsp:useBean id="book" class="com.edu.beans.BookBean" />
	<jsp:setProperty property="*" name="book"/>
	
	<%
		session.setAttribute("book", book);
	%>
	
	<jsp:forward page="bookOutput.jsp" />
</body>
</html>