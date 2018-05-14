<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Admin panel</title>
    <link href="${contextPath}/src/main/webapp/resources/css/bootstrap.min.css" rel="stylesheet"/>
</head>

<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form action="${contextPath}/logout" id="logout" method="post">
            <form:input type="hidden" name="${_csrf.parameterName}" path="${_csrf.token}"/>
        </form>
    </c:if>
    <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
</div>

<script type="javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="javascript" src="${contextPath}/src/main/webapp/resources/js/bootstrap.min.js"></script>

</body>
</html>