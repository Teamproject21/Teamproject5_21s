<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>외박 신청:</h1>
<form action="addok" method="post">
<table id="edit">
<tr><td>외박(교내, 교외):</td><td><input type="text" name="title"/></td></tr>
<tr><td>신청자:</td><td><input type="text" name="writer"/></td></tr>
<tr><td>외박사유:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
<tr><td><a href="list">View All Records</a></td><td align="right"><input type="submit" value="add"/></td></tr>
</table>
</form>

</body>
</html>