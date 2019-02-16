/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManager.bol;

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
public class EmpDelete {
        PreparedStatement ps;
    DAO dao = new DAO();
    
        public int delete(Employee e) {
        String sql = "DELETE FROM Employees WHERE EmployeeID=?";
        try {
            ps = dao.getConnection().prepareStatement(sql);
            ps.setInt(1, e.getEmployeeID());

        } catch (SQLException ex) {
            Logger.getLogger(EmpDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dao.executeUpdateQuery(ps);
    }
}
