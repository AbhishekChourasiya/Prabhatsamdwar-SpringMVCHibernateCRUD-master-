<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="/HRM/myHome">Home</a>
  <a href="/HRM/home">All Employees</a>
  <a href="/HRM/projects">All Projects</a>
  <a href="/HRM/salary">All Salary</a>
</div>
 
    <div align="center">
        <h1>New/Edit Salary</h1>
        <form:form action="saveSalary" method="post" modelAttribute="salary">
        <table>
            <form:hidden path="id"/>
                                      
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