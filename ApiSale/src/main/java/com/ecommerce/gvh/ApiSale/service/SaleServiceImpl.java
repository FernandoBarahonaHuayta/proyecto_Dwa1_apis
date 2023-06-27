
package com.ecommerce.gvh.ApiSale.service;

import com.ecommerce.gvh.ApiSale.dao.SaleRepository;
import com.ecommerce.gvh.ApiSale.dto.Purchase;
import com.ecommerce.gvh.ApiSale.dto.PurchaseResponse;
import com.ecommerce.gvh.ApiSale.entity.Order;
import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService{

    @Autowired
    SaleRepository saleRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeSale(Purchase purchase) {
        Order order = purchase.getOrder();
        order.setTrackingNumber(getTrackingNumer());
        purchase.getOrderItems().forEach(i->{
            order.addOrderItem(i);
        });
        saleRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }
    
    private String getTrackingNumer(){
        return UUID.randomUUID().toString();
    }
    
}
