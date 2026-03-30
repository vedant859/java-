import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class DateTimeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Date d = new Date();

        out.println("<h2>Current Date & Time: " + d + "</h2>");
    }
}

// xml
<servlet>
    <servlet-name>dateServlet</servlet-name>
    <servlet-class>DateTimeServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>dateServlet</servlet-name>
    <url-pattern>/date</url-pattern>
</servlet-mapping>
