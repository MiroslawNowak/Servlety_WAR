<%--
  Created by IntelliJ IDEA.
  User: mnowak
  Date: 01.02.2024
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<b:set var="a" value="${param.a}"/>
<b:out value="${a}" default="Nie podano parametru"/>

</body>
</html>
