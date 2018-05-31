<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Employees</h1></br>
<table border="3" style="background-color: orange;width: 25%">
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Edit</th><th>Delete</th> </tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.salary}</td>
<td><a href="editempform/${emp.id}">Edit</a></td>
<td><a href="delete/${emp.id}">Delete</a>
</tr>
</c:forEach>
</table></br>
<a href="empform">Add Employee</a>
<a href="index">Home</a>
</body>
</html>