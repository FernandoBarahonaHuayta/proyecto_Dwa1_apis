package com.ecommerce.gvh.ApiPayment.service;

import com.ecommerce.gvh.ApiPayment.dao.PaymentRepository;
import com.ecommerce.gvh.ApiPayment.dto.PurchaseResponse;
import com.ecommerce.gvh.ApiPayment.entity.Payment;
import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    @Transactional
    public PurchaseResponse placePayment(Payment payment) {
        payment.setTrackingNumber(getTrackingNumer());
        paymentRepository.save(payment);
        return new PurchaseResponse(payment.getTrackingNumber());
    }

    private String getTrackingNumer() {
        return UUID.randomUUID().toString();
    }

}
