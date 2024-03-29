package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie4Del", value = "/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieToDel = request.getParameter("cookieName");
        if (cookieToDel != null && !cookieToDel.isEmpty()) {

            Cookie cookieToDelete = new Cookie(cookieToDel, "");
            cookieToDelete.setMaxAge(0);
            response.addCookie(cookieToDelete);

            response.sendRedirect("/showAllCookies");
        } else {
            response.getWriter().append("<h1>BŁĄD W NAZWIE COOKIE</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
