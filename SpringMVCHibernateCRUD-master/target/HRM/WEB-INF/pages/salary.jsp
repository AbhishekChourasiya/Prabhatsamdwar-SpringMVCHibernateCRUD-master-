<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

#header{
 margin-left: 27px;
}
#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 80%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
  margin-left: 25px;
}

#printBtn {
width: 10%;
font-size: 16px;
padding: 10px 18px 10px 37px;
border: 1px solid #ddd;
margin-bottom: 10px;
}

#myTable {
  border-collapse: collapse;
  width: 100%;
  border: 1px solid #ddd;
  font-size: 18px;
}

#myTable th, #myTable td {
  text-align: left;
  padding: 12px;
}

#myTable tr {
  border-bottom: 1px solid #ddd;
}

#myTable tr.header, #myTable tr:hover {
  background-color: #f1f1f1;
}
</style>
</head>
<body>

<h1 id="header">Salary Report</h2>

<input type="text" id="myInput" onkeydown="myfunc(event)" placeholder="Search for empid.." title="Type in a employee id">
<input id="printBtn" type="button" onclick="printDiv('printableArea')" value="Print Report" />
	
<div  id="printableArea" style="margin-left: 26px;">
   
<table id="myTable">
  <tr class="header">
   			<th>TxnId</th>
			<th>empid</th>
			<th>amount</th>
			<th>month</th>
			<th>year</th>
			<th>options</th>
  </tr>
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

<script>
 
function myfunc(e) {
	 e = e || window.event;
	    var code = e.keyCode;
	   // alert (code);
	    if(code==13){
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
	    }
}


//method to print/export  the page as pdfs
function printDiv(divName) {
	document.getElementById("printBtn").style.display="none";
	
    var printContents = document.getElementById("printableArea");
    
    var originalContents = document.body.innerHTML;
   
   // document.body.innerHTML = printContents;

    window.print(printContents);
    document.getElementById("printBtn").style.display="block";
    
    chart.render();
  
    document.body.innerHTML = originalContents;
   
   
}
</script>
</div>
</body>
</html>
