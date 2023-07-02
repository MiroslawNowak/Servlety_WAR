package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie1Set", value = "/setCookie")
public class Cookie1Set extends HttpServlet {
    public static final int ONE_DAY_IN_SECONDS = 86400;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("User", "CodersLab");
        cookie.setMaxAge(ONE_DAY_IN_SECONDS);
        response.addCookie(cookie);
    }
}
