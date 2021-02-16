<%@ page import="domain.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: greek
  Date: 16/02/2021
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2><% Student student = (Student) request.getAttribute( "result"); %>
    <%= student.getNaam()%>
    <%= student.getVoornaam()%>
    <%= student.getLeeftijd()
    <%= student.getStudierichting()%>
    %>
    </h2>
</body>
</html>