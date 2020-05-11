<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 5/4/2020
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please add USER
    </div>

    <form method="post" action="/users">
        <label for="first-name">First Name
            <input class="input-field" type="text" id="first-name" name="first-name">
        </label>

        <label for="last-name">Last Name
            <input class="input-field" type="text" id="last-name" name="last-name">
        </label>

        <input class="input-field" type="submit" value="Add user">

    </form>
</div>

</body>
</html>
