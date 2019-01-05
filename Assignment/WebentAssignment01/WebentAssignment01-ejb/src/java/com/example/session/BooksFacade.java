/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Books;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author phamq
 */
@Stateless
public class BooksFacade extends AbstractFacade<Books> implements BooksFacadeLocal {

    @PersistenceContext(unitName = "WebentAssignment01-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BooksFacade() {
        super(Books.class);
    }

    @Override
    public List<Books> findByName(String bookname) {
        Query query = em.createNamedQuery("Books.findByBookname");
        query.setParameter("bookname", "%"+bookname+"%");
        
        try {
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Books> findByCode(String bookcode) {
        Query query = em.createNamedQuery("Books.findByBookcode");
        query.setParameter("bookcode", "%"+bookcode+"%");
        try {
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public void updateBook(String bookdescrip, String bookcode){
        Query query = em.createNamedQuery("Books.updateBookstatus");
        query.setParameter("bookdescrip", bookdescrip);
        query.setParameter("bookcode", bookcode);
        query.executeUpdate();
//        try {
//            return query.getResultList();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;        
    }

    
}
