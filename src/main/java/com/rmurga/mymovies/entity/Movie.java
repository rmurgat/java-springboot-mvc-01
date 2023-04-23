package com.rmurga.mymovies.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String description;
    private String image;
    @ManyToOne
    private Stocklist stocklist;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Stocklist getStocklist() {
        return stocklist;
    }

    public void setStocklist(Stocklist stocklist) {
        this.stocklist = stocklist;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", stocklist=" + stocklist.toString() +
                '}';
    }
}
