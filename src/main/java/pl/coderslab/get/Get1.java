package pl.coderslab.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Get1", value = "/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try(PrintWriter responseWriter = response.getWriter()) {
        int start = Integer.parseInt(request.getParameter("start"));
        int end = Integer.parseInt(request.getParameter("end"));

        for (int i = start; i <= end; i++) {
            responseWriter.append(String.valueOf(i)).append(" ");
        }
    } catch (NumberFormatException e) {
        response.getWriter().append("<h1>BRAK</h1>");
    }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
