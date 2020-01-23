package com.example.TuckShop.DTO;

import com.example.TuckShop.Models.Category;

/**
 * Created by Hassan on 1/21/2020.
 */
public class ProductsDTO {
    String name;
    String description;
    String image;
    Double price;

    Category category;


    public ProductsDTO() {
    }

    public ProductsDTO(String name, String description, String image, Double price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
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
