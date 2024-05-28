<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminSignup</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background-color: #f5f5f5;
	margin: 0;
	font-family: Arial, sans-serif;
}

.signup-container {
	background-color: white;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

h2 {
	margin-bottom: 20px;
}

.form-group {
	margin-bottom: 15px;
	text-align: left;
}

input[type="text"], input[type="email"], input[type="password"] {
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
	margin-top: 5px;
}

.form-buttons {
	display: flex;
	justify-content: space-between;
}

button {
	padding: 10px 20px;
	background-color: #007bff;
	border: none;
	border-radius: 4px;
	color: white;
	font-size: 16px;
	cursor: pointer;
}

button[type="button"] {
	background-color: #6c757d;
}

button:hover {
	background-color: #0056b3;
}

button[type="button"]:hover {
	background-color: #5a6268;
}
</style>
</head>
<body>
	<div class="signup-container">
		<h2>Signup</h2>
		<form action="signup" method="post">
			<div class="form-group">
				<input type="text" name="name" placeholder="Enter Name"
					required="required">
			</div>
			<div class="form-group">
				<input type="email" name="email" placeholder="Enter Email"
					required="required">
			</div>
			<div class="form-group">
				<input type="password" name="password" placeholder="Enter Password"
					required="required">
			</div>
			<div class="form-buttons">
				<button type="submit">Create Account</button>
				<a href=""><button type="button">Cancel</button></a>
			</div>
		</form>
	</div>
</body>
</html>