package com.rmurga.mymovies.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stocklist")
public class Stocklist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String http_web;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHttp_web() {
        return http_web;
    }

    public void setHttp_web(String http_web) {
        this.http_web = http_web;
    }
}
