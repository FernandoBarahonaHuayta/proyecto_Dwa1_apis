package com.ecommerce.gvh.ApiSale.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Orders")
public class Order {
    // **** Propiedades privadas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Numero unico de indicador de Registro en la BD
    private Long orderId;
    // Identificador único del pedido
    private String trackingNumber;
    //Fecha del pedido
    private Date orderDate;
    // Estado del pedido (por ejemplo: "Pendiente", "En Proceso", "Completado")
    private String status;
    // Notas adicionales
    private String notes;

    // Cliente
    @Embedded
    private Customer customer;

    // Relacion - productos comprados por cliente
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems;

    // **** Metodos Adicionales
    public void addOrderItem(OrderItem orderItem) {
        if (orderItems == null) {
            orderItems = new HashSet<>();
        }
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
