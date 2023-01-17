<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="instituteGroupRegister" method="post">
		<table>
			<tr>
				<td>group_type</td>
				<td><input type="text" name="group_type"></td>
			</tr>
			<tr>
				<td>group_name</td>
				<td><input type="text" name="group_name"></td>
			</tr>
			<tr>
				<td>admin_name</td>
				<td><input type="text" name="admin_name"></td>
			</tr>
			<tr>
				<td>group_email</td>
				<td><input type="text" name="group_email"></td>
			</tr>
			<tr>
				<td>username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>group_password</td>
				<td><input type="password" name="group_password"></td>
			</tr>
			<tr>
				<td>total_uploads</td>
				<td><input type="text" name="total_uploads"></td>
			</tr>
			<tr>
				<td>status</td>
				<td><input type="text" name="status"></td>
			</tr>
			<tr>
				<td>sub_start_date</td>
				<td><input type="text" name="sub_start_date"></td>
			</tr>
			<tr>
				<td>sub_end_date</td>
				<td><input type="text" name="sub_end_date"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Institute Group Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>