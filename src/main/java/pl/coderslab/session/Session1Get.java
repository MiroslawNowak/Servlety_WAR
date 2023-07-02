package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session1Get", value = "/session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if(session.getAttribute("counter") == null) {
            response.getWriter().write("<h1>EMPTY</h>");
        }
        int counter = (int)session.getAttribute("counter") + 1;
        session.setAttribute("counter", counter);
        response.getWriter().write("<h1>Counter: " + counter + "</h1>");
    }
}
