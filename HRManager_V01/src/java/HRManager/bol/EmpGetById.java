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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamq
 */
public class EmpGetById {
  
    PreparedStatement ps;
    DAO dao = new DAO();

    public Employee getByID(int id) {
        String sql = "select * from Employees where EmployeeID=?";
        try {
            ps = dao.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            System.out.println(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmpGetById.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs = dao.executeQuery(ps);
            if (rs.next()) {
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
                return e;
            }
        } catch (SQLException ex) {
            dao.closeConnection();
            return null;
        }
        dao.closeConnection();
        return null;
    }

}
