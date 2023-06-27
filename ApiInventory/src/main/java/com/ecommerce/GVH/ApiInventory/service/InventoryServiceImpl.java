package com.ecommerce.GVH.ApiInventory.service;

import com.ecommerce.GVH.ApiInventory.dao.InventoryRepository;
import com.ecommerce.GVH.ApiInventory.entity.Inventory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private InventoryRepository inve;

    @Override
    public List<Inventory> findAll() {
         return inve.findAll();
    }

    @Override
    public Inventory findByIdSupplies(String idSupplies) {
        return inve.findByIdSupplies(idSupplies);
    }

    @Override
    public Inventory add(Inventory inventory) {
        return inve.save(inventory);
    }
   
}
