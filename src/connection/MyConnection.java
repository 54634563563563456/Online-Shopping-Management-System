package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection {
    public static final String USERNAME = "root"; // Set your MySQL username
    public static final String PASSWORD = "1234"; // Set your MySQL password
    public static final String URL = "jdbc:mysql://localhost:3306/online_shopping";
    public static Connection con = null;

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex,"",JOptionPane.WARNING_MESSAGE);
             
        }
        return con;
    }
}