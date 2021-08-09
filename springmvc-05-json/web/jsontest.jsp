<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


    <script type="text/javascript">
        var user = {
            name:"michilay",
            age:21,
            sex:"男"
        };

        var s = JSON.stringify(user);
        console.log(s);
        var parse = JSON.parse(s);
        console.log(parse);

    </script>
</head>
<body>

</body>
</html>
