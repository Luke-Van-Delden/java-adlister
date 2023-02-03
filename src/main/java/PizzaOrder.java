import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String sausage = req.getParameter("sausage");
        String mushrooms = req.getParameter("mushrooms");
        String pepperoni = req.getParameter("pepperoni");
        String delivery = req.getParameter("delivery");

        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        if (pepperoni != null) {
            System.out.println("add " + pepperoni);
        }
        if (sausage != null) {
            System.out.println("add " + sausage);
        }
        if (mushrooms != null) {
            System.out.println("add " + mushrooms);
        }
        if (mushrooms == null && sausage == null && pepperoni == null){
            System.out.println("No toppings");
        }
        if (delivery != "") {
            System.out.println("Address = " + delivery);
        } else {
            System.out.println("Carryout");
        }
    }
}