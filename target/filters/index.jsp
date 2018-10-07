<html>
<head>
    <title>Customer registred</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.2/css/bootstrap.min.css">

</head>
<body>
<%--<div class="container">--%>
<%--<button type="button" formaction="/LoginServlet" class="btn btn-primary">Login</button>--%>
<%--<button type="button" formaction="/AuthoricationFilter" class="btn btn-secondary">Admin</button>--%>
<%--<button type="button" formaction="/LogoutServlet" class="btn btn-success">Logout</button>--%>
<%--</div>--%>
<div class="container">
    <a href="Login.jsp">
        <button type="button" class="btn btn-primary">Login</button>
    </a>
    <a href="Admin.jsp">
        <button type="button" class="btn btn-secondary">Admin</button>
    </a>
    <a href="/LogoutServlet">
        <button type="button" class="btn btn-success">Logout</button>
    </a>

</div>
</body>
</html>