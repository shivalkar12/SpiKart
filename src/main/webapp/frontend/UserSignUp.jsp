<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer_signup</title>
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

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"], input[type="email"], input[type="tel"], input[type="password"]
	{
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.form-buttons {
	display: flex;
	justify-content: space-between;
	margin-top: 20px;
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
		<form action="otpVerify" method="post">
			<div class="form-group">
				<label for="name">Name</label> <input type="text" id="name"
					name="name" placeholder="Enter Your Name" required="required">
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email" id="email"
					name="email" placeholder="Enter Your Email" required="required">
			</div>
			<div class="form-group">
				<label for="mobile">Mobile Number</label> <input type="tel"
					id="mobile" name="mobile" placeholder="Enter Your Mobile Number"
					required="required">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" placeholder="Enter Your Password"
					required="required">
			</div>
			<div class="form-buttons">
				<button type="submit">Create Account</button>
				<a href="customerlogin"><button type="button">Cancel</button></a>	
			</div>
		</form>
	</div>
</body>
</html>