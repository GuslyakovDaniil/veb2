package com.app.services;

import com.app.dtos.RolesDto;

import java.util.List;
import java.util.Optional;

public interface RolesService <ID> {
    RolesDto registerRoles(RolesDto roles);

    void expelRoles(RolesDto roles);

    void expelRoles(ID id);

    Optional<RolesDto> findRoles(ID id);

    List<RolesDto> getAll();
}
