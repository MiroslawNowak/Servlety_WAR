package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie1Get", value = "/showCookie")
public class Cookie1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Cookie[] cookies = request.getCookies();
       for (Cookie cookie : cookies) {
           if (cookie.getName().equals("User")) {
               response.getWriter().write(cookie.getValue());
           }
       }
    }
}
