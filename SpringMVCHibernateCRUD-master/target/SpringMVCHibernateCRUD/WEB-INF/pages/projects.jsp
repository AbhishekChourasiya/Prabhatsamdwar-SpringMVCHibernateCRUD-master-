<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Project List</h1>
		
		<table border="1">

			<th>pid</th>
			<th>empid</th>
			<th>Project Name</th>
			<th>assignOn</th>
			<th>Deadline</th>
			

			<c:forEach var="project" items="${listProject}">
				<tr>

					<td>${project.pid}</td>
					<td>${project.empid}</td>
					<td>${project.name}</td>
					<td>${project.assignedOn}</td>
					<td>${project.deadline}</td>
					<td><a href="editProject?id=${project.pid}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteProject?id=${project.pid}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New project Register <a href="newProject">here</a>
		</h4>
	</div>
</body>
</html>