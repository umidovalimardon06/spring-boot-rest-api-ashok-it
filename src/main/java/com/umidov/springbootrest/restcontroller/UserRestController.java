package com.umidov.springbootrest.restcontroller;

import com.umidov.springbootrest.entity.Role;
import com.umidov.springbootrest.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/v1/api/user")
public class UserRestController {

    @GetMapping("/getOneUser")
    public ResponseEntity<User> getOneUser() {
        User u1 = User.builder()
                .id(1)
                .username("@tokyo")
                .userRole("capitan")
                .permissions(Set.of("Read", "Download"))
                .models(Map.of(
                        "MVX", "VUR1",
                        "CHT", "T71"
                ))
                .password("password123")
                .build();
        ResponseEntity<User> getResponse = new ResponseEntity<>(
                u1,
                HttpStatus.OK
        );
        return getResponse;
    }

    @GetMapping("/getAllRoles")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = Arrays.asList(
                new Role(1,"customer"),
                new Role(2,"owner")
        );

        ResponseEntity<List<Role>> getResponse = new ResponseEntity<>(
                roles, HttpStatus.OK
        );
        return getResponse;
    }


}
