package com.briup.jd1914cms.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cms_link") //类名与数据库表名不一致加@Table

public class Link implements Serializable {

    @Id     //id为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长
    private int id;
    private String name;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
