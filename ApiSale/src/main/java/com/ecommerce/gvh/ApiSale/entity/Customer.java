
package com.ecommerce.gvh.ApiSale.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Customer {
    // Identificador del Cliente
    private Long customer_id;
    // Nombre del cliente
    private String customer_name;
    // Celular del Cliente
    private String customer_phone;
    // Correo del Cliente
    private String customer_email;
}
