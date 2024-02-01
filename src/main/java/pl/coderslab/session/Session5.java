package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Session5", value = "/Session5")
public class Session5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // Pobierz obiekt sesji
        HttpSession session = request.getSession();

        // Zapisz wyniki captchy do sesji
        session.setAttribute("captchaNumber1", number1);
        session.setAttribute("captchaNumber2", number2);

        // Wygeneruj stronę HTML z formularzem
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Formularz z Captchą</title></head><body>");
        out.println("<h2>Formularz z Captchą</h2>");
        out.println("<form action=\"/Session5\" method=\"post\">");
        out.println("<label>Imię: <input type=\"text\" name=\"firstName\"></label><br>");
        out.println("<label>Nazwisko: <input type=\"text\" name=\"lastName\"></label><br>");
        out.println("<label>Email: <input type=\"text\" name=\"email\"></label><br>");
        out.println("<label>Wpisz poniżej sumę: " + number1 + " + " + number2 + " = ");
        out.println("<input type=\"number\" name=\"captchaResult\" required></label><br>");
        out.println("<input type=\"submit\" value=\"Wyślij\">");
        out.println("</form></body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Pobierz parametry z formularza
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        int captchaResult = Integer.parseInt(request.getParameter("captchaResult"));

        // Pobierz obiekt sesji
        HttpSession session = request.getSession();

        // Pobierz z sesji wyniki captchy
        int captchaNumber1 = (int) session.getAttribute("captchaNumber1");
        int captchaNumber2 = (int) session.getAttribute("captchaNumber2");

        // Sprawdź, czy wpisany wynik zgadza się z wynikami captchy
        boolean captchaCorrect = captchaResult == (captchaNumber1 + captchaNumber2);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Confirmation Page</title></head><body>");

        if (captchaCorrect) {
            // Jeśli captcha jest poprawna, wyświetl informacje o użytkowniku
            out.println("<h2>Rejestracja zakończona sukcesem!</h2>");
            out.println("<p>Imię: " + firstName + "</p>");
            out.println("<p>Nazwisko: " + lastName + "</p>");
            out.println("<p>Email: " + email + "</p>");
        } else {
            // Jeśli captcha jest niepoprawna, wyświetl komunikat błędu
            out.println("<h2>Błąd: Nieprawidłowy wynik captchy.</h2>");
            out.println("<p>Proszę spróbować ponownie.</p>");
        }

        out.println("</body></html>");
    }
}
