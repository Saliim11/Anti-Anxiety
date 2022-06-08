/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class DBConn {
    static final String DB_URL = "jdbc:mysql://localhost/db_anxiety";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public DBConn() {
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), 
                    "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(), 
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query (String SQLString){
        try {
            stmt.executeQuery(SQLString);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(), 
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
