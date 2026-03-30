import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String ip = req.getRemoteAddr();
        String browser = req.getHeader("User-Agent");
        String server = req.getServerName();

        out.println("<h2>Client IP: " + ip + "</h2>");
        out.println("<h2>Browser: " + browser + "</h2>");
        out.println("<h2>Server: " + server + "</h2>");
    }
}
