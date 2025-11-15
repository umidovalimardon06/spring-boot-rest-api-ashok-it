package com.umidov.springbootrest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String userRole;
    private Set<String> permissions;
    private Map<String,String> models;
    @JsonIgnore
    private String password;
}
