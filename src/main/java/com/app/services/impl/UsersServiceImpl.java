package com.app.services.impl;

import com.app.dtos.UsersDto;
import com.app.models.Roles;
import com.app.models.Users;
import com.app.repositories.RolesRepository;
import com.app.repositories.UsersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.services.UsersService;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UsersServiceImpl implements UsersService<Integer> {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UsersDto registerUsers(UsersDto users) {
        Users user = modelMapper.map(users, Users.class);

        Roles role = rolesRepository.findById(users.getRole_id())
                .orElseThrow(() -> new IllegalArgumentException("Error"));
        user.setRole(role);
        Users savedUser = usersRepository.save(user);
        return modelMapper.map(savedUser, UsersDto.class);
    }

    @Override
    public void expelUsers(UsersDto users) {

    }

    @Override
    public void expelUsers(Integer integer) {

    }

    @Override
    public Optional<UsersDto> findUsers(Integer integer) {
        return Optional.empty();
    }

    @Override
    public List<UsersDto> getAll() {
        return null;
    }

    // Остальные методы
}
