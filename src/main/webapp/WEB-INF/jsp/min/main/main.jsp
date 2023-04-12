<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023-04-12
  Time: 오후 2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <h1>Main Page</h1>
    <form action="/logout" method="post">
        <input hidden="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button type="submit">LogOut</button>
    </form>
</body>
</html>
