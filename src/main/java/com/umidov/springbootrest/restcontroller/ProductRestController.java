package com.umidov.springbootrest.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/product")
public class ProductRestController {

    /*
    * 1.Fetch  resource
    * 2.Create resource
    * 3.Modify resource
    * 4.Remove resource
    * 5.Partial update resource
    * 6.
    * */

    // 1.Fetch resource
    @GetMapping("/getProduct")
    public ResponseEntity<String> getProduct(){
        ResponseEntity<String> getProductResponse = new ResponseEntity<>(
                "This is from GET",
                HttpStatus.OK
        );
        return getProductResponse;
    }

    // 2.Post resource
    @PostMapping("/saveProduct")
    public ResponseEntity<String> postProduct(){
        ResponseEntity<String> postProductResponse = new ResponseEntity<>(
                "This is from POST",
                HttpStatus.OK
        );
        return postProductResponse;
    }

    // 3.Modify resource
    @PutMapping("/updateProduct")
    public ResponseEntity<String> updateProduct(){
        ResponseEntity<String> putProductResponse = new ResponseEntity<>(
                "This is from PUT",
                HttpStatus.OK
        );
        return putProductResponse;
    }

    // 4.Delete resource
    @DeleteMapping("/deleteProduct")
    public ResponseEntity<String> deleteProduct(){
        ResponseEntity<String> deleteProductResponse = new ResponseEntity<>(
                "This is from DELETE",
                HttpStatus.OK
        );
        return deleteProductResponse;
    }

    // 5.Partial modify resource
    @PatchMapping("/patchProduct")
    public ResponseEntity<String> partialModifyProduct(){
        ResponseEntity<String> partialModifyProductResponse = new ResponseEntity<>(
                "This is from PATCH",
                HttpStatus.OK
        );
        return partialModifyProductResponse;
    }

}




