package com.example.TuckShop.Controllers;

import com.example.TuckShop.Commons.ApiResponse;
import com.example.TuckShop.DTO.CategoryDTO;
import com.example.TuckShop.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Hassan on 1/21/2020.
 */
@RestController
@CrossOrigin
@RequestMapping("/api/category")

public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/")
    public ApiResponse postRequest(@RequestBody CategoryDTO categoryDTO){
        return categoryService.saveCategory(categoryDTO);
    }
}
