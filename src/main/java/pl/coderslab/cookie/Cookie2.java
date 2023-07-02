package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie2", value = "/addToCookies")
public class Cookie2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        if (key.isEmpty()) {
            response.sendRedirect("/cookie2.html");
            return;
        }
        Cookie cookie = new Cookie(key, value);
        response.addCookie(cookie);
        response.sendRedirect("/cookie2.html");
    }
}
