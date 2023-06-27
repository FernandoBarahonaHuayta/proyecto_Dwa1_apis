/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.gvh.ApiPayment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment {

    // **** Propiedades privadas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Numero unico de indicador de Registro en la BD
    private Long payment_id;
    //Fecha del Pago
    private Date payment_date;
    // Identificador único del pago
    private String trackingNumber;
    // Dirección de envío
    private String shipping_address;
    // Método de pago utilizado
    private String payment_method;
    // Numero del metodo de Pago
    private String payment_num;
    // Total del pago del pedido
    private BigDecimal amount;

    
}
