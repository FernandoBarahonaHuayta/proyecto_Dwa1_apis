package com.ecommerce.GVH.ApiProduct.service;

import com.ecommerce.GVH.ApiProduct.dto.ProductDTO;
import com.ecommerce.GVH.ApiProduct.dto.ProductDTO01;

import com.ecommerce.GVH.ApiProduct.entity.Product;

public interface ProductService {
       public Product add (Product product);
       public ProductDTO findById(Long id);
       public ProductDTO01 findByIdSupplies(Long id);
}
