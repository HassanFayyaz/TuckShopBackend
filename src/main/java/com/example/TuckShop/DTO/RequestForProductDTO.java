package com.example.TuckShop.DTO;

/**
 * Created by Hassan on 1/21/2020.
 */
public class RequestForProductDTO {

    String name;

    public RequestForProductDTO() {
    }

    public RequestForProductDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
