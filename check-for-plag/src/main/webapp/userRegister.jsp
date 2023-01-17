<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Register</title>
</head>
<body>
<form action="userRegister" method="post">
 <table>
 <tr>
 <td>fullname</td>
 <td><input type="text" name="fullname"></td>
 </tr>
 <tr>
 <td>email</td>
 <td><input type="text" name="email"></td>
 </tr>
 <tr>
 <td>phone</td>
 <td><input type="text" name="phone"></td>
 </tr>
 <tr>
 <td> Opt for SMS Alert ?</td>
 <td><input type="checkbox" name="smsalert" value="yes">Yes
 <input type="checkbox" name="smsalert" value="no">No</td>
 </tr>
 <tr>
 <td>password</td>
 <td><input type="password" name="password"></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="User Register"></td>
 </tr>
 </table>
 </form>
</body>
</html>