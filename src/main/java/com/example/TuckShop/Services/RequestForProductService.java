package com.example.TuckShop.Services;

import com.example.TuckShop.Commons.ApiResponse;
import com.example.TuckShop.DTO.RequestForProductDTO;
import com.example.TuckShop.Models.RequestForProduct;
import com.example.TuckShop.Repositories.RequestForProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hassan on 1/21/2020.
 */

@Service
public class RequestForProductService {

    @Autowired
    RequestForProductRepository requestForProductRepository;

    public ApiResponse saveRequestForProduct(RequestForProductDTO requestForProductDTO){
        RequestForProduct requestForProduct= new RequestForProduct();
        requestForProduct.setName(requestForProductDTO.getName());
        requestForProductRepository.save(requestForProduct);
        return new ApiResponse(200,"success",requestForProduct);
    }
}
