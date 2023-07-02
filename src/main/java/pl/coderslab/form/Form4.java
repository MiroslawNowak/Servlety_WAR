package pl.coderslab.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@WebServlet(name = "Form4", value = "/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valueOfA = request.getParameter("a");
        int a = Integer.parseInt(valueOfA);
        String valueOfB = request.getParameter("b");
        int b = Integer.parseInt(valueOfB);
        String valueOfC = request.getParameter("c");
        int c = Integer.parseInt(valueOfC);

        double delta = pow(b, 2) - 4 * a * c;
        double x1;
        double x2;
        double x3;

        if (delta > 0)
        {
            x1 = (- b - sqrt(delta)) / (2 * a);
            x2 = (- b + sqrt(delta)) / (2 * a);
            response.getWriter().write("<h1>The graph of the function will intersect the x-axis at points " + x1 + " and " + x2 + "</h1>");
        }
        else if (delta == 0) {
            x3 = (- b) / (2 * a);
            response.getWriter().write("<h1>The graph of the function will intersect the x-axis at point " + x3 + "</h1>");
        }
        else
        {
            response.getWriter().write("<h1>no x-axis intersections</h1>");
        }
    }
}
