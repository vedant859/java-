//html 
<html>
<body>
<form action="add" method="get">
    Enter Number 1: <input type="text" name="n1"><br><br>
    Enter Number 2: <input type="text" name="n2"><br><br>
    <input type="submit" value="Add">
</form>
</body>
</html>

  // java
  import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int n1 = Integer.parseInt(req.getParameter("n1"));
        int n2 = Integer.parseInt(req.getParameter("n2"));

        int sum = n1 + n2;

        out.println("<h2>Sum = " + sum + "</h2>");
    }
}


// xml
<web-app>

<servlet>
    <servlet-name>addServlet</servlet-name>
    <servlet-class>AddServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>addServlet</servlet-name>
    <url-pattern>/add</url-pattern>
</servlet-mapping>

</web-app>
