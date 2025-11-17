package com.umidov.springbootrest.exception;

public class ProductNotFoundException extends RuntimeException{

    private static final Long serialVersionUID = 1L;

    public  ProductNotFoundException(){
        super();
    }

    public  ProductNotFoundException(String message){
        super(message);
    }
}
