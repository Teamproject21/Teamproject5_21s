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
    <table id="add">
        <tr><td>호관:</td><td>
            <select id="dormname" name="dormname">
                <option value="은혜관">은혜관</option>
                <option value="로뎀관">로뎀관</option>
                <option value="하용조관">하용조관</option>
            </select>
        </td></tr>
        <tr><td>외박(교내, 교외):</td><td>
            <input type="radio" id='01' name="in_out" value="교내">
            <label for="01">교내</label><br>
            <input type="radio" id='02' name="in_out" value="교외">
            <label for="02">교외</label><br>
        </td></tr>
        <tr><td>학번:</td><td><input type="text" name="stdnum"/></td></tr>
        <tr><td>신청자:</td><td><input type="text" name="stdname"/></td></tr>
        <tr><td>호실:</td><td><input type="text" name="roomn"/></td></tr>
        <tr><td>외박사유:</td><td><textarea cols="50" rows="5" name="why"></textarea></td></tr>
        <tr><td>외박날짜:</td><td><input type="date" name="outdate"/></td></tr>
        <tr><td><a href="list">View All Records</a></td><td align="right"><input type="submit" value="add"/></td></tr>
    </table>
    <button type = "button" onclick="location.href='list'">목록보기</button>
    <button type = "submit">등록하기</button>
</form>

</body>
</html>