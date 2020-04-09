package com.giassi.microservice.demo2.rest.users.dtos;

import com.giassi.microservice.demo2.rest.users.entities.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PermissionDTO implements java.io.Serializable {

    private Long id;
    private String permission;

    public PermissionDTO(Permission permission) {
        this.id = permission.getId();
        this.permission = getPermission();
    }

}
