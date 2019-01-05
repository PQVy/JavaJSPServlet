/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author phamq
 */
public class WordCounter extends ActionSupport{
    
    private String text;
    private int count;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public WordCounter() {
    }
    
    @Override
    public String execute() throws Exception {
        //step 3
        //text ở đây bản chất là getText()
        if(text.trim().isEmpty()){
            return ERROR;
        }
        count = text.trim().split(" ").length;
        return SUCCESS;
    }
    
    
    
    
}
