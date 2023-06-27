
package com.ecommerce.gvh.ApiPayment.service;

import com.ecommerce.gvh.ApiPayment.dto.PurchaseResponse;
import com.ecommerce.gvh.ApiPayment.entity.Payment;

public interface PaymentService {
    public PurchaseResponse placePayment(Payment purchase);
}
