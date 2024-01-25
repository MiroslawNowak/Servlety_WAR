package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet(name = "Cookie52", value = "/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();

        try {
            for (Cookie cookie : cookies) {
                if (cookie.getValue().equals("cookie51")) {
                    out.write("<html><body><h1> Witaj na stronie cookie 52! </h1></body></html>");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    break;

                } else {
                    String message = "Nie odwiedziles jeszcze tej strony";
                    response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
                }
            }
        } catch (NullPointerException e) {
            String message = "Nie odwiedziles jeszcze tej strony";
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        }
    }
}
