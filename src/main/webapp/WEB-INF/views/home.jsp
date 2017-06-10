<%-- 
    Document   : home
    Created on : May 31, 2017, 12:45:11 PM
    Author     : salano
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<h1>Welcome to Spittr</h1>
<a href="<c:url value="/spittles" />" class="btn btn-primary">Spittles</a> |
<a href="<c:url value="/spitter/register" />" class="btn btn-primary">Register</a>
<s:url value="/spitter/register" var="url" htmlEscape="true"/>
 <a href="${url}">Register</a>



