<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html lang="en">
<head>
<meta charset="UTF-8">
<title>Log in form</title>
<style>
	p {
		color: red;
		margin: 0;
		padding: 0;
	}
</style>
</head>
<body>	
	<fieldset>
		<legend>Log In</legend>
		<p>${message }</p>
		<form action="login" method="post">
			<div>
				<label for="email">Email: </label>
				<input id="email" type="email" name = "email" required="required" />
			</div>
			<div>
				<label for="password">Password: </label>
				<input id="password" type="password" name="password" required="required"/>
			</div>
			<input type="submit" value="Log In"/>
		</form>	
	</fieldset>
	
</body>
</html>