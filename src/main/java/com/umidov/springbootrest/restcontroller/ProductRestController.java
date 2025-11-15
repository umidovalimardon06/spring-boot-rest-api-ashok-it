package com.umidov.springbootrest.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/product")
public class ProductRestController {

    /*
    * 1.@RequestParam
    * 2.@PathVariable
    *
    * */


    // no-order.
    @GetMapping("/getProduct")
    public String showData1(
            @RequestParam("name") String name
    ){
        System.out.println(name);
        return "Check your console";
    }


    // we should maintain same order.
    @GetMapping("/getProduct/{id}")
    public String showData2(
            @PathVariable("id") Integer id
    ){
        System.out.println(id);
        return "Check your console";
    }

    @GetMapping("/details")
    public ResponseEntity<String> showHeaders(
            @RequestHeader(value="Content-Length",required=false) String len
    ){
        System.out.println(len);
        return new ResponseEntity<>("done", HttpStatus.OK);
    }


}

//www.youtube.com/watch?v=aaQ9HgNBx28

/*
*   REQUEST HEADER USE CASES:
*   1.Authentication & authorization
*   2.Accept header
*   3.Content-type
*   4.Cookies-header
*   5.
*
* */










