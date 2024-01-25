package pl.coderslab.cookie;

import org.apache.logging.log4j.core.appender.WriterAppender;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cookie4Show", value = "/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie[] cookies = request.getCookies();
        PrintWriter resp = response.getWriter();

       if (cookies != null && cookies.length > 0) {

        resp.write("<h1> Active cookies: </h1>");

        for (Cookie cookie : cookies) {
            String cookieName = cookie.getName();
            resp.append(String.format("<h2>Name: %s, Value: %s", cookieName, cookie.getValue()))
                    .append("[<a href=\"/removeCookie?cookieName=")
                    .append(cookieName)
                    .append("\">Usun</a>]</h2>");
        }

        } else {
        resp.write("<h1>Brak cookies!</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
