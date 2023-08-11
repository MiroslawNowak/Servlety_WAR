package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie3", value = "/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        int time = Integer.parseInt(request.getParameter("time"));
        int timeInHours = time * 3600;

        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(timeInHours);

        response.setContentType("text/html");
        response.getWriter().println("Cookie created successfully.");
    }
}
