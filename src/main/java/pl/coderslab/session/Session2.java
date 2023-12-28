package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Session2", value = "/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int grade = Integer.parseInt(request.getParameter("grade"));
        List<Integer> grades;
        if (session.getAttribute("grades") == null) {
            grades = new ArrayList<>();
        } else {
            grades = (List<Integer>) session.getAttribute("grades");
        }
        grades.add(grade);
        double average = calculateAverage(grades);
        session.setAttribute("grades", grades);

        response.getWriter().append("<h1>GRADES</h1>");
        response.getWriter().append(Arrays.toString(grades.toArray()));
        response.getWriter().append("<h1>AVERAGE</h1>");
        response.getWriter().append(String.valueOf(average));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private double calculateAverage(List<Integer> integers) {
        int sum = 0;
        for (int value : integers) {
            sum = sum + value;

        }
        return (double) sum/ integers.size();
    }
}
