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
    <title>Show FooBar cookie</title>
    <link rel="stylesheet" type="text/css" href="styles/indexStyle.css" />
</head>
<body>
<%@ include file="header.jsp" %>

<c:set var="foo" value="${cookie.foo.value}"/>
<c:out value="${foo}" default="Brak ciasteczka"/>

<%@ include file="footer.jsp" %>
</body>
</html>
