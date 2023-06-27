package com.ecommerce.GVH.ApiInventory.dao;

import com.ecommerce.GVH.ApiInventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    Inventory findByIdSupplies(String idSupplies);
}
