package com.ecommerce.GVH.ApiProduct.dao;

import com.ecommerce.GVH.ApiProduct.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
