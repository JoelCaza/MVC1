<%--
  Created by IntelliJ IDEA.
  User: Joel
  Date: 9/6/2024
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inicio</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
</head>
<body>
<div class="navbar">
    <a href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
    <a href="${pageContext.request.contextPath}/vistas/Solicitud.jsp">Solicitud</a>
    <a href="${pageContext.request.contextPath}/vistas/Credito.jsp">Crédito</a>
</div>
<div class="container">
    <div class="card">
        <h1>Bienvenido a Nuestro Banco</h1>
        <p>Por favor, seleccione una opción del menú.</p>
    </div>
</div>
</body>
</html>

