import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>IP Address: " + req.getRemoteAddr() + "</h2>");
        out.println("<h2>Browser: " + req.getHeader("User-Agent") + "</h2>");
    }
}
