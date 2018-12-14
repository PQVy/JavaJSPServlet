/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import com.example.da.ProductDataAccess;
import com.example.entity.Product;
import java.util.List;

/**
 *
 * @author phamq
 */
public class ProductFinderBean {
    private String keyword;

    public List<Product> getProducts() {
        return new ProductDataAccess().getProductsByName(keyword);
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
   
}
