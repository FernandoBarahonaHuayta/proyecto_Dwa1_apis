package com.ecommerce.GVH.ApiProduct.controller;

import com.ecommerce.GVH.ApiProduct.entity.Product;
import com.ecommerce.GVH.ApiProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.GVH.ApiProduct.dto.ProductDTO;

@RestController
@RequestMapping("/GVH/product")


public class ProductController {
    @Autowired
    private ProductService productser;
    @PostMapping("add")
    public ResponseEntity<Product> add(@RequestBody Product product)
    {
        return new ResponseEntity<>(productser.add(product),HttpStatus.CREATED);
        
         
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id){
             return new ResponseEntity<>(productser.findById(id),HttpStatus.OK);
         }

   /* @GetMapping("/findByIdSupplies/{idSupplies}")
    public ResponseEntity<ProductDTO01> findByIdSupplies(@PathVariable String idSupplies)
    {
        return ResponseEntity<>(productser.findByIdSupplies(idSupplies),HttpStatus.);
    }
    ;*/
}
