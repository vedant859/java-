<%@ page import="java.util.*" %>

<html>
<body>

<%
    String name = request.getParameter("name");

    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);

    String msg;

    if(hour < 12)
        msg = "Good Morning";
    else if(hour < 18)
        msg = "Good Afternoon";
    else
        msg = "Good Evening";
%>

<h2><%= msg %>, <%= name %>!</h2>

</body>
</html>
