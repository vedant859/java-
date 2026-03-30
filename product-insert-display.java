import java.sql.*;

class ProductJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/college",
                    "postgres", "1234");

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS Product(" +
                "Pid INT PRIMARY KEY, Pname VARCHAR(50), Price DOUBLE PRECISION)");

            // Insert Records
            st.executeUpdate("INSERT INTO Product VALUES (1,'Pen',10)");
            st.executeUpdate("INSERT INTO Product VALUES (2,'Book',50)");
            st.executeUpdate("INSERT INTO Product VALUES (3,'Bag',500)");
            st.executeUpdate("INSERT INTO Product VALUES (4,'Shoes',800)");
            st.executeUpdate("INSERT INTO Product VALUES (5,'Watch',1500)");

            // Display Records
            ResultSet rs = st.executeQuery("SELECT * FROM Product");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getDouble(3));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
