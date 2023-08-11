package pl.coderslab.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Form3", value = "/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("value");
        int intValue = Integer.parseInt(value);
        List<Integer> correctValues = new ArrayList<>();
        for (int i = 1; i <= intValue; i++) {
            if (intValue % i == 0) {
                correctValues.add(i);
            }
        }
        Object[] intArray = correctValues.toArray();
        response.getWriter().write(Arrays.toString(intArray));
    }
}
