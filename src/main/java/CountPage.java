import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountPage", urlPatterns = "/count")
public class CountPage extends HttpServlet {
    private int hitCount;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String reset;
        reset = req.getParameter("reset");
        if(reset == null){
            res.setContentType("text/html");
            hitCount++;
            PrintWriter out = res.getWriter();
            String title = "Counts the total number of hits: ";
            out.println("<h1>" + title + hitCount + "</h1>");
        } else {
            hitCount = 0;
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            String title = "Counts the total number of hits: ";
            out.println("<h1>" + title + hitCount + "</h1>");
        }

    }

}
