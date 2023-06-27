
package com.ecommerce.GVH.ApiProduct.service;


import com.ecommerce.GVH.ApiProduct.entity.TypeIC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="client-rest",url="http://localhost:8083/")
public interface ApiRestClient {
     @GetMapping("/GVH/TypeIC/findByIdIC/{idCategory}")
     TypeIC findByIdCategory(@PathVariable String idCategory);
     

}
