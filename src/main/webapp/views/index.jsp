<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<header style="height:76px; text-align:center; background-color:lightblue">
		<h1>Login</h1>
	</header>
	<section>
		<div style="height: 80px"></div>
        <div class="container" >
            <div class="row">
                <div class="col-sm-10 offset-sm-1 text-center" style="border:solid 1px">
                    <div class="info-form">
                        <form action="login" method="post" class="form-inline justify-content-center">
                        	<br>           
                        	<br/>
                        	<br/><br/>
                            <div class="form-group row">
                                <label class="col-sm-4">User Id <span class="text-danger">*</span></label>
                                <div class="col-sm-5">
                                	<input type="text" class="form-control" name="userid" pattern="[a-z0-9]{4,50}"  required>
                                </div>
                            </div>
                            <br/>
                            <div class="form-group row">
                                <label class="col-sm-4">Password <span class="text-danger">*</span></label>
                                <div class="col-sm-5">
                                	<input type="password" class="form-control" name="password" pattern="[a-z0-9]{2,50}" required>
                                </div>
                            </div>
                            <div class="row">
                            	<% if((String)request.getAttribute("msg")!=null)
                            		{
                            	%>
                            	<div class="text-danger">Incorrect UserId or Password</div>
                            	<%	} %>
                            </div>
                            <br>
                            <button type="submit" class="btn btn-success ">Login</button>
                            <br>
                        </form>
                    </div>
                    <br>
                </div>
            </div>
        </div>
	</section>
	<br><br><br><br><br><br>
	<footer style="height:25px; text-align:center; background-color:lightblue"><h5>Nagarro Fresher Training</h5></footer>	
</body>
</html>