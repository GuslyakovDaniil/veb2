package com.app.services;

import com.app.dtos.UsersDto;

import java.util.List;
import java.util.Optional;

public interface UsersService <ID> {
    UsersDto registerUsers(UsersDto users);

    void expelUsers(UsersDto users);

    void expelUsers(ID id);

    Optional<UsersDto> findUsers(ID id);

    List<UsersDto> getAll();
}
