<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter-Otp</title>
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

.otp-container {
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

input[type="number"] {
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
	margin-top: 5px;
}

.form-buttons {
	display: flex;
	justify-content: center;
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

button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="otp-container">
		<h2>Enter OTP</h2>
		<form method="post" action="verify-otp">
			<input type="hidden" value="${pass}" name="id">
			<div class="form-group">
				<input type="number" placeholder="Enter OTP" name="otp" required>
			</div>
			<div class="form-buttons">
				<button type="submit">Submit</button>
			</div>
		</form>
	</div>
</html>