<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:bundle basename="i18n.messages" prefix="result.">
<html>
<head>
    <title></title>
</head>
<body>
<p><fmt:message key="your.text"/> </p>
<p>${text}</p>
<form action="${pageContext.request.contextPath}/" method="get">
<p><input type="submit" value="<fmt:message key="back" />"/></p>
</body>
</html>
</fmt:bundle>