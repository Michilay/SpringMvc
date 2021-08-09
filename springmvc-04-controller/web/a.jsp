<%--
  Created by IntelliJ IDEA.
  User: Michilay
  Date: 2021/8/7
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/add2/1/2" method="post">
        <text>1+2的post请求</text>
        <input type="submit">
    </form>
    <h1>======================</h1>
    <form action="/add2/1/2" method="get">
        <text>1+2的get请求</text>
        <input type="submit">
    </form>

</body>
</html>
