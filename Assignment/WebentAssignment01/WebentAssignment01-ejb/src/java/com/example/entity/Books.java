/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author phamq
 */
@Entity
@Table(name = "BOOKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b")
    , @NamedQuery(name = "Books.findByBookid", query = "SELECT b FROM Books b WHERE b.bookid = :bookid")
    , @NamedQuery(name = "Books.findByBookcode", query = "SELECT b FROM Books b WHERE b.bookcode like :bookcode")
    , @NamedQuery(name = "Books.findByBookname", query = "SELECT b FROM Books b WHERE b.bookname like :bookname")
    , @NamedQuery(name = "Books.findByBookauthor", query = "SELECT b FROM Books b WHERE b.bookauthor = :bookauthor")
    , @NamedQuery(name = "Books.findByBookstatus", query = "SELECT b FROM Books b WHERE b.bookstatus = :bookstatus")
    , @NamedQuery(name = "Books.updateBookstatus", query = "UPDATE Books b SET b.bookdescrip = :bookdescrip WHERE b.bookcode = :bookcode")
    , @NamedQuery(name = "Books.findByBookdescrip", query = "SELECT b FROM Books b WHERE b.bookdescrip = :bookdescrip")})
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOOKID")
    private Integer bookid;
    @Size(max = 10)
    @Column(name = "BOOKCODE")
    private String bookcode;
    @Size(max = 100)
    @Column(name = "BOOKNAME")
    private String bookname;
    @Size(max = 100)
    @Column(name = "BOOKAUTHOR")
    private String bookauthor;
    @Column(name = "BOOKSTATUS")
    private Boolean bookstatus;
    @Size(max = 200)
    @Column(name = "BOOKDESCRIP")
    private String bookdescrip;

    public Books() {
    }

    public Books(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Boolean getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(Boolean bookstatus) {
        this.bookstatus = bookstatus;
    }

    public String getBookdescrip() {
        return bookdescrip;
    }

    public void setBookdescrip(String bookdescrip) {
        this.bookdescrip = bookdescrip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.entity.Books[ bookid=" + bookid + " ]";
    }
    
}
