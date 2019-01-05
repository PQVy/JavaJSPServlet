/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.entity.Books;
import com.example.session.BooksFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author phamq
 */
@WebService(serviceName = "ListBookService")
public class ListBookService {

    @EJB
    private BooksFacadeLocal booksFacade;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "ListBook")
    public List<Books> FillAll() {
        return booksFacade.findAll();
    }
    
    @WebMethod(operationName = "FindByName")
    public List<Books> FindByName(String bookName) {
        return booksFacade.findByName(bookName);
    }

    @WebMethod(operationName = "FindByCode")
    public List<Books> FindByCode(String bookCode) {
        return booksFacade.findByCode(bookCode);
    }
    
    @WebMethod(operationName = "UpdateStatusBook")
    public void updateStatusBook(String bookdescrip, String bookcode) {
        booksFacade.updateBook(bookdescrip, bookcode);
    }
}
