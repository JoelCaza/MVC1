<%--
  Created by IntelliJ IDEA.
  User: Joel
  Date: 9/6/2024
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="modelo.Persona, modelo.Credito" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crédito</title>
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
        <%
            Persona persona = (Persona) session.getAttribute("persona");
            Credito credito = (Credito) session.getAttribute("credito");

            if (persona == null) {
        %>
        <p>No se ha realizado la solicitud.</p>
        <a href="${pageContext.request.contextPath}/index.jsp">Ir al Inicio</a>
        <%
        } else if (credito == null) {
        %>
        <h1>Crédito</h1>
        <form action="${pageContext.request.contextPath}/servletcredito" method="post">
            <label for="monto">Monto:</label>
            <input id="monto" type="number" name="monto" required />

            <label for="plazo">Plazo (12, 24, 36, 60 meses):</label>
            <input id="plazo" type="number" name="plazo" required />

            <input type="submit" value="Solicitar Crédito" />
        </form>
        <a href="${pageContext.request.contextPath}/index.jsp">Ir al Inicio</a>
        <%
        } else {
        %>
        <h1>Detalles del Crédito</h1>
        <p>Nombre del Cliente: <%= persona.getNombre() %></p>
        <p>Sexo del Cliente: <%= persona.getSexo() %></p>
        <p>Edad del Cliente: <%= persona.getEdad() %></p>
        <p>Sueldo Mensual del Cliente: <%= String.format("%.2f", persona.getSueldoMensual()) %></p>
        <p>Monto del Crédito: <%= String.format("%.2f", credito.getMonto()) %></p>
        <p>Plazo del Crédito: <%= credito.getPlazo() %> meses</p>
        <p>Total a Pagar: <%= String.format("%.2f", credito.calcularTotal()) %></p>
        <p>Pago Mensual: <%= String.format("%.2f", credito.calcularPagoMensual()) %></p>
        <a href="${pageContext.request.contextPath}/index.jsp">Ir al Inicio</a>
        <%
            }
        %>
    </div>
</div>
</body>
</html>


