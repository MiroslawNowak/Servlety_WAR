package pl.coderslab.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Get4", value = "/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter responseW = response.getWriter();
        Map<String, String[]> parameterMap = request.getParameterMap();
        responseW.append("<html><body><h1> Przekierowanie do strony get4").append("</h1>");
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            response.getWriter().append(String.format("%s - %s%n", entry.getKey(), Arrays.toString(entry.getValue())));
        }
        responseW.append("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
