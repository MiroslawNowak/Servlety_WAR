package pl.coderslab.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session4", value = "/session4")
public class Session4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("item");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        CartItem cartItem = new CartItem(item,quantity,price);

        HttpSession session = request.getSession();

        List<CartItem> cartItemList = (List<CartItem>) session.getAttribute("cartItemList");

        if(cartItemList == null) {
            cartItemList = new ArrayList<>();
            session.setAttribute("cartItemList", cartItemList);
        }
        cartItemList.add(cartItem);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Zawartość koszyka:</h2>");
        double totalCost = 0.0;

        for (CartItem item2 : cartItemList) {
            out.println("Produkt: " + item2.getName() + " - " +
                    item2.getQuantity() + " x " + item2.getPrice() + "zł = " +
                    item2.getQuantity() * item2.getPrice() + "zł<br>");
            totalCost += item2.getQuantity() * item2.getPrice();
        }
        out.println("<br>SUMA: " + totalCost + "zł<br>");
        out.println("<a href=/session4.html>[Dodaj kolejny produkt]</a>");
        out.println("</body></html>");

        //session.setAttribute("cartItem", cartItem);


    }
}
