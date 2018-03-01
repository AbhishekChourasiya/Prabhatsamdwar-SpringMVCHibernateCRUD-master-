<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Project</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Project</h1>
        <form:form action="saveProject" method="post" modelAttribute="project">
        <table>
            <tr>
                <td>pid:</td>
                <td><form:input path="pid" /></td>
            </tr>
          
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
             <tr>
                <td>empid:</td>
                <td><form:input path="empid" /></td>
            </tr>
             <tr>
                <td>AssignedOn:</td>
                <td><form:input path="assignedOn" /></td>
            </tr>
             <tr>
                <td>Deadline:</td>
                <td><form:input path="deadline" /></td>
            </tr>
          
          
          
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>