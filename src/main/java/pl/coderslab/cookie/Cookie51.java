package pl.coderslab.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie51", value = "/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Cookie cookie = new Cookie("User", "cookie51");
            response.addCookie(cookie);
            PrintWriter out = response.getWriter();
            out.append("<h1>Witaj na stronie cookie51!</h1>")
                    .append("<p>Odnosnik do <a href=/cookie52>Cookie52</a></p>");

        }
}
