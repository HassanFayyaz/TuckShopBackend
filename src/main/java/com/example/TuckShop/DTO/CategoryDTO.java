package com.example.TuckShop.DTO;

import com.example.TuckShop.Models.Products;

import java.util.List;

/**
 * Created by Hassan on 1/21/2020.
 */
public class CategoryDTO {
    String name;
    String image;

    List<Products> products;


    public CategoryDTO() {
    }

    public CategoryDTO(String name, String image) {
        this.name = name;
        this.image = image;
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
