import java.sql.*;

class CheckConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/college",
                    "postgres", "1234");

            if (con != null)
                System.out.println("Connection Successful!");
            else
                System.out.println("Connection Failed!");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
