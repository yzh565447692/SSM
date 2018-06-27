<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>我是title</title>
</head>

<h2>Hello World!</h2>
<hr size="12" color="blue"/>
<form action="${pageContext.request.contextPath}/show/showUserById.do">
   id:<input type="text" name="id" id="id">
    <input type="submit" value="提交">

</form>
</body>
</html>
