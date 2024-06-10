package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Persona;

import java.io.IOException;

/*
 * Servlet que controla la solicitud de información del cliente.
 */
@WebServlet("/servletcontrolador")
public class ServletControlador extends HttpServlet {


    /*
     * Método para el manejo de solicitudes POST.
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Capturar los datos del formulario de solicitud
        String nombre = req.getParameter("nombre");
        String sexo = req.getParameter("sexo");
        int edad = Integer.parseInt(req.getParameter("edad"));
        double sueldoMensual = Double.parseDouble(req.getParameter("sueldoMensual"));

        // Verificar si el sueldo mensual es mayor a $700
        if (sueldoMensual > 700) {
            // Crear objeto persona con los datos recibidos
            Persona persona = new Persona(nombre, sexo, edad, sueldoMensual);

            // Almacenar objeto persona en la sesión
            HttpSession session = req.getSession();
            session.setAttribute("persona", persona);

            // Redireccionar al usuario a la página de crédito
            RequestDispatcher rd = req.getRequestDispatcher("vistas/Credito.jsp");
            rd.forward(req, resp);
        } else {
            // Redireccionar al usuario al inicio si el sueldo es menor o igual a $700
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }
    }
}
