
package com.ecommerce.gvh.ApiSale.service;

import com.ecommerce.gvh.ApiSale.dto.Purchase;
import com.ecommerce.gvh.ApiSale.dto.PurchaseResponse;

public interface SaleService {
    public PurchaseResponse placeSale(Purchase payment);
}
