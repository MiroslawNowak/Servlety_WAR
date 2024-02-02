<%--
  Created by IntelliJ IDEA.
  User: mnowak
  Date: 01.02.2024
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Page 01 cookie</title>
    <link rel="stylesheet" type="text/css" href="styles/indexStyle.css" />
</head>
<body>
<%@ include file="header.jsp" %>

<c:set var="page1" value="${cookie.newPage01.value}"/>
<c:out value="${page1}" default="First visit page01."/>

<%@ include file="footer.jsp" %>
</body>
</html>
