package com.umidov.springbootrest.restcontroller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/book")
public class BookRestController {

    @GetMapping("/data")
    public ResponseEntity<String> show(){

        // header:
        HttpHeaders header = new HttpHeaders();
        header.add("MyApp","ACTIVATED-CLIENT");

        // body:
        String body = "SAMPLE BODY EXAMPLE";
        ResponseEntity<String> getResponse = new ResponseEntity<>(
                body,
                header,
                HttpStatus.OK
        );
        return getResponse;
    }

}
