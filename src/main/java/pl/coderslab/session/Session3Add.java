package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session3Add", value = "/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");
        HttpSession sess = request.getSession();


        List<String> keys = (List<String>) sess.getAttribute("keys");
        if(keys == null) {
            keys = new ArrayList<>();
            sess.setAttribute("keys", keys);
        }
        keys.add(key);
        sess.setAttribute(key, value);
        response.getWriter().append(String.format("<p>Dodano klucz %s o wartości %s</p>", key, value))
                .append("<p>wszystkie klucze:" + keys + "</p>");
    }
}
