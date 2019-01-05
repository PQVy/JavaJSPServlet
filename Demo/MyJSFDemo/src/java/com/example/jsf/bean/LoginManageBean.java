/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

/**
 *
 * @author phamq
 */
//ManagedBean la co che phat trien dependence injection
@ManagedBean
public class LoginManageBean {
    private String username;
    private String password;
    
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Creates a new instance of LoginManageBean
     */
    public LoginManageBean() {
    }
    
    public void checkLogin(ActionEvent event){
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        
        if (username.equals(password)) {
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Hello", username);
            FacesContext.getCurrentInstance().addMessage(username, message);
        } else {
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error with", username);
            FacesContext.getCurrentInstance().addMessage(username, message);
        }
    }
}
