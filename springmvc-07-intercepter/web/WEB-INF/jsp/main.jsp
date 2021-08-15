<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><span>
    ${username}
</span></h1>
<h1>欢迎你,这里是首页</h1>
<p>
    <a href="${pageContext.request.contextPath}/out">注销</a>
</p>
</body>
</html>
