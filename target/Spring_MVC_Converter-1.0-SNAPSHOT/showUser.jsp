<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_Converter
  File name(文件名): showUser
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/8
  Time(创建时间)： 21:56
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
您创建的用户信息如下：
<br/>
用户名：${user.name} <br/>
年龄：${user.age} <br/>
身高：${user.height}
</body>
</html>
