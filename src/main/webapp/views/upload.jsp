<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Update Employee Details</title>
</head>
<body>
	<header style="height:90px; text-align:center; background-color:lightblue" >
		<h2>Upload Employee Details</h2>
		<form action="home" style="float: right;" class="container">
			<div class="row">
				<div class="col-sm-8"></div>
				<label class="col-sm-2"><h4>Welcome <%=(String)request.getAttribute("user")%></h4></label>
				<div class="col-sm-2"> <input type="submit" value="Logout"> </div>
				
			</div>
		</form>
	</header>
	<section>
		<br>
		<div class="container" style="border:solid 1px">
            <div class="row">
                <div class="col-sm-10 offset-sm-1 text-center">
                    <div class="info-form">
                        <form action="Upload" method="post" class="justify-content-center"><br>
                        	<div class="row">
                        		<input type="hidden" name="user" value="<%=(String)request.getAttribute("user")%>">
                        		<label class="col-sm-3">Employee code <span class="text-danger">*</span></label>
                        		<div class="col-sm-5">
                        			<input type="number" class="form-control" name="id"  required>
                        		</div>
                        	</div><br>
                        	<div class="row">
                        		<label class="col-sm-3">Employee Name <span class="text-danger">*</span></label>
                        		<div class="col-sm-5">
                        			<input type="text" class="form-control" name="Name" pattern="[a-z0-9]{5,100}" title="Min 5 and max 100 characters" required>
                        		</div>
                        	</div><br>
                        	<div class="row">
                        		<label class="col-sm-3">Location <span class="text-danger">*</span></label>
                        		<div class="col-sm-5">
                        			<input type="text" class="form-control" name="Loc" pattern="[a-z0-9]{5,500}" title="Min 5 and max 100 characters" required>
                        		</div>
                        	</div><br>
                        	<div class="row">
                        		<label class="col-sm-3">Email <span class="text-danger">*</span></label>
                        		<div class="col-sm-5">
                        			<input type="text" class="form-control" name="email" required>
                        		</div>
                        	</div><br>
                        	<div class="row">
                        		<label class="col-sm-3">Date of Birth <span class="text-danger">*</span></label>
                        		<div class="col-sm-5">
                        			<input type="text" class="form-control" name="dob" required>
                        		</div>
                        	</div><br>
                        	<div class="row" >
                        		<div Style="text-align:center" class="col-sm-12"><input type="submit" class="btn btn-primary" value="Submit"></div>
                        	</div><br>
                        </form>
                    </div>
                    <br>
                </div>
            </div>
        </div>
	</section>
	<br><br>
	<footer style="height:25px; text-align:center; background-color:lightblue"><h5>Nagarro Fresher Training</h5></footer>
</body>
</html>