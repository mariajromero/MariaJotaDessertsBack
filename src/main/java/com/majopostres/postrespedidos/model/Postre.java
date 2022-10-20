package com.majopostres.postrespedidos.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Postre implements Serializable {
    //para relacionarlo a un atablba en bd
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
   private  Long id;
   private String name;
   private String description;
   private String image;
    private String category;


public Postre (){}
    public Postre(Long id, String name, String description, String image, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Postres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
