package com.ecommerce.GVH.ApiProduct.service;

import com.ecommerce.GVH.ApiProduct.dao.ProductRepository;
import com.ecommerce.GVH.ApiProduct.dto.ProductDTO;
import com.ecommerce.GVH.ApiProduct.dto.ProductDTO01;
import com.ecommerce.GVH.ApiProduct.entity.Inventory;
import com.ecommerce.GVH.ApiProduct.entity.Product;
import com.ecommerce.GVH.ApiProduct.entity.TypeIC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;
    @Autowired
    private ApiRestClient api;
    @Autowired
    private ApiRestClient_1 api1;

    @Override
    public Product add(Product product) {
        return repo.save(product);
    }

    @Override
    public ProductDTO findById(Long id) {

        Product prod = repo.findById(id).get();
        TypeIC type = api.findByIdCategory(prod.getIdCategory());

        ProductDTO pdto = new ProductDTO();
        pdto.setId(prod.getId());
        pdto.setProductName(prod.getProductName());
        pdto.setUnitPrice(prod.getUnitPrice());
        pdto.setTypeIC(type);

        return pdto;

    }

    @Override
    public ProductDTO01 findByIdSupplies(Long id) {
        Product prods = repo.findById(id).get();
        Inventory in = api1.findByIdSupplies(prods.getIdSupplies());
        ProductDTO01 pdto1 = new ProductDTO01();
        pdto1.setId(prods.getId());
        pdto1.setNameSupplies(prods.getNameSupplies());
        pdto1.setAmountSupplies(prods.getAmountSupplies());
        pdto1.setInventory(in);
        return pdto1;
        
    }
}
