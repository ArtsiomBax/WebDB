<%@ page import="java.util.ArrayList" %>
<%@ page import="by.artbax.models.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 5/4/2020
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="/4JspExample_war/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please login!
    </div>

    <form method="post" action="/4JspExample_war/login">
        <label for="Name">User name
            <input class="input-field" type="text" id="Name" name="name">
        </label>

        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>

        <input class="input-field" type="submit" value="Sign UP">

    </form>
</div>

</body>
</html>
