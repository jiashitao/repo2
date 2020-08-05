<%--
  Created by IntelliJ IDEA.
  User: 62332
  Date: 2020/6/2
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/test">测试</a>
<a href="account/findAll">查询所有</a>
<hr/>
<form action="account/save" method="post">
    <input type="text" name="name">
    <input type="text" name="password">
    <input type="submit" value="提交">
</form>

</body>
</html>
