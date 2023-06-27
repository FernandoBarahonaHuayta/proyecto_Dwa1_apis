
package com.ecommerce.gvh.ApiSale.dao;

import com.ecommerce.gvh.ApiSale.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Order, Long>{
    
}
