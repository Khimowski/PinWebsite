<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 15824
  Date: 2025/9/16
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginPage</title>
</head>
<body>
    <form:form id="loginForm" modelAttribute="LoginForm" action="loginProcess" method="post">
        <table align="center">
            <tr>
                <td>
                    <form:label path="username">用户名</form:label>
                </td>
                <td>
                    <form:input path="username" name="username" id="username"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="password">密码</form:label>
                </td>
                <td>
                    <form:input path="password" name="password" id="password"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <form:button id="login" name="login">点击登录</form:button>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
