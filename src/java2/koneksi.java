/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author ThinkPad X250
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url  = "jdbc:mysql://localhost:3306/dbpbo";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }   
        return conn;
        
    }
}

