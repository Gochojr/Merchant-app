/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trends;

import java.sql.*;
/**
 *
 * @author oracle
 */
public class Connections {
    public String DbName = "Trends";
    public String User = "root";
    public String Password = "root";
    public String Url = "jdbc:mysql://localhost/";
    public String driver ="com.mysql.jdbc.Driver";
    public Connection conn = null;
    public Statement st;
    public ResultSet rs;
    
    public void Connections(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(Url + DbName, User, Password);
            st = conn.createStatement();
                    System.out.println("connection has been created");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        }
    
}
