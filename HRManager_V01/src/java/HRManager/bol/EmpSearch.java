/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManager.bol;

import HRManager.dal.DAO;
import HRManager.entities.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamq
 */
public class EmpSearch {
    
    PreparedStatement ps;
    DAO dao = new DAO();
    
        public List<Employee> find(int option, String value) {
        String sql = "";
        switch (option) {
            case 0:
                sql = "select * from Employees where firstname=? or lastname=?";

                try {
                    ps = dao.getConnection().prepareStatement(sql);
                    ps.setString(1, value);
                    ps.setString(2, value);
                } catch (SQLException ex) {
                    Logger.getLogger(EmpSearch.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case 1:
                sql = "select * from Employees where city=?";
                try {
                    ps = dao.getConnection().prepareStatement(sql);
                    ps.setString(1, value);
                } catch (SQLException ex) {
                    Logger.getLogger(EmpSearch.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        
        List<Employee> list = new LinkedList();
        try {
            ResultSet rs = dao.executeQuery(ps);
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmployeeID(rs.getInt("EmployeeID"));
                e.setLastName(rs.getString("LastName"));
                e.setFirstName(rs.getString("FirstName"));
                e.setBirthDate(rs.getDate("BirthDate"));
                e.setHireDate(rs.getDate("HireDate"));
                e.setAddress(rs.getString("Address"));
                e.setCity(rs.getString("City"));
                e.setCountry(rs.getString("Country"));
                e.setHomePhone(rs.getString("HomePhone"));
                e.setMobile(rs.getString("Mobile"));
                e.setEmail(rs.getString("Email"));
                e.setPhotoPath(rs.getString("PhotoPath"));
                e.setNote(rs.getString("Note"));
                list.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            dao.closeConnection();
            return null;
        }
        dao.closeConnection();
        return list;
    }
    
}
