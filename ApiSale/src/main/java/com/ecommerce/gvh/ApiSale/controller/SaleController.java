
package com.ecommerce.gvh.ApiSale.controller;

import com.ecommerce.gvh.ApiSale.dto.Purchase;
import com.ecommerce.gvh.ApiSale.dto.PurchaseResponse;
import com.ecommerce.gvh.ApiSale.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sale")
public class SaleController {
     @Autowired
     private SaleService saleService;
     
     @PostMapping("/placeSale")
    public PurchaseResponse placeSale(@RequestBody Purchase purchase){
        return saleService.placeSale(purchase);
    }
}
