package com.briup.jd1914cms.bean;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "cms_customer")
public class Customer implements Serializable {
    private int id;
    private String username;
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
