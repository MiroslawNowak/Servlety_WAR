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
        Cookie[] cookies = request.getCookies();
        PrintWriter resp = response.getWriter();
        resp.write("<h1> Active cookies: </h1>");
        for(Cookie cookie : cookies) {
            resp.append(String.format("<h2>Name: %s, Value: %s",cookie.getName(),cookie.getValue() + "</h2><br>"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
