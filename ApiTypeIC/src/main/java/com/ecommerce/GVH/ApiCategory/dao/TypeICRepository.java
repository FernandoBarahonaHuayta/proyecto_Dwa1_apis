package com.ecommerce.GVH.ApiCategory.dao;

import com.ecommerce.GVH.ApiCategory.entity.TypeIC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeICRepository extends JpaRepository<TypeIC, Long> {

    TypeIC findByIdCategory(String idCategory);
}
