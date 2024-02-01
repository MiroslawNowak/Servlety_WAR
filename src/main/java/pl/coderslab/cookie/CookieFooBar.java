package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieFooBar", value = "/CookieFooBar")
public class CookieFooBar extends HttpServlet {
    private static final int ONE_DAY_IN_SECONDS = 86400;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("foo", "bar");
        cookie.setMaxAge(ONE_DAY_IN_SECONDS);
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
