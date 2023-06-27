package com.ecommerce.GVH.ApiProduct.service;

import com.ecommerce.GVH.ApiProduct.entity.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="client-rest",url="http://localhost:8088/")
public interface ApiRestClient_1 {
    @GetMapping("/api/inventory/findByIdSupplies/{idSupplies}")
    Inventory findByIdSupplies(@PathVariable String idSupplies);
}
