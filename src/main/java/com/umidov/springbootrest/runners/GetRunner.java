package com.umidov.springbootrest.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetRunner implements CommandLineRunner {
    private final String URL_ALL = "https://dummyjson.com/products";
    private final String URL_SINGLE = "https://dummyjson.com/products/1";

    @Override
    public void run(String... args) throws Exception {
        getSingleProducts();
//        getAllProducts();
    }



    private void getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_ALL, String.class);

        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode().value());
    }

    private void getSingleProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(URL_SINGLE, String.class);

        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode().value());
    }
}









