package com.umidov.springbootrest.restcontroller;

import com.umidov.springbootrest.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/product")
public class ProductRestController {

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<String> getProductById(
            @PathVariable("id") Integer id
    ) {
        if (id == 150) {
            return new ResponseEntity<>("Exist", HttpStatus.OK);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }

}
