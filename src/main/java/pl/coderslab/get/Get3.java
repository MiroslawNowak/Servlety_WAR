package pl.coderslab.get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Get3", value = "/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int width = Integer.parseInt(request.getParameter("width"));
            int height = Integer.parseInt(request.getParameter("height"));
            int answer;

            PrintWriter responseWriter = response.getWriter();
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= height; j++) {
                    answer = i * j;
                    responseWriter.append(String.format("%d * %d = %d ", i, j, answer)).println();
                }
            }
            responseWriter.close();
        } catch (NumberFormatException e) {
            for (int i = 1; i <= 5; i++){
                for (int j = 1; j <= 10; j++){
                    int randomAnswer = i * j;
                    response.getWriter().append(String.format("%d * %d = %d ", i, j, randomAnswer)).println();
                }
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
