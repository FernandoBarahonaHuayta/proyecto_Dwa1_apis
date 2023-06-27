package com.ecommerce.gvh.ApiSale.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable
public class Product {
    // Identificador del producto
    private Long product_id;
    // Nombre del producto
    private String product_name;
    // Precio unitario del producto
    private BigDecimal product_price;
    // Unidades disponibles de producto
    private int product_stock;
    // Sabor del helado
    private int product_category;


}
