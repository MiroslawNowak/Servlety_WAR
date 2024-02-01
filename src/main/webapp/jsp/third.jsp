<%--
  Created by IntelliJ IDEA.
  User: mnowak
  Date: 01.02.2024
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Get Params</title>
    <link rel="stylesheet" type="text/css" href="styles/indexStyle.css" />
</head>
<body>
<%@ include file="header.jsp" %>

<c:set var="a" value="${param.a}"/>
<c:set var="b" value="${param.b}"/>

<c:out value="${a}" default="Brak"/>
<c:out value="${b}" default="BraK"/>

<%@ include file="footer.jsp" %>
</body>
</html>
