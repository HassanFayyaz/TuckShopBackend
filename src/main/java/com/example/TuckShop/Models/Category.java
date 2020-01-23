package com.example.TuckShop.Models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hassan on 1/21/2020.
 */
@Entity
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String image;

    @OneToMany(mappedBy = "category")
    List<Products> products;

    public Category() {
    }

    public Category(Long id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

