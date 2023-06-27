package com.ecommerce.GVH.ApiProduct.dto;

import com.ecommerce.GVH.ApiProduct.entity.TypeIC;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String productName;
    private Double unitPrice;
    private TypeIC typeIC;
      
 
}

