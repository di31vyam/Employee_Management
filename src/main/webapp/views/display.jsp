<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<header style="height:95px; background-color:lightblue">
		<h3 style="text-align:center">Employee Management</h3>
		<br>
		<form action="home" style="float: right;" class="container">
			<div class="row">
				<div class="col-sm-8"></div>
				<label class="col-sm-2"><h4>Welcome <%=(String)request.getAttribute("user")%></h4></label>
				<div class="col-sm-2"> <input type="submit" value="Logout"> </div>
				
			</div>
		</form>
	</header>
	<br><br>
	<section>
		
		<div style="border:solid 1px" class="container-fluid">
		<br>
		<div class="row">
			<div class="col-sm-6">
			</div>
			<div class="col-sm-3">
				<form action="uploadC" method="post">
					<input type="hidden" value="<%=(String)request.getAttribute("user")%>" name="username">
					<input type="submit" value="Upload Employee Details">
				</form>
			</div>
			<div class="col-sm-3">
				<form action="download" method="get">
					<input type="submit" value="Download Employee Details">
				</form>
			</div>
		</div>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Employee Code</th>
					<th>Employee Name</th>
					<th>Location</th>
					<th>Email</th>
					<th>Date of Birth</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.getEmpcode()}</td>
						<td>${list.getName()}</td>
						<td>${list.getLoc()}</td>
						<td>${list.getEmail()}</td>
						<td>${list.getDob()}</td>
						<td>
							<form action="EditC" method="post">
								<input type="hidden" value="${list.getEmpcode()}" name="id">
								<input type="hidden" value="<%=(String)request.getAttribute("user")%>" name="username">
								<input type="submit" value="edit">
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</section>
	<br><br><br><br><br>
	<footer style="height:25px; text-align:center; background-color:lightblue"><h5>Nagarro Fresher Training</h5></footer>
</body>
</html>