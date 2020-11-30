<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="index.css" rel="stylesheet" type="text/css">
<body>
<div class="set">
<form action="signup">
<div>
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
	<br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
	<br>
	<label for="pno"><b>Phone number</b></label>
    <input type="text" placeholder="Enter phone number" name="pno" required>
	<br>
    <button type="submit">signup</button>
    <br>
  </div>
</div>
</form>
</div>
</body>
</html>