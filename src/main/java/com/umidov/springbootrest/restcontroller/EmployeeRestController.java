package com.umidov.springbootrest.restcontroller;

import com.umidov.springbootrest.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/employee")
public class EmployeeRestController {

    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(
            @RequestBody Employee employee){

        String s = employee.toString();
        ResponseEntity<String> postResponse = new ResponseEntity<>(s, HttpStatus.OK);
        return postResponse;
    }

}
