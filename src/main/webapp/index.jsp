<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="index.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="set">
<form action="login"  method="post">
<div>
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
	<br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
	<br>
    <button type="submit">Login</button>
    <br>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <br>
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw"><a href="#">Forgot password?</a></span>
    <br>
    <span class="psw"><a href="signup.jsp">signup</a></span>
    <br>
    
  </div>
  </div>
</form>
</div>
</body>
</html>