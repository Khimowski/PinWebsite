<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RegisterPage</title>
    </head>
    <body>
        <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
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
                        <form:label path="nickname">昵称</form:label>
                    </td>
                    <td>
                        <form:input path="nickname" name="nickname" id="nickname"/>
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
                        <form:button id="register" name="register">点击注册</form:button>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>