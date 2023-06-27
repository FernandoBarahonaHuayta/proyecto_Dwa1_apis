
package com.ecommerce.GVH.ApiCategory.service;

import com.ecommerce.GVH.ApiCategory.entity.TypeIC;
import java.util.List;


public interface TypeICService {
    public List<TypeIC> findAll();
    public TypeIC findByIdCategory(String idCategory);
}
