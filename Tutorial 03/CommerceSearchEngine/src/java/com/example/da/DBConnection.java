/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phamq
 */
public class DBConnection {
    private static Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if(connection == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Products", "sa", "sa");
        }
        
        return connection;
    }
}
