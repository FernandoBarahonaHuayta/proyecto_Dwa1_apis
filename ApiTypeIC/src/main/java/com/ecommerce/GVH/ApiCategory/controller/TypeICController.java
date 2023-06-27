
package com.ecommerce.GVH.ApiCategory.controller;

import com.ecommerce.GVH.ApiCategory.entity.TypeIC;
import com.ecommerce.GVH.ApiCategory.service.TypeICService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GVH/TypeIC")
public class TypeICController {
    @Autowired
    private TypeICService service;

    @GetMapping("/findByIdIC/{idCategory}")
    public ResponseEntity<TypeIC> findById(@PathVariable String idCategory) {
        return new ResponseEntity<>(
                service.findByIdCategory(idCategory), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity< List<TypeIC>> findAll() {
        return new ResponseEntity<>(
                service.findAll(), HttpStatus.OK);
    }
;
}
