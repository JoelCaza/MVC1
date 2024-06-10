package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Credito;
import modelo.Persona;

import java.io.IOException;

/*
 * Servlet que maneja la solicitud de crédito.
 */
@WebServlet("/servletcredito")
public class ServletCredito extends HttpServlet {

    /*
     * Método para el manejo de solicitudes GET.
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Implementación para el método GET
    }

    /*
     * Método para el manejo de solicitudes POST.
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Capturar los datos del formulario de solicitud de crédito
        double monto = Double.parseDouble(req.getParameter("monto"));
        int plazo = Integer.parseInt(req.getParameter("plazo"));

        // Obtener objeto persona de la sesión
        HttpSession session = req.getSession();
        Persona persona = (Persona) session.getAttribute("persona");

        // Verificar si se ha realizado la solicitud previamente
        if (persona != null) {
            // Crear objeto crédito con los datos recibidos
            Credito credito = new Credito(monto, plazo);

            // Almacenar objeto crédito en la sesión
            session.setAttribute("credito", credito);

            // Redireccionar al usuario a la página de detalles de crédito
            RequestDispatcher rd = req.getRequestDispatcher("vistas/Credito.jsp");
            rd.forward(req, resp);
        } else {
            // Redireccionar al usuario al inicio si no se ha realizado la solicitud previamente
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }
    }
}
