package pl.coderslab.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Form5", value = "/post5")
public class Form5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double tempValue = Double.parseDouble(request.getParameter("degrees"));

        String conversionType = request.getParameter("conversionType");
        PrintWriter resp = response.getWriter();

        if (conversionType.equals("FahrToCelc")){
            double tempCel = (tempValue - 32) * 5.0 / 9.0;
            resp.append("<h1>").append(String.format("%.2f", tempCel)).append("</h1>");
        }
        if (conversionType.equals("celcToFahr")){
            double tempFrh = (tempValue * 9.0 / 5.0) + 32.0;
            resp.append("<h1>").append(String.format("%.2f", tempFrh)).append("</h1>");
        }
    }
}
