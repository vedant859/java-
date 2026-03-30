import java.sql.*;

class DonarMetaData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/college",
                "postgres", "1234");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM DONAR");

            ResultSetMetaData rsmd = rs.getMetaData();

            int columns = rsmd.getColumnCount();

            System.out.println("Total Columns: " + columns);

            for(int i = 1; i <= columns; i++) {
                System.out.println("Column " + i + " Name: " + rsmd.getColumnName(i));
                System.out.println("Column " + i + " Type: " + rsmd.getColumnTypeName(i));
                System.out.println("----------------------");
            }

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
