<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_Converter
  File name(文件名): addUser
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/8
  Time(创建时间)： 21:53
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/converter"
      method="post">
    请输入用户信息（格式为姓名, 年龄,身高）:
    <input type="text" name="user"/>
    <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
