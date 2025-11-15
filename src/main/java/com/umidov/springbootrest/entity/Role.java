package com.umidov.springbootrest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Role {
    private Integer roleId;
    private String roleName;
}
