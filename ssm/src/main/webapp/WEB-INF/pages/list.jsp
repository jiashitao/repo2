<%--
  Created by IntelliJ IDEA.
  User: 62332
  Date: 2020/6/2
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询所有用户。。。。</h1>
<ol>
<c:forEach items="${list}" var="account">
    <li>${account.name}</li>
</c:forEach>
</ol>
</body>
</html>
