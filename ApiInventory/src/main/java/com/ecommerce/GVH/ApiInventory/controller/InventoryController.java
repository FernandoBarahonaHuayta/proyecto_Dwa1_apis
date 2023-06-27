package com.ecommerce.GVH.ApiInventory.controller;

import com.ecommerce.GVH.ApiInventory.entity.Inventory;
import com.ecommerce.GVH.ApiInventory.service.InventoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {
    
    @Autowired
    private InventoryService inve;
    @GetMapping("/findAll")
    public ResponseEntity<List<Inventory>> findAll(){
        return new ResponseEntity<>(
                inve.findAll(),HttpStatus.OK
        );
    }
    @GetMapping("/findByIdSupplies/{idSupplies}")
    public ResponseEntity<Inventory> findByIdSupplies(
            @PathVariable String idSupplies){
        return new ResponseEntity<>(
                inve.findByIdSupplies(idSupplies),HttpStatus.OK
        );
    }
    
    @PostMapping("add")
    public ResponseEntity<Inventory> add(@RequestBody Inventory inventory)
    {
        return new ResponseEntity<>(inve.add(inventory),HttpStatus.CREATED);
    }
    
}
