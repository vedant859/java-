import java.sql.*;

class FirstRecord {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/college",
                    "postgres", "1234");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            if (rs.next()) {
                System.out.println("First Record:");
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
