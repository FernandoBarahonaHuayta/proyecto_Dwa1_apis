
package com.ecommerce.gvh.ApiPayment.controller;

import com.ecommerce.gvh.ApiPayment.dto.PurchaseResponse;
import com.ecommerce.gvh.ApiPayment.entity.Payment;
import com.ecommerce.gvh.ApiPayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    
     @PostMapping("/placePayment")
    public PurchaseResponse placePayment(@RequestBody Payment payment){
        return paymentService.placePayment(payment);
        
    }
}
