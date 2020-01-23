package com.example.TuckShop.Repositories;

import com.example.TuckShop.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hassan on 1/21/2020.
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
