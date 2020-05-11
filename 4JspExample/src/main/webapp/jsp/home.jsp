<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 5/5/2020
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<span style="color: ${cookie.color.value}"><H1>Hello!</H1></span>
<form method="post" action="/4JspExample_war/home">
    <label for="color">
        <select name="color" id="color">
<option value="red">Red</option>
<option value="blue">Blue</option>
<option value="green">Green</option>
        </select>
    </label>
<input type="submit" value="color sent">
</form>
</body>
</html>
