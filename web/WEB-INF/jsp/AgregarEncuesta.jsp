<%-- 
    Document   : AgregarEncuesta
    Created on : Jun 23, 2015, 8:22:16 PM
    Author     : jiza
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserccion Correcta</title>
    </head>
    <body>
        <h1>Los datos se enviaron correctamente.</h1>
        ${mensaje}
        Gracias por colaborar.
    </body>
</html>
