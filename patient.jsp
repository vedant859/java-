<%@ page import="java.sql.*" %>

<html>
<body>

<h2>Patient Details</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Age</th>
</tr>

<%
    try {
        Connection con = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/college",
            "postgres","1234");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM Patient");

        while(rs.next()) {
%>
<tr>
    <td><%= rs.getInt(1) %></td>
    <td><%= rs.getString(2) %></td>
    <td><%= rs.getInt(3) %></td>
</tr>
<%
        }

        con.close();
    } catch(Exception e) {
        out.println(e);
    }
%>

</table>

</body>
</html>
