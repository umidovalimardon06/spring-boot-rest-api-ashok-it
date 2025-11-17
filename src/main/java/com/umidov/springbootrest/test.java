package com.umidov.springbootrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class test {
    public static void main(String[] args) {
        ResponseEntity<String> response = new ResponseEntity<>(
                HttpStatus.OK
        );
        System.out.println(response.getStatusCode());
    }



}
