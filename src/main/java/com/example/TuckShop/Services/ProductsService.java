package com.example.TuckShop.Services;

import com.example.TuckShop.Commons.ApiResponse;
import com.example.TuckShop.DTO.ProductsDTO;
import com.example.TuckShop.Models.Products;
import com.example.TuckShop.Repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hassan on 1/21/2020.
 */
@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    public ApiResponse saveProducts(ProductsDTO productsDTO){

        Products products = new Products();

        products.setName(productsDTO.getName());
        products.setDescription(productsDTO.getDescription());
        products.setPrice(productsDTO.getPrice());
        products.setImage(productsDTO.getImage());
        products.setCategory(productsDTO.getCategory());
        productsRepository.save(products);
        return new ApiResponse(200,"success",products);

    }
}
