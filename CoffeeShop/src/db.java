
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nrmtr
 */
public class db {
    
    public static Connection mycon() {
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeShop?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false","root","12345");
//            
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//            
//        }
//        return null;
        try {
            String username = "root";
            String password = "12345";
            String sql = "jdbc:mysql://localhost:3306/coffeeShop?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false";
            
            Connection conn = (Connection) DriverManager.getConnection(sql,username,password);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

}
