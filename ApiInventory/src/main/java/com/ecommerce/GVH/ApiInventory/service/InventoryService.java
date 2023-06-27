package com.ecommerce.GVH.ApiInventory.service;

import com.ecommerce.GVH.ApiInventory.entity.Inventory;
import java.util.List;

public interface InventoryService {
    public List<Inventory> findAll();
    public Inventory findByIdSupplies(String idSupplies);
    
    public Inventory add(Inventory inventory);
    
}
