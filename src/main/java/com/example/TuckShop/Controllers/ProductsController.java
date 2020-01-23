package com.example.TuckShop.Controllers;

import com.example.TuckShop.Commons.ApiResponse;
import com.example.TuckShop.DTO.CategoryDTO;
import com.example.TuckShop.DTO.ProductsDTO;
import com.example.TuckShop.DTO.RequestForProductDTO;
import com.example.TuckShop.Models.RequestForProduct;
import com.example.TuckShop.Services.ProductsService;
import com.example.TuckShop.Services.RequestForProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Hassan on 1/21/2020.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    RequestForProductService requestForProductService;

    @Autowired
    ProductsService productsService;


    @PostMapping("/postreqproduct")
    public ApiResponse saveRequestForProduct(@RequestBody RequestForProductDTO requestForProductDTO){
        return requestForProductService.saveRequestForProduct(requestForProductDTO);
    }

    @PostMapping("/")
    public ApiResponse postRequest(@RequestBody ProductsDTO productsDTO){
        return productsService.saveProducts(productsDTO);
    }
}

