<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Intitute List</title>
</head>
<body>
	<form action="instituteListRegister" method="post"
		enctype="multipart/form-data">
		<table>
			<!-- <tr>
				<td>ins_group</td>
				<td><input type="text" name="ins_group"></td>
			</tr> -->
			<tr>
				<td>ins_group</td>
				<td><select name="ins_group">
						<option>Select</option>
						<%
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "welcome");
							Statement st = con.createStatement();
							String query = "select group_name from tbl_institute_group";
							ResultSet rs = st.executeQuery(query);

							while (rs.next()) {
						%>
						<option value="<%=rs.getString("group_name")%>"><%=rs.getString("group_name")%></option>
						<%
						}

						} catch (Exception e) {
						e.printStackTrace();
						}
						%>
				</select></td>
			</tr>

			<tr>
				<td>institute_name</td>
				<td><input type="text" name="institute_name"></td>
			</tr>
			<tr>
				<td>tbl_arr_ins_name</td>
				<td><input type="text" name="tbl_arr_ins_name"></td>
			</tr>
			<tr>
				<td>ins_admin_email</td>
				<td><input type="text" name="ins_admin_email"></td>
			</tr>
			<tr>
				<td>username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>admin_password</td>
				<td><input type="text" name="admin_password"></td>
			</tr>
			<!-- <tr>
				<td>quotes_exclude</td>
				<td><input type="text" name="quotes_exclude"></td>
			</tr>
			<tr>
				<td>exclude</td>
				<td><input type="text" name="exclude"></td>
			</tr>
			<tr>
				<td>applied</td>
				<td><input type="text" name="applied"></td>
			</tr>
			<tr>
				<td>exc_less_one</td>
				<td><input type="text" name="exc_less_one"></td>
			</tr> -->
			<tr>
				<td>upload_count_type</td>
				<td><input type="text" name="upload_count_type"></td>
			</tr>
			<tr>
				<td>no_of_users</td>
				<td><input type="text" name="no_of_users"></td>
			</tr>
			<tr>
				<td>max_upload</td>
				<td><input type="text" name="max_upload"></td>
			</tr>
			<tr>
				<td>upload_per_login</td>
				<td><input type="text" name="upload_per_login"></td>
			</tr>
			<!-- <tr>
				<td>total_uploads</td>
				<td><input type="text" name="total_uploads"></td>
			</tr>
			<tr>
				<td>max_img_uploads</td>
				<td><input type="text" name="max_img_uploads"></td>
			</tr>
			<tr>
				<td>total_img_uploads</td>
				<td><input type="text" name="total_img_uploads"></td>
			</tr> -->
			<tr>
				<td>images_path</td>
				<td><input type="file" name="images_path"></td>
			</tr>
			<tr>
				<td>submission_date</td>
				<td><input type="text" name="submission_date"></td>
			</tr>
			<tr>
				<td>s_end_date</td>
				<td><input type="text" name="s_end_date"></td>
			</tr>
			<tr>
				<td>status</td>
				<td><input type="text" name="status"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Institute List Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>