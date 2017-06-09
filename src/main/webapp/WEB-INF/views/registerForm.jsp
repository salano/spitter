<%-- 
    Document   : registerForm
    Created on : Jun 3, 2017, 8:27:56 PM
    Author     : salano
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="resources/style.css" />" >
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <link rel="stylesheet"
              href="../webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    </head>
    <body>
        <script src="../webjars/jquery/3.2.0/jquery.min.js"></script>
        <script src="../webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <h1>Register</h1>
        <sf:form method="POST" commandName="spitter">
           <sf:errors path="*" element="div" class="alert alert-danger" />
            First Name: <sf:input path="firstName" /><br/>
            
            Last Name: <sf:input path="lastName" /><br/>
            
            Email: <sf:input path="email" type="email"/><br/>
            
            Username: <sf:input path="username" /><br/>
           
            Password: <sf:password path="password" /><br/>
           
            <input type="submit" value="Register" class="btn btn-primary" />
        </sf:form>
    </body>
</html>