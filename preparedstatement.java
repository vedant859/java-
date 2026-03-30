import java.sql.*;

class DeleteEmployee {
    public static void main(String[] args) {
        try {
            int id = Integer.parseInt(args[0]);

            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/college",
                    "postgres", "1234");

            String sql = "DELETE FROM Employee WHERE ENo = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted");
            else
                System.out.println("Record Not Found");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
