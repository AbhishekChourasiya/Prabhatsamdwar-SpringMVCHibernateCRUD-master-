<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Salary</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Salary</h1>
        <form:form action="saveSalary" method="post" modelAttribute="salary">
        <table>
            <tr>
                <td>id:</td>
                <td><form:input path="id" /></td>
            </tr>
          
            <tr>
                <td>empid:</td>
                <td><form:input path="empid" /></td>
            </tr>
             <tr>
                <td>amount:</td>
                <td><form:input path="amount" /></td>
            </tr>
             <tr>
                <td>month:</td>
                <td><form:input path="month" /></td>
            </tr>
             <tr>
                <td>year:</td>
                <td><form:input path="year" /></td>
            </tr>
          
          
          
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>