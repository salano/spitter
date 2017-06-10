<%-- 
    Document   : registerForm
    Created on : Jun 3, 2017, 8:27:56 PM
    Author     : salano
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

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