<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Test Area Controller</title>
</head>
<body>
<%
    out.println("Area controller 测试用例！");
%>
<h3>${rows.toArray()}</h3>
<h4>${total}</h4>
</body>
</html>