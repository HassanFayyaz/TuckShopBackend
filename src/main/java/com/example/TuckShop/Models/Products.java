package com.example.TuckShop.Models;

import javax.persistence.*;

/**
 * Created by Hassan on 1/21/2020.
 */

@Entity
public class Products {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    String image;
    Double price;

    @ManyToOne
    @JoinColumn(name = "categoryId",nullable = false)
    Category category;

    public Products() {
    }

    public Products(String name, String description, String image, Double price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
