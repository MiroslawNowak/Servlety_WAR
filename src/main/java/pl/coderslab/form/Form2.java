package pl.coderslab.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.beans.Customizer;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@WebServlet(name = "Form2", value = "/post2")
public class Form2 extends HttpServlet {

    private final Set<String> swearWords = new HashSet<>();

    @Override
    public void init() throws ServletException {
        swearWords.add("Dupa");
        swearWords.add("cholera");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userInput = request.getParameter("userInput");
        String userAwere = request.getParameter("userAware");
        // Check for default checkbox value
        if (userAwere == null) {
            // Copy of user input
            String modifiedInput = userInput;

            // Check for swearWord
            for (String swearWord : swearWords) {
                if (modifiedInput.contains(swearWord)) {
                    modifiedInput = modifiedInput.replaceAll(swearWord, "*".repeat(swearWord.length()));
                }
            }
            var formattedResponse = formatOutput(modifiedInput);
            response.getWriter().write(formattedResponse);

            // Return will stop further execution of function
            return;
        }

        if (userAwere.equals("yes")) {
            response.getWriter().write(formatOutput(userInput));
        }
    }

    private String formatOutput(String output) {
        return String.format("<h1>%s</h1>", output);
    }
}
