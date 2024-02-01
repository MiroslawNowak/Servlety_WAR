<%--
  Created by IntelliJ IDEA.
  User: mnowak
  Date: 01.02.2024
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Przelicznik kilometrów na mile</title>
</head>
<body>
<h2>Przelicznik kilometrów na mile</h2>

<%-- Pobierz wartość parametru 'km' z paska adresu --%>
<c:set var="km" value="${param.km}" />

<%-- Sprawdź, czy parametr 'km' jest niepusty --%>
<c:choose>
    <c:when test="${not empty km}">
        <%-- Przelicz wartość kilometrów na mile --%>
        <c:set var="miles" value="${km * 0.62}" />

        <%-- Wyświetl wynik --%>
        <p>${km} kilometrów to ${miles} mile.</p>
    </c:when>
    <c:otherwise>
        <p>Brak wartości parametru 'km'.</p>
    </c:otherwise>
</c:choose>
</body>
</html>
