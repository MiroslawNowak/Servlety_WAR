package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Session2", value = "/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Integer> grades = (List<Integer>) session.getAttribute("grades");
        PrintWriter out = response.getWriter();

        if (grades == null) {
            grades = new ArrayList<>();
            session.setAttribute("grades", grades);
        }
        int newGrade = Integer.parseInt(request.getParameter("grade"));

        grades.add(newGrade);

        double average = calculateAverage(grades);
        out.println("<html><body>");
        out.println("<h2> Dodano ocenę: " + newGrade + "</h2>");
        out.println("<h3> Aktualne oceny: " + grades + "</h3>");
        out.println("<h3> Średnia ocen: " + average + "</h3>");
        out.println("<form action='/session2' method='POST'>");
        out.println("Wpisz ocenę: <input type='number' name='grade'>");
        out.println("<input type='submit' value='Dodaj ocenę'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    private double calculateAverage(List<Integer> integers) {
        int sum = 0;
        for (int value : integers) {
            sum = sum + value;

        }
        return (double) sum/ integers.size();
    }
}
