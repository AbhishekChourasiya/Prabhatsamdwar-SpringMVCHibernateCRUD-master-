<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Salary Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Salary List</h1>
		
		<table border="1">

			<th>id</th>
			<th>empid</th>
			<th>amount</th>
			<th>month</th>
			<th>year</th>
			

			<c:forEach var="salary" items="${listSalary}">
				<tr>

					<td>${salary.id}</td>
					<td>${salary.empid}</td>
					<td>${salary.amount}</td>
					<td>${salary.month}</td>
					<td>${salary.year}</td>
					<td><a href="editSalary?id=${salary.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteSalary?id=${salary.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Salary Register <a href="newSalary">here</a>
		</h4>
	</div>
</body>
</html>