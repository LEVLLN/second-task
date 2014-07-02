<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:bundle basename="i18n.messages" prefix="index.">
    <html>
    <head>
        <title></title>
    </head>
    <body>
    <div>
        <form action="${pageContext.request.contextPath}/Controller" method="post">
         <textarea name="text">
            </textarea>

            <p><input type="submit" value="<fmt:message key="submit" />"/></p>
        </form>
    </div>
    </body>
    </html>
</fmt:bundle>