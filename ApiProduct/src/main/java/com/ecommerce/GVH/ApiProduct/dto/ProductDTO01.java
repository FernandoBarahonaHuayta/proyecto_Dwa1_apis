
package com.ecommerce.GVH.ApiProduct.dto;

import com.ecommerce.GVH.ApiProduct.entity.Inventory;
import lombok.Data;

@Data
public class ProductDTO01 {
    private Long id;
    private String idSupplies;
    private String nameSupplies;
    private Integer amountSupplies;
    private Inventory inventory;
}
