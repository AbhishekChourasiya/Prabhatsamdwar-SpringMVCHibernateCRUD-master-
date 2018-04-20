 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Template by Quackit.com -->
<!-- Images by various sources under the Creative Commons CC0 license and/or the Creative Commons Zero license. 
Although you can use them, for a more unique website, replace these images with your own. -->
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->




<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">


    <title>Human Resource management System</title>

    <!-- Bootstrap Core CSS -->
    
    <style>
    
    <style>

body{
    background:#FCFCFC;    
}

.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

.button2 {background-color: #008CBA;} /* Blue */
.button3 {background-color: #f44336;} /* Red */ 
.button4 {background-color: #e7e7e7; color: black;} /* Gray */ 
.button5 {background-color: #555555;} /* Black */

    
.pr-12 {
    padding-right: 12px !important;
}

.mb-20 {
    margin-bottom: 20px !important;
}

.b-1 {
    border: 1px solid #ebebeb !important;
}

.card {
    border: 0;
    border-radius: 0;
    margin-bottom: 30px;
    -webkit-transition: .5s;
    transition: .5s;
}

.card {
    position: relative;
    display: -ms-flexbox;
    display: flex;
    -ms-flex-direction: column;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background-color: #fff;
    background-clip: border-box;
    border: 1px solid rgba(0,0,0,.125);
    border-radius: .25rem;
}

.media {
    padding: 16px 12px;
    -webkit-transition: background-color .2s linear;
    transition: background-color .2s linear;
}

.media {
    display: -ms-flexbox;
    display: flex;
    -ms-flex-align: start;
    align-items: flex-start;
}

.card-body {
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    padding: 1.25rem;
}

.media .avatar {
    flex-shrink: 0;
}

.no-radius {
    border-radius: 0 !important;
}

.avatar-xl {
    width: 64px;
    height: 64px;
    line-height: 64px;
    font-size: 1.25rem;
}

.avatar {
    position: relative;
    display: inline-block;
    width: 36px;
    height: 36px;
    line-height: 36px;
    text-align: center;
    border-radius: 100%;
    background-color: #f5f6f7;
    color: #8b95a5;
    text-transform: uppercase;
}

img {
    max-width: 100%;
}

img {
    vertical-align: middle;
    border-style: none;
}

.mb-2 {
    margin-bottom: .5rem!important;
}

.fs-20 {
    font-size: 20px !important;
}

.pr-16 {
    padding-right: 16px !important;
}

.ls-1 {
    letter-spacing: 1px !important;
}

.fw-300 {
    font-weight: 300 !important;
}

.fs-16 {
    font-size: 16px !important;
}

.media-body>* {
    margin-bottom: 0;
}

small, time, .small {
    font-family: Roboto,sans-serif;
    font-weight: 400;
    font-size: 11px;
    color: #8b95a5;
}

.fs-14 {
    font-size: 14px !important;
}

.mb-12 {
    margin-bottom: 12px !important;
}

.text-fade {
    color: rgba(77,82,89,0.7) !important;
}

.card-footer:last-child {
    border-radius: 0 0 calc(.25rem - 1px) calc(.25rem - 1px);
}

.card-footer {
    background-color: #fcfdfe;
    border-top: 1px solid rgba(77,82,89,0.07);
    color: #8b95a5;
    padding: 10px 20px;
}

.flexbox {
    display: -webkit-box;
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
}

.align-items-center {
    -ms-flex-align: center!important;
    align-items: center!important;
}

.card-footer {
    padding: .75rem 1.25rem;
    background-color: rgba(0,0,0,.03);
    border-top: 1px solid rgba(0,0,0,.125);
}


.card-footer {
    background-color: #fcfdfe;
    border-top: 1px solid rgba(77, 82, 89, 0.07);
    color: #8b95a5;
    padding: 10px 20px
}

.card-footer>*:last-child {
    margin-bottom: 0
}

.hover-shadow {
    -webkit-box-shadow: 0 0 35px rgba(0, 0, 0, 0.11);
    box-shadow: 0 0 35px rgba(0, 0, 0, 0.11)
}

.fs-10 {
    font-size: 10px !important;
}

</style>   

 
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom Fonts from Google -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    
</head>

<body>
 
	<!-- Header -->
    <header>
    <br><br><br><br><br>
   
			<c:forEach var="project" items="${listProject}">
				<tr>
				
				<div class="col-md-10">
    <div class="card b-1 hover-shadow mb-20">
        <div class="media card-body">
            <div class="media-left pr-32" style=" margin-left: 30px;margin-right: 20px;">
                <img style=" height: 200px; width: 200px;"  src="https://upload.wikimedia.org/wikipedia/commons/a/a1/Project_logo_280x280.png" alt="...">
            </div>
            
            <div class="media-body">
            <hr><br>
                <div class="mb-2">
                    <span class="fs-20 pr-16">Project name: ${project.name}</span>
                      
                  
                </div>
                <hr><br>
                <small class="fs-16 fw-300 ls-1">Manager ID: ${project.MGRid}</small><br><br>
                 
                <small class="fs-16 fw-300 ls-1">Project ID: ${project.pid}</small><br><br>
                <%-- <small class="fs-16 fw-300 ls-1">${employee.address}</small><br><br> --%>
                <small class="fs-16 fw-300 ls-1">Assigned on: ${project.assignedOn}</small><br>
                <br>
            </div>
            
            <div class="media-right text-right d-none d-md-block" style="margin-left:850px;">
                <p class="fs-28 text-fade mb-12"></i> Deadline: ${project.deadline}</p>
                <span class="text-fade"><i class="fa fa-money pr-1"></i> Budget: $${project.budget}</span>
            </div>
        </div>
        <footer class="card-footer flexbox align-items-center">
            <div>
                <strong>Deadline:</strong>
                <span>${project.deadline}</span>
            </div>
            <div class="card-hover-show">
  
<!-- Trigger/Open The Modal -->
	<%-- 	<a class="button button3" href="editProject?id=${project.pid}" >Promotions/Bonus</a>
     --%>       		
                <a  class="button button2" href="#">Download Report   </a>
                
             <%--   <a class="button button3" href="mailto:${employee.email}?Subject=Hello%20${employee.fname}" target="_top"> Contact Proj. Manager</a> --%>
               <a class="button button4"  href="editProject?id=${project.pid}" >Update</a>
               <a class="button button5" href="deleteProject?id=${project.pid}">Delete</a>
                 
            </div>
        </footer>
    </div>

				  
			</c:forEach>

</frame>

		</table>
		<h4 align="right">
			 <a class="button button" href="newProject" >Create New Project</a>
		</h4>
		
	 
	</div>
    </header>

    <!-- jQuery -->
    <script src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

    <!-- Plugin JavaScript -->
    <script src="<c:url value="/resources/js/jquery.easing.min.js" />"></script>
    
    <!-- Custom Javascript -->
    <script src="<c:url value="/resources/js/custom.js" />"></script>
  
</body>

</html>
 