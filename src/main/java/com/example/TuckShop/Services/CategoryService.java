package com.example.TuckShop.Services;

import com.example.TuckShop.Commons.ApiResponse;
import com.example.TuckShop.DTO.CategoryDTO;
import com.example.TuckShop.Models.Category;
import com.example.TuckShop.Repositories.CategoryRepository;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hassan on 1/21/2020.
 */
@Service
public class CategoryService {
    @Autowired
     CategoryRepository categoryRepository;

    public ApiResponse saveCategory(CategoryDTO categoryDTO){

        Category category = new Category();

        category.setName(categoryDTO.getName());
        category.setImage((categoryDTO.getImage()));
        categoryRepository.save(category);
        return new ApiResponse(200, "success",category);
    }
}
