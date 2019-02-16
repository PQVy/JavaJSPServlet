/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManager.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    private Connection cnn;
    private String driver;
    private String urlDriver;
    private String hostName;
    private String port;
    private String databaseName;
    private String userName;
    private String password;

    public DAO() {
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.urlDriver = "jdbc:sqlserver://";
        this.hostName = "localhost";
        this.port = "1433";
        this.databaseName = "HRManager";
        this.userName = "sa";
        this.password = "sa";
        this.openConnection();
    }

    public ResultSet executeQuery(PreparedStatement ps) throws SQLException {
        ResultSet rs = null;
        rs = ps.executeQuery();
        return rs;
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        if (cnn == null) {
            openConnection();
        }
        ResultSet rs = null;
        Statement stm = cnn.createStatement();
        rs = stm.executeQuery(sql);
        return rs;
    }

    public int executeUpdateQuery(PreparedStatement ps) {
        int resultCount = 0;
        try {
            resultCount = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection();
        }
        return resultCount;
    }

    public void openConnection() {
        try {
            Class.forName(this.driver);
            cnn = DriverManager.getConnection(this.urlDriver + this.hostName + ":" + this.port + ";databaseName=" + this.databaseName, this.userName, this.password);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        if (cnn == null) {
            openConnection();
        }
        return cnn;
    }

    public void closeConnection() {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException ex) {
            }
        }
    }

}
