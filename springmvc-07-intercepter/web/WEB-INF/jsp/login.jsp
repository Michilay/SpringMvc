<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登陆页面</h1>
<form action="${pageContext.request.contextPath}/login">
    <p>
        用户名： <input type="text" name="username"/>
    </p>
    <p>
        密码： <input type="password" name="password"/>
    </p>
    <p>
        <input type="submit" value="登录"/>
    </p>
</form>
</body>
</html>
