<%-- 
    Document   : persona
    Created on : 20/02/2017, 11:18:45 PM
    Author     : jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${info}!</h1>
        <h2>${profesor.nombre_profesor}</h2> 
        
        <c:forEach var="grupo" items="${profesor.grupos_profesor}">
            <h3>${grupo.nombre_grupo} </h3>
        
        </c:forEach>
    </body>
</html>