<%@ page import="java.util.ArrayList" %>
<%@ page import="by.artbax.models.User" %><%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 5/4/2020
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>User Name</th>
        <th>Date of Birth</th>
    </tr>
    <% for (User user : users) {
    %>
    <tr>
        <td><%=user.getName()%>>
        </td>
        <td><%=user.getBirthDate()%>>
        </td>
    </tr>
    <% } %>
</table>

</body>
</html>
