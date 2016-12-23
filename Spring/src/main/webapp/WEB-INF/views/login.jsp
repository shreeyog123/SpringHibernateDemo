<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>${headerMessage}</h1>

	<h1>LOGIN FORM</h1>

	<form action="loginFormSubmited.html" method="post">

		<table>
			<tr>
				<td>Username :</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>Password :</td>
				<td><input type="text" name="password"></td>
			</tr>

			<tr>
				<td>Mobile Number:</td>
				<td><input type="text" name="mobNumber"></td>
			</tr>

			<tr>
				<td>Date of Birth :</td>
				<td><input type="text" name="dob"></td>
			</tr>

		<!-- 	<tr>
				<td>Skill :</td>
				<td><select name="hobby" multiple="multiple">

						<option>Java</option>
						<option>Spring</option>
						<option>Hibernate </option>

				</select></td>
			</tr> -->
			
			<!-- <tr>
			<td> Address </td>
			<td> <input type="text" name="street"> </td>
			<td> <input type="text" name="area"> </td>
			<td> <input type="text" name="city"> </td>
			<td> <input type="text" name="pinCode"> </td>
			</tr>
 -->
			<tr>
				<td><input type="submit" value="SUBMIT"></td>

			</tr>
		</table>

	</form>


</body>
</html>