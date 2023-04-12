<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023-04-12
  Time: 오후 3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Login Page</h1>
    <form action="/login" method="post">
        <input id="username" type="text" name="username">
        <input id="password" type="password" name="password">
        <input hidden="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button type="submit">Login</button>
    </form>
</body>
</html>
