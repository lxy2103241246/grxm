<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2024/12/18
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>用户注册</title>
</head>
<body>
<h1>用户注册</h1>
<form action="registerServlet" method="POST">
  <label for="username">用户名：</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">密码：</label>
  <input type="password" id="password" name="password" required><br><br>

  <label for="email">电子邮件：</label>
  <input type="email" id="email" name="email" required><br><br>

  <input type="submit" value="注册">
</form>
</body>
</html>
