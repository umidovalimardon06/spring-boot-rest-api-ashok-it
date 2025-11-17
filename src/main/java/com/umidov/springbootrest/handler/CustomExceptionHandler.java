package com.umidov.springbootrest.handler;

import com.umidov.springbootrest.customerrors.CustomError;
import com.umidov.springbootrest.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<CustomError> showErrorMsg(
            ProductNotFoundException pnfe
    ){
        return new ResponseEntity<CustomError>(
                new CustomError(
                        new Date().toString(),
                        pnfe.getMessage(),
                        500
                ),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
