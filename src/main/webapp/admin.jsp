<%--
  Created by IntelliJ IDEA.
  User: Dorota
  Date: 07.10.2018
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>AdminPanel</title>
</head>
<body>
<td>Username: </td>
<td> <%= session.getAttribute("user") %> </td>
<td>IP Adress: </td>
<td> <%= request.getRemoteAddr().toString() %> </td>
</body>
</html>