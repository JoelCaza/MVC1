<%--
  Created by IntelliJ IDEA.
  User: Joel
  Date: 9/6/2024
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Solicitud</title>
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
        <h1>Solicitud de Crédito</h1>
        <form action="${pageContext.request.contextPath}/servletcontrolador" method="post">
            <label for="nombre">Nombre del Cliente:</label>
            <input id="nombre" type="text" name="nombre" required />
            <br/>
            <label for="sexo">Sexo del Cliente:</label>
            <input id="sexo" type="text" name="sexo" required />
            <br/>
            <label for="edad">Edad del Cliente:</label>
            <input id="edad" type="number" name="edad" required />
            <br/>
            <label for="sueldoMensual">Sueldo Mensual del Cliente:</label>
            <input id="sueldoMensual" type="number" name="sueldoMensual" required />
            <br/>
            <input type="submit" value="Enviar" />
        </form>
    </div>
</div>
</body>
</html>
