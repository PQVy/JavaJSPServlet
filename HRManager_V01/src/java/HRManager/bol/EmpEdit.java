/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManager.bol;

import HRManager.ConvertData;
import HRManager.dal.DAO;
import HRManager.entities.Employee;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamq
 */
public class EmpEdit {
    
    PreparedStatement ps;
    DAO dao = new DAO();
    
    public int edit(Employee e) {
        ConvertData cv = new ConvertData();
        String sql = "UPDATE Employees SET LastName=?, FirstName=?, BirthDate=?, HireDate=?, Address=?, City=?, Country=?,"
                + "HomePhone=?, Mobile=?, Email=?, PhotoPath=?, Note=? WHERE EmployeeID=?";
        try {

            ps = dao.getConnection().prepareStatement(sql);
            ps.setString(1, e.getLastName());
            ps.setString(2, e.getFirstName());
            ps.setString(3, cv.date2string(e.getBirthDate(), HRManager.ValidData.EN_DATE));
            ps.setString(4, cv.date2string(e.getHireDate(), HRManager.ValidData.EN_DATE));
            ps.setString(5, e.getAddress());
            ps.setString(6, e.getCity());
            ps.setString(7, e.getCountry());
            ps.setString(8, e.getHomePhone());
            ps.setString(9, e.getMobile());
            ps.setString(10, e.getEmail());
            ps.setString(11, e.getPhotoPath());
            ps.setString(12, e.getNote());
            ps.setInt(13, e.getEmployeeID());
            System.out.println("edit query" + sql);

        } catch (SQLException ex) {
            Logger.getLogger(EmpEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.executeUpdateQuery(ps);
    }
    
}
