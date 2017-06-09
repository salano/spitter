<%-- 
    Document   : home
    Created on : May 31, 2017, 12:45:11 PM
    Author     : salano
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css" />" >
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <link rel="stylesheet"
          href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    </head>
    <body>
        <script src="webjars/jquery/3.2.0/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <h1><s:message code="spittr.welcome" /></h1>
        <div class="container"><br/>

            <a href="/Spittr/spitter/register" class="btn btn-primary">Register</a>
            <div class="alert alert-success">
                <a href="#" class="close" data-dismiss="alert"
                  aria-label="close">×</a>
                <strong>Success!</strong> It is working as we expected.
            </div>
        </div>
        
        
        <c:forEach items="${spittleList}" var="spittle" >
        <li id="spittle_<c:out value="spittle.id"/>">
            <div class="spittleMessage">
                <c:out value="${spittle.message}" />
            </div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                <span class="spittleLocation">
                    (<c:out value="${spittle.latitude}" />,
                    <c:out value="${spittle.longitude}" />)</span>
            </div>
        </li>
    </c:forEach>
</body>
</html>
