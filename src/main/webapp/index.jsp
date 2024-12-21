<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
<h1>用户登录</h1>
<form action="loginServlet" method="POST">
    <label for="username">用户名：</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">密 码：</label>
    <input type="password" id="password" name="password" required><br><br>

    <div>
        <input type="submit" value="登录" style="font-size: medium;-webkit-transition-duration: 0.4s;
 transition-duration: 0.4s;
 padding: 16px 32px;
 text-align: center;
 background-color: white;
 color: black;
 border: 2px solid #4CAF50;
 border-radius:5px;">
        <button name="注册" value="注册" style="font-size: medium;-webkit-transition-duration: 0.4s;
 transition-duration: 0.4s;
 padding: 16px 32px;
 text-align: center;
 background-color: white;
 color: black;
 border: 2px solid #4CAF50;
 border-radius:5px;" onclick="{location.href='register.jsp'}">
            注册
        </button>
    </div>

</form>
</body>
</html>
