import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class EmployeeSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Employee Form");

        JTextField t1 = new JTextField(); // Eno
        JTextField t2 = new JTextField(); // Name
        JTextField t3 = new JTextField(); // Designation
        JTextField t4 = new JTextField(); // Salary

        JButton b = new JButton("Submit");

        t1.setBounds(100, 50, 150, 20);
        t2.setBounds(100, 80, 150, 20);
        t3.setBounds(100, 110, 150, 20);
        t4.setBounds(100, 140, 150, 20);
        b.setBounds(100, 180, 100, 30);

        f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(b);

        b.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/college",
                        "postgres", "1234");

                String sql = "INSERT INTO Employee VALUES (?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setDouble(4, Double.parseDouble(t4.getText()));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(f, "Inserted Successfully!");

                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
