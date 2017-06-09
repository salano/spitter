<%-- 
    Document   : home
    Created on : May 31, 2017, 12:45:11 PM
    Author     : salano
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <div class="spittleView">
            <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}" /></span>
            </div>
        </div>
    </body>
</html>
