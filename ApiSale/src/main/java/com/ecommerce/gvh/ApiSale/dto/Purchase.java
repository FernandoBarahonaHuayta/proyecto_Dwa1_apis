package com.ecommerce.gvh.ApiSale.dto;

import com.ecommerce.gvh.ApiSale.entity.Order;
import com.ecommerce.gvh.ApiSale.entity.OrderItem;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Purchase {
    Order order;
    Set<OrderItem> orderItems;
}
