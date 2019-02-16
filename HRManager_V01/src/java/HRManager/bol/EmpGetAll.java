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

/**
 *
 * @author phamq
 */
public class EmpGetAll {
     PreparedStatement ps;
    DAO dao = new DAO();
    
        public List<Employee> select() {
        String sql = "select * from Employees";

        List<Employee> list = new LinkedList();
        try {
            ResultSet rs = dao.executeQuery(sql);
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
