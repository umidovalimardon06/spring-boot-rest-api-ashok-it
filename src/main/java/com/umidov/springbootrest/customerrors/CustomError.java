package com.umidov.springbootrest.customerrors;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;

@Data
@AllArgsConstructor
public class CustomError {
    private String date;
    private String msg;
    private Integer code;
}
