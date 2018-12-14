    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.da;

import com.example.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phamq
 */
public class ProductDataAccess {
    private PreparedStatement serchStatement;
    
    private PreparedStatement getSearchStatement() throws ClassNotFoundException, SQLException {
        if(serchStatement == null){
            Connection connection = new DBConnection().getConnection();
            serchStatement = connection.prepareStatement("SELECT pro_id, pro_name, pro_desc FROM ProductStore WHERE pro_name like ?");
        }
        return serchStatement;
    }
    
    public List<Product> getProductsByName(String name) {
        try{
            PreparedStatement statement = getSearchStatement();
            statement.setString(1, "%"+name+"%");
            ResultSet rs = statement.executeQuery();
            List<Product> products = new LinkedList<Product>();
            while(rs.next()){
                products.add(new Product(rs.getInt("pro_id"), rs.getString("pro_name"), rs.getString("pro_desc")));
            }
            
            return products;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
