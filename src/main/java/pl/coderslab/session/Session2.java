package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2", value = "/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/session2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();
       int grade = Integer.valueOf(request.getParameter("grade"));
        List<Integer> grades = new ArrayList<Integer>();
       if(session.getAttribute("grades") == null) {
           grades = new ArrayList<>();
       } else {
           grades = (List<Integer>) session.getAttribute("grades");
       }
        grades.add(grade);
       double average = calculateAverage(grades);
        session.setAttribute("grades", grades);

        response.getWriter().append("<h1>Grades</h1>");
        //response.getWriter().append(grades.toArray());
    }
    private double calculateAverage(List<Integer> integers) {
        int sum = 0;
        for (int value : integers) {
            sum = sum + value;

        }
        return (double) sum/ integers.size();
    }
}
