<%-- 
    Document   : page
    Created on : Jun 9, 2017, 8:30:17 PM
    Author     : salano
--%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet"
              type="text/css"
              href="<s:url value="/resources/style.css" />" >
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <link rel="stylesheet"
              href="./webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <link rel="stylesheet"
              href="../webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    </head>
    <body>
        <div id="header">
            <t:insertAttribute name="header" />
        </div>

        <div id="content">
            <t:insertAttribute name="body" />
        </div>
        <div id="footer">
            <t:insertAttribute name="footer" />
        </div>
    </body>
</html>