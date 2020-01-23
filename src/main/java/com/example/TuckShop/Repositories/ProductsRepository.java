package com.example.TuckShop.Repositories;

import com.example.TuckShop.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hassan on 1/21/2020.
 */
public interface ProductsRepository extends JpaRepository<Products,Long> {
}
