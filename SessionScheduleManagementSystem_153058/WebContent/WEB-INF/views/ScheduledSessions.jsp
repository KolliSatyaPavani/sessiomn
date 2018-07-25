<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<%-- <h2>Welcome ${customer.name}</h2> --%>
		<br>
		<h2>Scheduled Sessions</h2>
		<table border="3">
		<tr>
		<th>SessionId</th>
		<th>SessionName</th>
		<th>Duration</th>
		<th>Faculty</th>
		<th>Mode</th>
		<th>Enrollment</th>
		</tr>
		<c:forEach items="${session}" var="sessions">
		<tr>
		<td>${sessions.id}</td>
		<td>${sessions.name}</td>
		<td>${sessions.duration}</td>
		<td>${sessions.faculty}</td>
		<td>${sessions.mode1}</td>
		<td><a href="enroll">Enroll me</a></br></td>
		</tr>
		</c:forEach>
		</table>
		 
	</div>
</body>
</html>