
package com.ecommerce.GVH.ApiCategory.service;

import com.ecommerce.GVH.ApiCategory.dao.TypeICRepository;
import com.ecommerce.GVH.ApiCategory.entity.TypeIC;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeICServiceImpl implements TypeICService{

    @Autowired
    private TypeICRepository repo;
   
    @Override
    public TypeIC findByIdCategory(String idCategory) {
        return repo.findByIdCategory(idCategory); 
    }

    @Override
    public List<TypeIC> findAll() {
        return repo.findAll();
    }
    
}
