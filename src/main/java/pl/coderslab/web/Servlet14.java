package pl.coderslab.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet14", value = "/Servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String addressIp = request.getHeader("X-Forwarded-For");
        String remoteIp = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");
        if (addressIp == null) {
            response.getWriter().append("<h1>User IP is " + remoteIp + ", the browser is " + userAgent + " </h1>");
        } else {
            response.getWriter().append("<h1>User IP is " + addressIp + ", the browser is " + userAgent + " </h1>");
        }
    }

        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }

}
