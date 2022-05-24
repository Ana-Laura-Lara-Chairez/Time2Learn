/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dee Dee Gtz
 */
public class Conexion {
    
    private static final String servidor= "jdbc:mysql://localhost/time2learn";
    private static final String user="root";
    private static final String pass="";
    private static final String driver="com.mysql.jdbc.Driver";
    private static Connection conexion;
    
    public Conexion() {
    try {
        Class.forName(driver);
    conexion=DriverManager.getConnection(servidor,user,pass);
    System.out.println();
    
    } catch (ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, "No se a activado los servidores");
    }
    }
    public Connection getConnection(){
        return conexion;
    
    }
    
}
